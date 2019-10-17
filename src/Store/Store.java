package Store;

import Display.Display;
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
    private static Display affichage = new Display();
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
    public static void AskAddPNJ(House CurrentHouse, Mayor may, PNJ z){
        System.out.println(CurrentHouse + "       1- Oui 2- Non");
        affichage.IntegerTest();
        int choix = affichage.getIntegre();
        switch (choix){
            case (1) :
                CurrentHouse.PushPNJ(z);
                may.setMoney(may.getMoney() - z.getCoast());
                break;
            case (2) :
                break;
        }
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

    public void addBourgeoisHouse(Mayor may){ // Ajouter Maison de Bourgeois
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
            may.setMoney(may.getMoney() - coastBourgeoisHouse);
        }
    }

    public void addBourgeois(Mayor may){ // Ajouter un Bourgeois
        if(may.getMoney() < coastBourgeois ){
            System.out.println("Pas assez d'argent !");
        }
        else{
           Bourgeois z = new Bourgeois();
            System.out.println("Dans quelle maison voulez vous l'ajouter ?");
            for (int i = 0; i < house.size(); i++) {
                House CurrentHouse = house.get(i);
                if (CurrentHouse.getNumberPNJ() < 12 && CurrentHouse.getName() == "Chateau") {
                    AskAddPNJ(CurrentHouse, may, z);
                    System.out.println("Un Beau Blond à été ajouté");

                }
            }
        }
    }

    public void addBourgeoisWife(Mayor may){ // Ajouter une Bourgeoise
        if(may.getMoney() < coastWife ){
            System.out.println("Pas assez d'argent !");
        }
        else{
            Wife z = new Wife();
            System.out.println("Dans quelle maison voulez vous l'ajouter ?");
            for (int i = 0; i < house.size() ; i++) {
                House CurrentHouse = house.get(i);
                if (CurrentHouse.getNumberPNJ()< 12&& CurrentHouse.getName() == "Chateaux"){
                    AskAddPNJ(CurrentHouse, may,z);
                    System.out.println("Une Belle Blonde à été ajoutée");

                }
            }

        }
    }

    public void addPoorWife(Mayor may){ // Ajouter une Pauvre
        if(may.getMoney() < coastWife ){
            System.out.println("Pas assez d'argent !");
        }
        else{
            Wife z = new Wife();
            System.out.println("Dans quelle maison voulez vous l'ajouter ?");
            for (int i = 0; i < house.size() ; i++) {
                House CurrentHouse = house.get(i);
                if (CurrentHouse.getNumberPNJ()< 9&& CurrentHouse.getName() == "Ferme"){
                    AskAddPNJ(CurrentHouse, may,z);
                    System.out.println("Une Belle Brune à été ajoutée");

                }
            }

        }
    }



    public void addPoor(Mayor may) { // Ajoute un Pauvre
        if (may.getMoney() < coastPoor) {
            System.out.println("Pas assez d'argent !");
        } else {
            Poor z = new Poor();
            System.out.println("Dans quelle maison voulez vous l'ajouter ?");
            for (int i = 0; i < house.size(); i++) {
                House CurrentHouse = house.get(i);
                if (CurrentHouse.getNumberPNJ() < 9 && CurrentHouse.getName() == "Ferme") {
                    AskAddPNJ(CurrentHouse, may, z);
                    System.out.println("Un Beau Brun à été ajouté");

                }
            }
        }
    }

    public void addPoorHouse(Mayor may){ // Ajoute une maison de Pauvres
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
            may.setMoney(may.getMoney() - coastPoorHouse);

        }
    }

}
