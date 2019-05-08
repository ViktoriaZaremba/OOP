package ua.lpnuai.oop.zaremba04;

import java.io.Serializable;
import java.util.ArrayList;

public class Tovar4 implements Serializable {
    private String tName;
    //  private float tKilkist;
    private String tVymir;
    private String tCina;
    private ArrayList<String> Opys;

    public Tovar4() {

    }

    public Tovar4(String tName,/* float tKilkist,*/ String tVymir, String tCina) {
        this.tName = tName;
        //  this.tKilkist = tKilkist;
        this.tVymir = tVymir;
        this.tCina = tCina;
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

    public ArrayList<String> getOpys(){
        return Opys;
    }
    public void setOpys(String opys){
        Opys.add(opys);
    }

    /*  public float gettKilkist(){
        return tKilkist;
    }
    public void settKilkist(float tKilkist) {
        this.tKilkist = tKilkist;
    }*/

}
