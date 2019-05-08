package ua.lpnuai.oop.zaremba03;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PathGetter {

    public static Path getPath(Scanner input, boolean filetypeXML) {
        Path p = Paths.get(System.getProperty("user.home"));
        while (true) {
            System.out.println(p);
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(p)) {
                int i = 1;
                ArrayList<String> foldersList = new ArrayList<>();
                for (Path file: stream) {
                    String check = file.getFileName().toString();
                    if (check.contains(".xml") || !check.contains(".")) {
                        System.out.printf("[%d] %s%n", i++, check);
                        foldersList.add(check);
                    }
                }
                System.out.printf("~[%d] return%n", i++);
                System.out.printf("~[%d] select XML file or create a new one%n", i);
                System.out.println("chose option or directory: ");
                int option = input.nextInt();
                if (option < 1 || option > i)
                    System.err.println("error");
                else if (option < i-1) {
                    if (Files.isDirectory(p.resolve(foldersList.get(option-1))))
                        p = p.resolve(foldersList.get(option-1));
                    else System.err.println("it isn't a directory");
                } else if (option == i-1)
                    p = p.getRoot().resolve(p.getParent());
                else {
                    if (filetypeXML == true) {
                        System.out.println("enter filename in format name.xml for XML files:");
                        input.nextLine();
                        String filename = input.nextLine();
                        if (filename.contains(".xml")) {
                            return p.resolve(filename);
                        } else System.err.println("wrong file format");
                    }
                    else{
                        System.out.println("enter filename:");
                        input.nextLine();
                        String filename = input.nextLine();
                        return p.resolve(filename);
                    }
                }
            } catch (IOException | DirectoryIteratorException x) {
                System.err.println("error!");
                return null;
            }
        }
    }
}
