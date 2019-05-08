package ua.lpnuai.oop.zaremba02;

import java.awt.*;
import java.io.*;
import java.util.List;

public class Save {

    public static void saving(List<String> Container) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(Container);
        objectOutputStream.close();


        /*public static void outputtig() throws Exception{
            FileInputStream fileInputStream = new FileInputStream("tempFile");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            MainClass nMain = (MainClass) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(Container);*/
    }



}
