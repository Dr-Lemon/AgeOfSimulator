package Display;

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

