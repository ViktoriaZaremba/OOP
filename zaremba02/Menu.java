package ua.lpnuai.oop.zaremba02;

import java.util.Scanner;

public class Menu {
    public void printMenu(){
        System.out.println("\n ______________________________" +
                "\n|            Menu:             |" +
                "\n| 1 - Fill container           |" +
                "\n| 2 - Container Methods        |" +
                "\n| 3 - Output container         |" +
                "\n| 4 - Save container           |" +
                "\n| 5 - Output saved container   |" +
                "\n| 6 - Iterate                  |" +
                "\n| 7 - Exit                     |"+
                "\n|______________________________|\n");

    }

    public static int makeChoice(){
        Scanner menu = new Scanner(System.in);
        int ch = menu.nextInt();
        return ch;
    }
}
