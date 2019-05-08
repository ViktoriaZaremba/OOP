package ua.lpnuai.oop.zaremba05;

import java.util.Scanner;

public class Menu {
    public void printMenu(){
        System.out.println("\n ______________________________" +
                "\n|            Меню:             |" +
                "\n| 1 - Додати товар             |" +
                "\n| 2 - Показати наявні товари   |" +
                "\n| 3 - Видалити товар           |" +
                "\n| 4 - Перейти до редагування   |" +
                "\n|     наявних товарів          |" +
                "\n| 5 - Записати до XML файлу    |" +
                "\n| 6 - Зчитати XML файл         |" +
                "\n| 7 - Вихід                    |"+
                "\n|______________________________|\n");

    }

    public static int makeChoice(){
        Scanner menu = new Scanner(System.in);
        int ch = menu.nextInt();
        return ch;
    }
}
