package ua.lpnuai.oop.zaremba02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterate {

    public static void iter(List<String> Container){
        Iterator iterator = Container.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }

    }


}

