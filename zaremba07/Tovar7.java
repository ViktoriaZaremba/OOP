package ua.lpnuai.oop.zaremba07;

import java.io.Serializable;
import java.util.ArrayList;

public class Tovar7 implements Serializable/*, Comparable <Tovar7>*/{
    private int id;
    private static int count = 0;
    private String tName;
    private String tVymir;
    private int tCina;
    private String Data;
    private ArrayList<String> Opys = new ArrayList<>();

    {
        id = count++;
    }

    public int getId(){
        return id;
    }

    public String getTName(){
        return tName;
    }
    public void setTName(String tName){ this.tName = tName;    }

    public String getTVymir(){
        return tVymir;
    }
    public void setTVymir(String tVymir){
        this.tVymir = tVymir;
    }

    public int getTCina(){
        return tCina;
    }
    public void setTCina(int tCina) {
        this.tCina = tCina;
    }

    public String getData(){
        return Data;
    }
    public void setData(String Data) {
        this.Data = Data;
    }


    public ArrayList<String> getOpys(){
        return Opys;
    }
    public void setOpys(String opys){
        //this.Opys = new ArrayList<>();
        Opys.add(opys);
    }

    /*@Override
    public int compareTo(Tovar7 o) {
        return this.getTName().compareTo(o.getTName());
    }*/
}
