package display;

import mayor.Mayor;
import store.Store;

import java.util.Scanner;

/**
 * The type Display.
 */
public class Display {
    /**
     * The constant newLine.
     */
    public static String newLine = System.getProperty("line.separator");
    /**
     * The constant ANSI_RESET.
     */
    public static String ANSI_RESET = "\u001B[0m"; // PERMET L'AFFIFICHAGE EN COULEUR
    /**
     * The constant ANSI_BLACK.
     */
    public static String ANSI_BLACK = "\u001B[30m";
    /**
     * The constant ANSI_RED.
     */
    public static String ANSI_RED = "\u001B[31m";
    /**
     * The constant ANSI_GREEN.
     */
    public static String ANSI_GREEN = "\u001B[32m";
    /**
     * The constant ANSI_YELLOW.
     */
    public static String ANSI_YELLOW = "\u001B[33m";
    /**
     * The constant ANSI_BLUE.
     */
    public static String ANSI_BLUE = "\u001B[34m";
    /**
     * The constant ANSI_PURPLE.
     */
    public static String ANSI_PURPLE = "\u001B[35m";
    /**
     * The constant ANSI_CYAN.
     */
    public static String ANSI_CYAN = "\u001B[36m";
    /**
     * The constant ANSI_WHITE.
     */
    public static String ANSI_WHITE = "\u001B[37m";
    private static int Integre;
    private static Scanner sc = new Scanner(System.in);

    /**
     * Prompt enter key.
     */
    public static void promptEnterKey() {
        System.out.println("Press \"ENTER\" to continue...");
        sc.nextLine();
    }

    /**
     * Display menu.
     *
     * @param store the store
     * @param maire the maire
     */
    public static void displayMenu(Store store, Mayor maire) {

        int choix = 0;
        while (choix != 6) {
            System.out.println(maire);
            System.out.println("Que voulez vous faire ?");
            System.out.println(ANSI_CYAN + "1- Créer une maison de bourgeois (" + Store.getCoastBourgeoisHouse() + "$) (Disposant déjà d un H et une F)" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "2- Créer un bourgeois (" + Store.getCoastBourgeois() + "$)" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "3- Créer une maison de Pauvres (" + Store.getCoastPoorHouse() + " $) (Disposant déjà d’un H et une F)" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "4- Créer un Pauvre (" + Store.getCoastPoor() + "$)" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "5- Créer une Femme (" + Store.getCoastWife() + "$)" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "6- Continuer" + ANSI_RESET);
            IntegerTest();
            choix = getIntegre();
            // SWITCH MENU A FAIRE
            switch (choix) {
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
                    System.out.println(ANSI_YELLOW + "1- Femme Bourgeoise" + ANSI_RESET);
                    System.out.println(ANSI_YELLOW + "2- Femme Pauvre" + ANSI_RESET);
                    IntegerTest();
                    int choix2 = getIntegre();
                    switch (choix2) {
                        case (1):
                            store.addBourgeoisWife(maire);
                            break;
                        case (2):
                            store.addPoorWife(maire);
                            break;
                    }
                    break;

                case (6):
                    break;


            }
        }
    }

    /**
     * Integer test.
     */
    public static void IntegerTest() {


        boolean chiffre = false;
        String str;
        int toto = 0;
        do {
            str = sc.nextLine();
            try {
                toto = Integer.parseInt(str);
                if (toto < 0) {
                    System.out.println(ANSI_RED + "Chiffre Négatif Interdit ! PAS DE TRICHE ICI !" + ANSI_RESET);
                } else {
                    chiffre = true;
                } // si ton exécution arrive jusque là, ça signifie qu'il n'y a aucune exception lancée et que ta saisie est donc bien un chiffre
            } catch (NumberFormatException e) {
                System.out.println(ANSI_RED + "Cette valeur n'est pas un chiffre, essaie encore !" + ANSI_RESET);
            }
        } while (chiffre != true);

        Integre = toto;
    }

    /**
     * Gets integre.
     *
     * @return the integre
     */
    public static int getIntegre() {
        return Integre;
    }

    /**
     * Gets ansi reset.
     *
     * @return the ansi reset
     */
    public static String getAnsiReset() {
        return ANSI_RESET;
    }

    /**
     * Gets ansi black.
     *
     * @return the ansi black
     */
    public static String getAnsiBlack() {
        return ANSI_BLACK;
    }

    /**
     * Gets ansi red.
     *
     * @return the ansi red
     */
    public static String getAnsiRed() {
        return ANSI_RED;
    }

    /**
     * Gets ansi green.
     *
     * @return the ansi green
     */
    public static String getAnsiGreen() {
        return ANSI_GREEN;
    }

    /**
     * Gets ansi yellow.
     *
     * @return the ansi yellow
     */
    public static String getAnsiYellow() {
        return ANSI_YELLOW;
    }

    /**
     * Gets ansi blue.
     *
     * @return the ansi blue
     */
    public static String getAnsiBlue() {
        return ANSI_BLUE;
    }

    /**
     * Gets ansi purple.
     *
     * @return the ansi purple
     */
    public static String getAnsiPurple() {
        return ANSI_PURPLE;
    }

    /**
     * Gets ansi cyan.
     *
     * @return the ansi cyan
     */
    public static String getAnsiCyan() {
        return ANSI_CYAN;
    }

    /**
     * Gets ansi white.
     *
     * @return the ansi white
     */
    public static String getAnsiWhite() {
        return ANSI_WHITE;
    }

}

