package ua.lpnuai.oop.zaremba01;

import java.util.Scanner;

public class menu {


    public void printMenu(){
        System.out.println("\n ______________________________" +
                "\n|            Menu:             |" +
                "\n| 1 - vvedenya danyh           |" +
                "\n| 2 - perehlyad danyh          |" +
                "\n| 3 - vykonannya odchyslen     |" +
                "\n| 4 - vidobrajennya rezultaty  |" +
                "\n| 5 - zavershennya prohramy    |"+
                "\n|______________________________|\n");

    }

    public static int makeChoice(){
        Scanner menu = new Scanner(System.in);
        int ch = menu.nextInt();
        return ch;
    }

}
