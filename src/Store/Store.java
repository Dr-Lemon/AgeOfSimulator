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
import static Display.Display.*;
import javax.swing.plaf.ColorUIResource;
import java.util.ArrayList;

public class Store {
    private static int x;
    private static int choix;
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
    public static void AskAddPNJ(House CurrentHouse, Mayor may, PNJ z, String fa){
        System.out.println( ANSI_GREEN +"1- Oui" + ANSI_RESET + ANSI_RED + "2- Non" + ANSI_RESET);
        affichage.IntegerTest();
        int choix = affichage.getIntegre();
        switch (choix){
            case (1) :
                CurrentHouse.PushPNJ(z);
                may.setMoney(may.getMoney() - z.getCoast());
                System.out.println(fa + " à été ajouté");
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

    public static void checkHouse(Mayor maire){
        for (int i = 0; i < house.size() ; i++) {
            House CurrentHouse = house.get(i);
           int NBRPNJ = CurrentHouse.getNumberPNJ();
           if (NBRPNJ == 0){
               System.out.println("Maison" + i + "Détruite");
               house.remove(i);
           }
           if(house.size() == 0){
               System.out.println("-1");
               maire.setMoney(-1);
           }
           else{};

        }
        System.out.println(house.size());

    }

    public void addBourgeoisHouse(Mayor may) { // Ajouter Maison de Bourgeois
        System.out.println("1 Continuer  2- Annuler");
        affichage.IntegerTest();
        choix = affichage.getIntegre();
        switch (choix) {
            case (1):
            if (may.getMoney() < coastBourgeoisHouse) {
                System.out.println("Pas assez d'argent !");
            } else {
                Bourgeois y = new Bourgeois();
                Wife z = new Wife();
                Castle x = new Castle();
                x.setItem(20);
                house.add(x);
                x.PushPNJ(y);
                x.PushPNJ(z);
                may.setMoney(may.getMoney() - coastBourgeoisHouse);
                System.out.println("Un Magnifique Chateau à été ajouté");
            }
            break;
            case (2): break;
        }
    }

    public void addBourgeois(Mayor may) { // Ajouter un Bourgeois
        System.out.println("1 Continuer  2- Annuler");
        affichage.IntegerTest();
        choix = affichage.getIntegre();
        switch (choix) {
            case (1):
                if (may.getMoney() < coastBourgeois) {
                    System.out.println("Pas assez d'argent !");
                } else {
                    Bourgeois z = new Bourgeois();
                    for (int i = 0; i < house.size(); i++) {
                        House CurrentHouse = house.get(i);
                        if (CurrentHouse.getNumberPNJ() < 12 && CurrentHouse.getName() == "Chateaux" && (CurrentHouse.getNumberHPNJ() / 2) < CurrentHouse.getNumberWPNJ()) {
                            System.out.println("N°" + i + ":" + CurrentHouse);
                        }
                        else if (CurrentHouse.getName() == "Chateaux"){
                            System.out.println("N°" + i + ":" + CurrentHouse + "(Plein)");
                        }
                    }
                    System.out.print("Selectionnez la maison dans laquel vous voulez ajouter votre PNJ : ");
                    affichage.IntegerTest();
                    x = getIntegre();
                    if (house.get(x).getNumberPNJ() > 11 || (house.get(x).getNumberHPNJ() / 2) == house.get(x).getNumberWPNJ()){
                        System.out.println("Maison PLEINE ON TA DIT ON VA TE MANGER ou alors il y pas assez de femme !");}
                    else {
                        String fa = "Un Beau Blond";
                        AskAddPNJ(house.get(x), may, z, fa);
//                        String fa = "Un beau Brun";
//                            AskAddPNJ(CurrentHouse, may, z, fa);
//                        else if (CurrentHouse.getName() == "Ferme") {
//                            System.out.println("Pas assez de place ou de femme dans la maison pour ajouter un Homme !");
//                        }

                    }}
                break;
            case (2):
                break;
        }
    }

    public void addBourgeoisWife(Mayor may) { // Ajouter une Bourgeoise
        System.out.println("1 Continuer  2- Annuler");
        affichage.IntegerTest();
        choix = affichage.getIntegre();
        switch (choix) {
            case (1):
                if (may.getMoney() < coastWife) {
                    System.out.println("Pas assez d'argent !");
                } else {
                    Wife z = new Wife();
                    for (int i = 0; i < house.size(); i++) {
                        House CurrentHouse = house.get(i);
                        if (CurrentHouse.getNumberPNJ() < 12 && CurrentHouse.getName() == "Chateaux" ) {
                            System.out.println("N°" + i + ":" + CurrentHouse);
                        }
                        else if (CurrentHouse.getName() == "Chateaux"){
                            System.out.println("N°" + i + ":" + CurrentHouse + "(Plein)");
                        }
                    }
                    System.out.print("Selectionnez la maison dans laquel vous voulez ajouter votre PNJ : ");
                    affichage.IntegerTest();
                    x = getIntegre();
                    if (house.get(x).getNumberPNJ() > 11 ){
                        System.out.println("Maison PLEINE ON TA DIT ON VA TE MANGER ou alors il y pas assez de femme !");}
                    else {
                        String fa = "Une Belle Blonde";
                        AskAddPNJ(house.get(x), may, z, fa);
//                        String fa = "Un beau Brun";
//                            AskAddPNJ(CurrentHouse, may, z, fa);
//                        else if (CurrentHouse.getName() == "Ferme") {
//                            System.out.println("Pas assez de place ou de femme dans la maison pour ajouter un Homme !");
//                        }

                    }}
                break;
            case (2):
                break;
        }
    }

    public void addPoorWife(Mayor may) { // Ajouter une Pauvre
        System.out.println("1 Continuer  2- Annuler");
        affichage.IntegerTest();
        int choix = affichage.getIntegre();
        switch (choix) {
            case (1):
                if (may.getMoney() < coastWife) {
                    System.out.println("Pas assez d'argent !");
                } else {
                    Wife z = new Wife();
                    for (int i = 0; i < house.size(); i++) {
                        House CurrentHouse = house.get(i);
                        if (CurrentHouse.getNumberPNJ() < 9 && CurrentHouse.getName() == "Ferme" ) {
                            System.out.println("N°" + i + ":" + CurrentHouse);
                        }
                        else if (CurrentHouse.getName() == "Ferme"){
                            System.out.println("N°" + i + ":" + CurrentHouse + "(Plein)");
                        }
                    }
                    System.out.print("Selectionnez la maison dans laquel vous voulez ajouter votre PNJ : ");
                    affichage.IntegerTest();
                    x = getIntegre();
                    if (house.get(x).getNumberPNJ() > 8){
                        System.out.println("Maison PLEINE ON TA DIT ON VA TE MANGER");}
                    else {
                        String fa = "Une Belle Brune";
                        AskAddPNJ(house.get(x), may, z, fa);
//                        String fa = "Un beau Brun";
//                            AskAddPNJ(CurrentHouse, may, z, fa);
//                        else if (CurrentHouse.getName() == "Ferme") {
//                            System.out.println("Pas assez de place ou de femme dans la maison pour ajouter un Homme !");
//                        }

                    }}
                break;
            case (2):
                break;
        }
    }


    public void addPoor(Mayor may) { // Ajoute un Pauvre
        System.out.println("1 Continuer  2- Annuler");
        affichage.IntegerTest();
        int choix = affichage.getIntegre();
        switch (choix) {
            case (1):
                if (may.getMoney() < coastPoor) {
                    System.out.println("Pas assez d'argent !");
                } else {
                    Poor z = new Poor();
                    for (int i = 0; i < house.size(); i++) {
                        House CurrentHouse = house.get(i);
                        if (CurrentHouse.getNumberPNJ() < 9 && CurrentHouse.getName() == "Ferme" && (CurrentHouse.getNumberHPNJ() / 2) < CurrentHouse.getNumberWPNJ()) {
                            System.out.println("N°" + i + ":" + CurrentHouse);
                        }
                        else if (CurrentHouse.getName() == "Ferme"){
                            System.out.println("N°" + i + ":" + CurrentHouse + "(Plein)");
                        }
                    }
                    System.out.print("Selectionnez la maison dans laquel vous voulez ajouter votre PNJ : ");
                    affichage.IntegerTest();
                    x = getIntegre();
                    if (house.get(x).getNumberPNJ() > 8 || (house.get(x).getNumberHPNJ() / 2) == house.get(x).getNumberWPNJ()){
                        System.out.println("Maison PLEINE ON TA DIT ON VA TE MANGER ou alors il y pas assez de femme !");}
                    else {
                    String fa = "Un beau Brun";
                    AskAddPNJ(house.get(x), may, z, fa);
//                        String fa = "Un beau Brun";
//                            AskAddPNJ(CurrentHouse, may, z, fa);
//                        else if (CurrentHouse.getName() == "Ferme") {
//                            System.out.println("Pas assez de place ou de femme dans la maison pour ajouter un Homme !");
//                        }

                }}
                break;
            case (2):
                break;
        }
    }

    public void addPoorHouse(Mayor may) { // Ajoute une maison de Pauvres
        System.out.println("1 Continuer  2- Annuler");
        affichage.IntegerTest();
        int choix = affichage.getIntegre();
        switch (choix) {
            case (1):
                if (may.getMoney() < coastPoorHouse) {
                    System.out.println("Pas assez d'argent !");
                } else {
                    Poor y = new Poor();
                    Wife z = new Wife();
                    Farm x = new Farm();
                    house.add(x);
                    x.PushPNJ(y);
                    x.PushPNJ(z);
                    may.setMoney(may.getMoney() - coastPoorHouse);
                    System.out.println("Une Suculente Ferme à été ajoutée");

                }
                break;
            case (2):
                break;
        }
    }

}
