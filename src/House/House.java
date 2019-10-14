package House;

import PNJ.PNJ;

import java.util.ArrayList;

public class House {
    private int item;
    private int humor;
    private String name;
    private ArrayList<PNJ> Number_Pers;


    public House() {
        this.name = "Maison sans type";
        this.item = 20;
        this.humor = 3;
    }

    private int resources, MaxNumber;


    public int getRessources() {
        return resources;
    }

    public void setRessources(int ressources) {
        this.resources = ressources;
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
            this.humor -= 1;
        }
    }
}
