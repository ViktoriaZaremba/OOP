package ua.lpnuai.oop.zaremba04;

import java.util.Scanner;

public class Menu {
    public void printMenu(){
        System.out.println("\n ______________________________" +
                "\n|            Меню:              |" +
                "\n| 1 - Додати товар              |" +
                "\n| 2 - Показати список товарів   |" +
                "\n| 3 - Робота з контейнером      |" +
                "\n| 4 - Стандартна серіалізація   |" +
                "\n| 5 - Нестандартна серіалізація |" +
                "\n|     наявних товарів (XML)     |" +
                "\n| 6 - Вихід                     |"+
                "\n|_______________________________|");

    }

    public static int makeChoice(){
        Scanner menu = new Scanner(System.in);
        int ch = menu.nextInt();
        return ch;
    }
}
