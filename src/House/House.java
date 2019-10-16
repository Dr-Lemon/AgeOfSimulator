package House;

import PNJ.Bourgeois.Bourgeois;
import PNJ.PNJ;
import PNJ.Wife.Wife;

import java.util.ArrayList;

public class House {
    private int item;
    private int humor;
    private int MaxNumber;
    private String name;
    private ArrayList<PNJ> CurrentPnj = new ArrayList<PNJ>();

    public House() {
        this.name = "Maison sans type";
        this.item = 20;
        this.humor = 3;
        //Bourgeois Thierry = new Bourgeois();
        //Wife Phillipine = new Wife();

    }
    public void PushPNJ(PNJ pnj){
        this.CurrentPnj.add(pnj);
    }
    public int getNumberPNJ(){
        return this.CurrentPnj.size();
    }

    public void Product(){
        for (int i = 0; i < this.CurrentPnj.size(); ++i) {
            PNJ PNJ = CurrentPnj.get(i); // ON POINTE VERS UN PNJ
            PNJ.Farm(3);
            PNJ.Eat(1);
            if(PNJ.getSocial()=="Poor"){
                this.item += PNJ.getRessources();
            }
            if(PNJ.getSocial()=="Bourgeois"){
                this.item += PNJ.getMoney();
            }

            PNJ.setRessources(0);
        }
    }


    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getMAXNUMBER() {
        return MaxNumber;
    }

    public void setMAXNUMBER(int MAXNUMBER) {
        this.MaxNumber = MAXNUMBER;
    }

//    public int getNumber_pers() {
//        //return number_pers;
//    }
//
//    public void setNumber_pers(int number_pers) {
//        this.number_pers = number_pers;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public void ChangeHumor(int i){
        if (i == -1) {
            // TEST SI HUMOR = 1 MAISON DISPARAIT
            this.humor -= 1;
        }
        if (i == 1) {
            //TEST SI HUMOR = 3 NE RIEN FAIRE
            this.humor += 1;
        }
    }


}
