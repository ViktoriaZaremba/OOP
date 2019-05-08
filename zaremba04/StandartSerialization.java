package ua.lpnuai.oop.zaremba04;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class StandartSerialization {

        public static void saving(LinkedList<Tovar4> Container, String fileName) throws Exception {
            System.out.println();
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
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


