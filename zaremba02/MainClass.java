package ua.lpnuai.oop.zaremba02;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.io.*;


public class MainClass implements Serializable{
        public static void main(String[] args) throws Exception{

         Menu men = new Menu();
         men.printMenu();
         int choice = men.makeChoice();

         List<String> Contain = new ArrayList<>();
         Scanner list = new Scanner(System.in);
         Scanner serv = new Scanner(System.in);

        while (choice != 7) {
                if (choice == 1) {

                        FillC fill = new FillC();
                        fill.filling(Contain);

                        men.printMenu();
                        choice = men.makeChoice();
                }


                if (choice == 2) {
                                System.out.println("\n ______________________________" +
                                        "\n|           Methods:           |" +
                                        "\n| 1 - toString                 |" +
                                        "\n| 2 - add                      |" +
                                        "\n| 3 - clear                    |" +
                                        "\n| 4 - remove                   |" +
                                        "\n| 5 - toArray                  |" +
                                        "\n| 6 - size                     |" +
                                        "\n| 7 - contains                 |" +
                                        "\n| 8 - sort                     |" +
                                        "\n| 9 - search                   |" +
                                        "\n| 10 - go back                 |" +
                                        "\n|______________________________|\n");
                        int ch1 = list.nextInt();
                        if (ch1 == 1) {             //using String.join
                                String result = String.join("; ", Contain);
                                System.out.println(result);
                        }
                        if (ch1 == 2) {
                                System.out.print("Srting to add: ");
                                String adds = serv.nextLine();
                                Contain.add(adds);
                        }
                        if (ch1 == 3) {
                                Contain.clear();
                        }
                        if (ch1 == 4) {
                                System.out.println("What to remove?" +
                                        "\n 1 - index \t 2 - item");
                                int rem = list.nextInt();
                                if (rem == 1) {
                                        int index = serv.nextInt();
                                        Contain.remove(rem);
                                } else if (rem == 2) {
                                        String item = serv.nextLine();
                                        Contain.remove(item);
                                }
                        }
                        if (ch1 == 5) {
                                Object[] array = Contain.toArray();
                                System.out.println(Arrays.toString(array));
                        }
                        if (ch1 == 6) {
                                System.out.println(Contain.size());
                        }
                        if (ch1 == 7) {
                                System.out.println("What item to chach? ");
                                String chack = serv.nextLine();
                                System.out.println(Contain.contains(chack));
                        }
                        if (ch1 == 8){
                                Collections.sort(Contain);
                        }
                        if (ch1 == 9){
                                System.out.print("What to search? ");
                                String toFind = serv.nextLine();
                                Object[] array = Contain.toArray();
                                String arr = Arrays.toString(array);
                                //System.out.println(array);
                                System.out.println(Arrays.binarySearch(array, toFind));
                        }
                        if (ch1 == 10){
                                men.printMenu();
                                choice = men.makeChoice();
                        }

                        men.printMenu();
                        choice = men.makeChoice();
                }

                if (choice == 3) {
                        System.out.println(Contain);

                        men.printMenu();
                        choice = men.makeChoice();
                }

                if (choice == 4){
                        System.out.println("Saving....");

                        Save save = new Save();
                        save.saving(Contain);

                        men.printMenu();
                        choice = men.makeChoice();
                }

                if (choice == 5){
                /*        Save out = new Save();
                        out.outputtig(Contain);*/
                        men.printMenu();
                        choice = men.makeChoice();

                }

                if (choice == 6){
                        Iterate.iter(Contain);


                        /*Iterator iterator = Contain.iterator();
                        while (iterator.hasNext()){
                                System.out.println(iterator.next());
                        }*/

                        men.printMenu();
                        choice = men.makeChoice();
                }


        }
         if (choice == 7){
                 System.out.println("Bye!");
         }
        }
}
