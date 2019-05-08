package ua.lpnuai.oop.zaremba07;

import ua.lpnuai.oop.zaremba03.PathGetter;
import ua.lpnuai.oop.zaremba05.RegExp;
import ua.lpnuai.oop.zaremba05.Tovar5;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Collections;


public class MainClass {

    public static void main(String[] args) {

        boolean autoMood = false;
        for(String arg: args){
            if(arg.equals("-auto")){
                autoMood = true;
                System.out.println("~~AUTO MODE ON~~");
            }
        }

        //виклик меню
        ua.lpnuai.oop.zaremba07.Menu men = new Menu();
        men.printMenu();
        int choice = men.makeChoice();

        Locale.setDefault(new Locale("uk", "UA"));
        Scanner scan = new Scanner(System.in);

        ArrayList<Tovar7> SpysokTovariv = new ArrayList<>();

        if (autoMood == true){
            try (XMLDecoder decoder = new XMLDecoder(
                    new BufferedInputStream(
                            new FileInputStream(PathGetter.getPath(scan, true).toString())))
            )
            {
                Integer size = (Integer) decoder.readObject();
                SpysokTovariv = new ArrayList<>();
                for( int i = 0; i < size; i++){
                    SpysokTovariv.add((Tovar7) decoder.readObject());
                }

            }
            catch (FileNotFoundException exception){
                System.err.println(exception.getMessage());
            }
            catch (NullPointerException e){
                System.err.println(e.getMessage());
            }
        }

        while (choice != 8){
            //Додати товар
            if (choice == 1){
                SpysokTovariv.add(new Tovar7());
                System.out.println("Новий товар створено!\n" +
                        "Індекс товару: " + SpysokTovariv.get(SpysokTovariv.size()-1).getId());
                int id = SpysokTovariv.get(SpysokTovariv.size()-1).getId();
                System.out.println("Введіть найменування товару, кількість, ціну і дату в форматі ДД.ММ.РРРР");
                System.out.print("Назва: ");
                SpysokTovariv.get(id).setTName(scan.nextLine());

                System.out.print("Кількість: ");
                SpysokTovariv.get(id).setTVymir(scan.nextLine());

                System.out.print("Ціна: ");
                int price = scan.nextInt();
                boolean check1 = RegExp.checkPrice(price);
                while (true) {

                    if (check1 == false) {
                        System.out.println("Неправильно введена ціна, спробуйте ще раз: ");
                        System.out.print("Ціна: ");
                        price = scan.nextInt();
                        check1 = RegExp.checkPrice(price);
                    } else {
                        SpysokTovariv.get(id).setTCina(price);
                        break;
                    }
                }

                System.out.print("Дата: ");
                String data = scan.next();
                SpysokTovariv.get(id).setData(data);
                boolean check = RegExp.checkData(data);
                while (true) {
                    if (check == false) {
                        System.out.println("Неправильно введена дата, спробуйте ще раз: ");
                        System.out.print("Дата: ");
                        data = scan.next();
                        check = RegExp.checkData(data);
                    } else {
                        SpysokTovariv.get(id).setData(data);
                        break;
                    }
                }

                System.out.print("Введіть кількість характеристик: ");
                int kilkistOp = scan.nextInt();
                String op = scan.nextLine();
                System.out.println("Введіть характеристики: ");
                for (int i = 0; i<kilkistOp; i++){
                    op = scan.nextLine();
                    SpysokTovariv.get(id).setOpys(op);
                }

                men.printMenu();
                choice = men.makeChoice();
            }
            //Показати наявні товари
            if (choice == 2){
                if(SpysokTovariv.size() == 0){
                    System.err.println("Не знайдено товарів");
                }
                System.out.println("Список усіх товарів:");
                for (int i = 0; i<SpysokTovariv.size(); i++){
                    System.out.println("\nІндекс\t" + SpysokTovariv.get(i).getId() +
                    "\nНазва\t" + SpysokTovariv.get(i).getTName() +
                    "\nК-ть\t" + SpysokTovariv.get(i).getTVymir()+
                    "\nЦіна\t" + SpysokTovariv.get(i).getTCina()+
                    "\nДата\t" + SpysokTovariv.get(i).getData()+
                    "\nОпис\t" + SpysokTovariv.get(i).getOpys());
                }

                men.printMenu();
                choice = men.makeChoice();
            }
            //Видалити товар
            if (choice == 3){
                System.out.println("Введіть індекс товару: ");
                int delIndex = scan.nextInt();
                if (delIndex > SpysokTovariv.size()){
                    System.out.println("Неправильний індекс");
                }
                SpysokTovariv.remove(delIndex-1);
                System.out.println("Готово!");

                men.printMenu();
                choice = men.makeChoice();
            }
            //Перейти до редагування наявних товарів
            if (choice == 4){
                System.out.print("Введіть індекс бажаного товару: ");
                int tovIndex = scan.nextInt();

                System.out.println("\n"+SpysokTovariv.get(tovIndex+1).getTName());
                System.out.println(SpysokTovariv.get(tovIndex+1).getTVymir() );
                System.out.println(SpysokTovariv.get(tovIndex+1).getTCina());
                System.out.println(SpysokTovariv.get(tovIndex+1).getOpys());

                if (tovIndex > SpysokTovariv.size()){
                    System.out.println("Неправильний індекс");
                }
                System.out.println("Меню управління:"+
                        "\n 1 - Змінити назву товару" +
                        "\n 2 - Змінити кількість" +
                        "\n 3 - Змінити ціну" +
                        "\n 4 - Змінити опис"+
                        "\n 5 - Повернутись до попереднього меню");
                int task = scan.nextInt();
                if (task == 1) {
                    System.out.println("Введіть нове ім'я");
                    String newName = scan.nextLine();
                    SpysokTovariv.get(tovIndex).setTName(newName);
                    System.out.println("Готово!");
                }
                if (task == 2) {
                    System.out.println("Введіть нову кількість");
                    float newKilkist = scan.nextFloat();
                    String newVymir = scan.nextLine();
                //    SpysokTovariv.get(tovIndex).settKilkist(newKilkist);
                    SpysokTovariv.get(tovIndex).setTVymir(newVymir);
                    System.out.println("Готово!");
                }
                if (task == 3) {
                    System.out.println("Введіть нову ціну");
                    int newCina = scan.nextInt();
                    SpysokTovariv.get(tovIndex).setTCina(newCina);
                    System.out.println("Готово!");

                }
                if (task == 4) {
                    System.out.println("Введіть кількість нових описів");
                    int newKilOpys = scan.nextInt();
                    System.out.println("Введітьнові описи");

                    for (int i = 0; i<newKilOpys; i++) {
                        String newOp = scan.nextLine();
                        SpysokTovariv.get(tovIndex - 1).setOpys(newOp);
                    }
                    System.out.println("Готово!");
                }
                if (task == 5) {
                    break;
                }

                men.printMenu();
                choice = men.makeChoice();
            }
            //відсортувати список наявних товарів
            if (choice == 5){
                System.out.println("Зроблено!");
                Collections.sort(SpysokTovariv, new Sort());

                men.printMenu();
                choice = men.makeChoice();
               /* Collections.sort(SpysokTovariv);
                break;*/
            }
            //Записати до XML файлу
            if (choice == 6){
                String str = PathGetter.getPath(scan, true).toString();
                System.out.println("Серіалізація в XML...");
                System.out.println(str);
                try (
                        XMLEncoder encoder = new XMLEncoder(
                                new BufferedOutputStream(
                                        new FileOutputStream(str)))
                )
                {
                    Integer size = SpysokTovariv.size();
                    encoder.writeObject(size);
                    for (Tovar7 i: SpysokTovariv) {
                        encoder.writeObject(i);
                    }
                }
                catch (Exception exc){
                    break;
                }
                System.out.print("Зроблено!\n");


                men.printMenu();
                choice = men.makeChoice();
            }
            //Зчитати XML файл
            if (choice == 7){
                System.out.println("Десеріалізація в об`єкт(и)...");

                try {
                    XMLDecoder decoder = new XMLDecoder(
                            new BufferedInputStream(
                                    new FileInputStream(PathGetter.getPath(scan, true).toString())));  //PathGetter.getPath - шлях до папки
                    Integer size = (Integer) decoder.readObject();
                    SpysokTovariv = new ArrayList<>();
                    for( int i = 0; i < size; i++){
                        SpysokTovariv.add((Tovar7) decoder.readObject());
                    }
                }
                catch (FileNotFoundException exception){
                    System.err.println(exception.getMessage());
                    break;
                }
                catch (NullPointerException e){
                    System.err.println(e.getMessage());
                    break;
                }
                men.printMenu();
                choice = men.makeChoice();
            }
        }
        //Вихід
        if (choice == 8){
            System.out.println("Бувай!");
        }

    }
}
