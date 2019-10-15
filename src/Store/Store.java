package Store;

import House.Castle.Castle;
import House.Farm.Farm;
import House.House;
import Mayor.Mayor;
import PNJ.Bourgeois.Bourgeois;
import PNJ.Poor.Poor;
import PNJ.Wife.Wife;

import java.util.ArrayList;

public class Store {

    private static final int coastBourgeois = 10;
    private static final int coastPoor = 5;
    private static final int coastWife = 7;
    private static final int coastBourgeoisHouse = 20;
    private static final int coastPoorHouse = 20;

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

    public void addBourgeoisHouse(Mayor may, ArrayList<House> house){
        if(may.getMoney() < coastBourgeoisHouse ){
            System.out.println("Pas assez d'argent !");
        }
        else{
            Bourgeois y = new Bourgeois();
            Wife z = new Wife();
            Castle x = new Castle();
            x.setRessources(20);
            house.add(x);

        }
    }

    public void addBourgeois(Mayor may, House hous){
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

    public void addWife(Mayor may, House hous){
        if(may.getMoney() < coastWife ){
            System.out.println("Pas assez d'argent !");
        }
        else{
            Wife z = new Wife();

        }
    }

    public void addPoor(Mayor may, House hous){
        if(may.getMoney() < coastPoor ){
            System.out.println("Pas assez d'argent !");
        }
        else{

            Poor y = new Poor();

        }
    }

    public void addPoorHouse(Mayor may, ArrayList<House> house){
        if(may.getMoney() < coastPoorHouse ){
            System.out.println("Pas assez d'argent !");
        }
        else{
            Poor y = new Poor();
            Wife z = new Wife();
            Farm x = new Farm();
            x.setRessources(20);
            house.add(x);

        }
    }

}
