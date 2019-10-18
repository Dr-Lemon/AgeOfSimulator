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
     * The constant ANSI_RESET BOUCLE CODE COULEUR FERMETURE.
     */
    public static String ANSI_RESET = "\u001B[0m"; // PERMET L'AFFIFICHAGE EN COULEUR
    /**
     * The constant ANSI_BLACK BOUCLE CODE COULEUR NOIR.
     */
    public static String ANSI_BLACK = "\u001B[30m";
    /**
     * The constant ANSI_RED BOUCLE CODE COULEUR ROUGE.
     */
    public static String ANSI_RED = "\u001B[31m";
    /**
     * The constant ANSI_GREEN BOUCLE CODE COULEUR VERT.
     */
    public static String ANSI_GREEN = "\u001B[32m";
    /**
     * The constant ANSI_YELLOW BOUCLE CODE COULEUR JAUNE.
     */
    public static String ANSI_YELLOW = "\u001B[33m";
    /**
     * The constant ANSI_BLUE BOUCLE CODE COULEUR BLEU.
     */
    public static String ANSI_BLUE = "\u001B[34m";
    /**
     * The constant ANSI_PURPLE BOUCLE CODE COULEUR VIOLET.
     */
    public static String ANSI_PURPLE = "\u001B[35m";
    /**
     * The constant ANSI_CYAN BOUCLE CODE COULEUR CYAN.
     */
    public static String ANSI_CYAN = "\u001B[36m";
    /**
     * The constant ANSI_WHITE.
     */
    public static String ANSI_WHITE = "\u001B[37m";
    private static int Integre;
    private static Scanner sc = new Scanner(System.in);

    /**
     * Prompt enter key // Tempo avec en attente la touche entrée.
     */
    public static void promptEnterKey() {
        System.out.println("Press \"ENTER\" to continue...");
        sc.nextLine();
    }

    /**
     * Display menu.
     *
     * @param store Le magasin
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
     * Permet de tester si le carractère est un chiffre et si il est bien négatif
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


}

