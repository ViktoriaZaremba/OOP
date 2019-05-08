package ua.lpnuai.oop.zaremba07;

import java.util.Comparator;

public class Sort implements Comparator<Tovar7> {
    @Override
    public int compare (Tovar7 a, Tovar7 b){
        return a.getTName().compareTo(b.getTName());
    }
}
