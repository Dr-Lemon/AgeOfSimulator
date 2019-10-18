package House;

import PNJ.Bourgeois.Bourgeois;
import PNJ.PNJ;
import static Display.Display.*;
import PNJ.Wife.Wife;

import java.util.ArrayList;

public class House {

    private int item;
    private int humor;
    private static int MaxNumber;
    private String name;
    private static int Set = 0;
    private ArrayList<PNJ> CurrentPnj = new ArrayList<PNJ>();
    private ArrayList<PNJ> WPnj = new ArrayList<PNJ>();
    private ArrayList<PNJ> HPnj = new ArrayList<PNJ>();

    public static int getSet() {
        return Set;
    }

    public static void setSet(int set) {
        Set = set;
    }

    public static int getMaxNumber() {
        return MaxNumber;
    }

    public House() {
        this.name = "Maison sans type";
        this.item = 20;
        this.humor = 3;
        //Bourgeois Thierry = new Bourgeois();
        //Wife Phillipine = new Wife();

    }
    public void PushPNJ(PNJ pnj){
        this.CurrentPnj.add(pnj);
        if (pnj.getSexe() == "Homme"){
            this.HPnj.add(pnj);
        }
        if (pnj.getSexe() == "Femme"){
            this.WPnj.add(pnj);
        }
    }
    public int getNumberPNJ(){
        return this.CurrentPnj.size();
    }
    public int getNumberWPNJ(){
        return this.WPnj.size();
    }
    public int getNumberHPNJ(){
        return this.HPnj.size();
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

    public void finalize(){
        System.out.println(ANSI_RED + "Tous les habitants de cette maison sont parti" + ANSI_RESET);
        CurrentPnj.clear();
    }

    public void ChangeHumor(int i){
        switch (i){
            case (-1):
                if (this.humor == 1){this.finalize();}
                else{this.humor -=1;}
                break;
            case (1):
                if (this.humor == 3){}
                else{this.humor += 1;}
                break;
            }
        }



}
