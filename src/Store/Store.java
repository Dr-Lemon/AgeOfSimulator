package Store;

import House.Castle.Castle;
import House.Farm.Farm;
import House.House;
import Mayor.Mayor;
import PNJ.Bourgeois.Bourgeois;
import PNJ.PNJ;
import PNJ.Poor.Poor;
import PNJ.Wife.Wife;

import java.util.ArrayList;

public class Store {
    private static ArrayList<House> house = new ArrayList<House>();
    private static final int coastBourgeois = 10;
    private static final int coastPoor = 5;
    private static final int coastWife = 7;
    private static final int coastBourgeoisHouse = 20;
    private static final int coastPoorHouse = 20;

    public Store() {
        PNJ P1 = new Poor();
        PNJ P3 = new Wife();
        PNJ P4 = new Bourgeois();
        PNJ P5 = new Wife();
        House H1 = new Farm();
        House H2 = new Castle();
        house.add(H1);
        house.add(H2);
        H1.PushPNJ(P1);
        H1.PushPNJ(P3);
        H2.PushPNJ(P4);
        H2.PushPNJ(P5);
    }

    public static ArrayList<House> getHouse() {
        return house;
    }

    public static void setHouse(ArrayList<House> house) {
        Store.house = house;
    }

    public static int getCoastBourgeois() {
        return coastBourgeois;
    }

    public static int getCoastPoor() {
        return coastPoor;
    }

    public static int getCoastWife() {
        return coastWife;
    }

    public static int getCoastBourgeoisHouse() {
        return coastBourgeoisHouse;
    }

    public static int getCoastPoorHouse() {
        return coastPoorHouse;
    }

    public void addBourgeoisHouse(Mayor may){
        if(may.getMoney() < coastBourgeoisHouse ){
            System.out.println("Pas assez d'argent !");
        }
        else{
            Bourgeois y = new Bourgeois();
            Wife z = new Wife();
            Castle x = new Castle();
            x.setItem(20);
            house.add(x);
            x.PushPNJ(y);
            x.PushPNJ(z);

        }
    }

    public void addBourgeois(Mayor may){
        if(may.getMoney() < coastBourgeois ){
            System.out.println("Pas assez d'argent !");
        }
        else{
//            for (int i = 0; i < ; i++) {
//
//            }
            Bourgeois y = new Bourgeois();

        }
    }

    public void addPoorWife(Mayor may){
        if(may.getMoney() < coastWife ){
            System.out.println("Pas assez d'argent !");
        }
        else{
            Wife z = new Wife();
            for (int i = 0; i < house.size() ; i++) {
                House CurrentHouse = house.get(i);
                if (CurrentHouse.getNumberPNJ()< 9){CurrentHouse.PushPNJ(z);}
            }

        }
    }

    public void addBourgeoisWife(Mayor may){
        if(may.getMoney() < coastWife ){
            System.out.println("Pas assez d'argent !");
        }
        else{
            Wife z = new Wife();
            for (int i = 0; i < house.size() ; i++) {
                House CurrentHouse = house.get(i);
                if (CurrentHouse.getNumberPNJ()< 12){CurrentHouse.PushPNJ(z);}
            }

        }
    }

    public void addPoor(Mayor may){
        if(may.getMoney() < coastPoor ){
            System.out.println("Pas assez d'argent !");
        }
        else{
            for (int i = 0; i <house.size() ; i++) {
                House CurrentHouse = house.get(i);

            }
            Poor y = new Poor();

        }
    }

    public void addPoorHouse(Mayor may){
        if(may.getMoney() < coastPoorHouse ){
            System.out.println("Pas assez d'argent !");
        }
        else{
            Poor y = new Poor();
            Wife z = new Wife();
            Farm x = new Farm();
            house.add(x);
            x.PushPNJ(y);
            x.PushPNJ(z);

        }
    }

}
