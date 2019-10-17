package Display;

import java.util.Scanner;

public class Display {
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
                chiffre = true; // si ton exécution arrive jusque là, ça signifie qu'il n'y a aucune exception lancée et que ta saisie est donc bien un chiffre
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
}

