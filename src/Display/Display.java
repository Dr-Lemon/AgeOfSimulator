package Display;

import Mayor.Mayor;
import Store.Store;

import java.util.Scanner;

public class Display {

    public static String newLine = System.getProperty("line.separator");
    public static String ANSI_RESET = "\u001B[0m"; // PERMET L'AFFIFICHAGE EN COULEUR
    public static String ANSI_BLACK = "\u001B[30m";
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_YELLOW = "\u001B[33m";
    public static String ANSI_BLUE = "\u001B[34m";
    public static String ANSI_PURPLE = "\u001B[35m";
    public static String ANSI_CYAN = "\u001B[36m";
    public static String ANSI_WHITE = "\u001B[37m";
    private static int Integre;
    private static Scanner sc = new Scanner(System.in);

    public static void promptEnterKey() {
        System.out.println("Press \"ENTER\" to continue...");
        sc.nextLine();
    }
    public static void displayMenu(Store store, Mayor maire){
        int choix = 0;
        while (choix != 6) {
            System.out.println(maire);
            System.out.println("Que voulez vous faire ?");
            System.out.println(ANSI_CYAN +"1- Créer une maison de Bourgeois (" + Store.getCoastBourgeoisHouse() + "$) (Disposant déjà d un H et une F)"+ANSI_RESET);
            System.out.println(ANSI_CYAN+"2- Créer un Bourgeois (" + Store.getCoastBourgeois() + "$)"+ANSI_RESET);
            System.out.println(ANSI_PURPLE+"3- Créer une maison de Pauvres (" + Store.getCoastPoorHouse() + " $) (Disposant déjà d’un H et une F)"+ANSI_RESET);
            System.out.println(ANSI_PURPLE+"4- Créer un Pauvre (" + Store.getCoastPoor() + "$)"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"5- Créer une Femme (" + Store.getCoastWife() + "$)"+ANSI_RESET);
            System.out.println("6- Continuer");
            IntegerTest();
            choix = getIntegre();
            // SWITCH MENU A FAIRE
            switch(choix) {
                case (1):
                    store.addBourgeoisHouse(maire);
                    break;

                case (2):
                    store.addBourgeois(maire);
                    break;

                case (3):
                    store.addPoorHouse(maire);
                    break;

                case (4):
                    store.addPoor(maire);
                    break;

                case (5):
                    System.out.println("1- Femme Bourgeoise");
                    System.out.println("2- Femme Pauvre");
                    IntegerTest();
                    int choix2 = getIntegre();
                    switch (choix2){
                        case(1) :
                            store.addBourgeoisWife(maire);
                            break;
                        case(2) :
                            store.addPoorWife(maire);
                            break;
                    }
                    break;

                case (6):
                    break;


            }
        }
    }
    public static void IntegerTest(){


        boolean chiffre = false;
        String str;
        int toto = 0;
        do {
            str = sc.nextLine();
            try {
                toto = Integer.parseInt(str);
                if (toto < 0){
                    System.out.println("Chiffre Négatif Interdit ! PAS DE TRICHE ICI !");
                }
                else{
                chiffre = true;} // si ton exécution arrive jusque là, ça signifie qu'il n'y a aucune exception lancée et que ta saisie est donc bien un chiffre
            } catch(NumberFormatException e) {
                System.out.println("Cette valeur n'est pas un chiffre, essaie encore !");
            }
        } while (chiffre != true);



            System.out.println("Ok");
            Integre = toto;
    }

    public static int getIntegre() {
        return Integre;
    }

    public static String getAnsiReset() {
        return ANSI_RESET;
    }

    public static String getAnsiBlack() {
        return ANSI_BLACK;
    }

    public static String getAnsiRed() {
        return ANSI_RED;
    }

    public static String getAnsiGreen() {
        return ANSI_GREEN;
    }

    public static String getAnsiYellow() {
        return ANSI_YELLOW;
    }

    public static String getAnsiBlue() {
        return ANSI_BLUE;
    }

    public static String getAnsiPurple() {
        return ANSI_PURPLE;
    }

    public static String getAnsiCyan() {
        return ANSI_CYAN;
    }

    public static String getAnsiWhite() {
        return ANSI_WHITE;
    }
}

