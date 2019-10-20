import display.Display;
import house.House;
import mayor.Mayor;
import store.Store;

import java.util.ArrayList;


import static display.Display.*;


/**
 * The type Main.
 */
public class main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Display affichage = new Display();
        Mayor maire = new Mayor();
        Store store = new Store();
        ArrayList<House> Maison = store.getHouse();

        System.out.println(ANSI_CYAN + "---------------------------------------------------------------------------------------------------------------------");
        System.out.println("                        Vous êtes le maire d'une ville et vous contrôlez des habitants");
        System.out.println("                        Il existe deux types d'habitants : les Bourgeois et les Pauvres");
        System.out.println("            En tant que Maire vous recevez des impôts mais vous devez aussi payer les habitants");
        System.out.println("    Attention si vous payez moins que ce que les habitants demandent cela pourra faire varier leurs comportements");
        System.out.println("                Voir même les faires quitter votre belle ville ! Alors ne les contrariait pas !");
        System.out.println("---------------------------------------------------------------------------------------------------------------------" + ANSI_RESET);
        affichage.promptEnterKey();
        System.out.println(ANSI_CYAN + "---------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("                But du jeu : Atteindre 100 000$ tout en gardant le plus de maison possible");
        System.out.println("                        Mais attention si vous êtes à découvert pendant trois tours  ");
        System.out.println("                            ou que vous n'avez plus aucune maison vous perdez");
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------------------------------" + ANSI_RESET);
        affichage.promptEnterKey();

        while (maire.getMoney() <= 100000) {

            store.checkHouse(maire);
            if (maire.getMoney() == -1 || maire.getDept() == 3) {
                break;
            }
            int day = 1;
            affichage.displayMenu(store, maire);
            // JOUR
            System.out.println("---------------------");
            System.out.println("");
            store.checkHouse(maire);
            if (maire.getMoney() == -1 && maire.getDept() == 3) {
                break;
            }
            while (day != 7) {
                System.out.println("JOUR " + day + ":");
                for (int i = 0; i < Maison.size(); ++i) {
                    House CurrentHouse = Maison.get(i);
                    CurrentHouse.Product(CurrentHouse.getHumor()); // ON Fait produire chaque maison en fonction de l'humeur
                    System.out.println("G FAIM MAINTENANT");
                }
                for (int i = 0; i < Maison.size(); ++i) {
                    System.out.println(Maison.get(i)); // Affiche l’humeur et les ressources de chaque maison Chaque Jour
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Error of sleep");
                    }
                    System.out.println("---------------------");

                }
                affichage.promptEnterKey();
                day += 1;
            }


            // FIN DE SEMAINE
            System.out.println("*****************");
            System.out.println("FIN DE LA SEMAINE");
            for (int i = 0; i < Maison.size(); ++i) {
                System.out.println(Maison.get(i));
                ;// Affiche l’humeur et les ressources de chaque maison à la fin de la semaine
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error of sleep");
                }
            }
            System.out.println("*****************");
            System.out.println("");
            for (int i = 0; i < Maison.size(); ++i) {
                Maison.get(i).getItem();
                int x;
                if (Maison.get(i).getName() == "Chateaux") {// Si c’est bourgeois
                    int ask = (Maison.get(i).getItem()/ 2);
                    System.out.println(Maison.get(i));
                    System.out.println("cette maison reclame : " + ask + "Ressources");
                    System.out.println(maire);
                    System.out.println("Combien voulez vous donner ?");
                    affichage.IntegerTest();
                    x = affichage.getIntegre();
                    maire.setRessources(maire.getRessources() - x); // Maire donne un nbr de ressources
                    maire.setMoney(maire.getMoney() + (Maison.get(i).getItem())); // Il récupère toutes les ressources de la maison bourgeoise(Argent qu’ils ont récoltés)
                    Maison.get(i).setItem(0); // On met les ressources de la maison à 0
                    if (x < ask) {
                        Maison.get(i).ChangeHumor(-1);
                        System.out.println("Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement !" + newLine);
                    }
                    if (x > ask) {
                        Maison.get(i).ChangeHumor(+1);
                        System.out.println("Cette maison vous remercie pour votre confiance !" + newLine);
                    }
                    if (x == ask) {
                        System.out.println("L’échange s'est effectué avec succès !" + newLine);
                    }
                } else { // Si c’est pauvre
                    int ask = (Maison.get(i).getItem());
                    System.out.println(Maison.get(i));
                    System.out.println("cette maison reclame :" + ask + "$");
                    System.out.println(maire);
                    System.out.println("Combien voulez vous donner ?");
                    affichage.IntegerTest();
                    x = affichage.getIntegre();
                    maire.setMoney(maire.getMoney() - x); // Maire donne un nbr de ressources
                    maire.setRessources(maire.getRessources() + (Maison.get(i).getItem())); // Il récupère toutes les ressources de la maison pauvre(Ressources qu’ils ont récoltés)
                    Maison.get(i).setItem(0); // On met les ressources de la maison à 0
                    if (x < ask) {
                        Maison.get(i).ChangeHumor(-1);
                        System.out.println(ANSI_RED + "Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement !" + newLine + ANSI_RESET);
                    }
                    if (x > ask) {
                        Maison.get(i).ChangeHumor(+1);
                        System.out.println(ANSI_GREEN + "Cette maison vous remercie pour votre confiance !" + newLine + ANSI_RESET);
                    }
                    if (x == ask) {
                        System.out.println("L’échange s'est effectué avec succès !" + newLine);
                    }
                }


            }
            for (int i = 0; i < Maison.size(); ++i) {
                System.out.println(Maison.get(i));
                //house.get(i).toString();
            }
            store.checkHouse(maire);
            store.checkDept(maire);
        }
        if (maire.getDept() == 3 || maire.getMoney() == -1) {
            System.out.println("GAME OVER");
        }
        else{
            System.out.println("BRAVO !  Vous avez gagné !");
        }
    }
}


