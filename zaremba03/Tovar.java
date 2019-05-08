package ua.lpnuai.oop.zaremba03;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Tovar implements Serializable {
    private String tName;
    private String tVymir;
    private String tCina;
    private  String Data;
    private ArrayList<String> Opys;

    public Tovar() {

    }

    public Tovar(String tName, String tVymir, String tCina, String Data) {
        this.tName = tName;
        this.tVymir = tVymir;
        this.tCina = tCina;
        this.Data = Data;
        this.Opys = new ArrayList<>();
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
        Opys.add(opys);
    }
}
