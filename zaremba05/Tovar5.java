package ua.lpnuai.oop.zaremba05;

import java.io.Serializable;
import java.util.ArrayList;

public class Tovar5 implements Serializable {
    private int id;
    private static int count = 0;
    private String tName;
    private String tVymir;
    private String tCina;
    private String Data;
    private ArrayList<String> Opys = new ArrayList<>();

    {
        id = count++;
    }

    public int getId(){
        return id;
    }

    public Tovar5() {

    }

 /*   public Tovar5(String tName, String tVymir, String tCina, String Data) {
        this.tName = tName;
        this.tVymir = tVymir;
        this.tCina = tCina;
        this.Data = Data;
        this.Opys = new ArrayList<>();
    }*/

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

    public String getTCina(){
        return tCina;
    }
    public void setTCina(String tCina) {
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
}
