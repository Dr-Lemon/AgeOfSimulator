import display.Display;
import house.House;
import mayor.Mayor;
import store.Store;

import java.util.ArrayList;
import java.util.Scanner;

import static display.Display.*;
//
//
//

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Display affichage = new Display();
        Mayor maire = new Mayor();
        Store store = new Store();
        ArrayList<House> Maison = store.getHouse();
        int game = 0;


        while (maire.getMoney() <= 100000) {
            store.checkHouse(maire);
            if (maire.getMoney() == -1){break;}
            int day = 1;
            int choix = 0;
            affichage.displayMenu(store, maire);
                // JOUR
                System.out.println("---------------------");
                System.out.println("");
                store.checkHouse(maire);
                if (maire.getMoney() == -1){break;}
                while (day != 7) {
                    System.out.println("JOUR " + day + ":");
                    for (int i = 0; i < Maison.size(); ++i) {
                        House CurrentHouse = Maison.get(i);
                        //int Numb = SelectHouse.getNumberPNJ();
                        CurrentHouse.Product(); // ON POINTE VERS UNE MAISON
                    }
                    for (int i = 0; i < Maison.size(); ++i) {
                        System.out.println(Maison.get(i));
                        System.out.println("---------------------");
                        ; // Affiche l’humeur et les ressources de chaque maison Chaque Jour

                    }
                    System.out.println("---------------------");
                    System.out.println();
                    affichage.promptEnterKey();
                    day += 1;
                }


                // FIN DE SEMAINE
                System.out.println("*****************");
                System.out.println("FIN DE LA SEMAINE");
                for (int i = 0; i < Maison.size(); ++i) {
                    System.out.println(Maison.get(i));
                    ;// Affiche l’humeur et les ressources de chaque maison à la fin de la semaine
                    // Sleep de 500ms pour lui laisser le temps de lire, à faire sur le thread.
                }
                System.out.println("*****************");
                System.out.println("");
                for (int i = 0; i < Maison.size(); ++i) {
                    Maison.get(i).getItem();
                    int x;
                    if (Maison.get(i).getName() == "Chateaux") {// Si c’est bourgeois
                        int ask = (Maison.get(i).getItem() / 2);
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
                            System.out.println("Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement !"+newLine);
                        }
                        if (x > ask) {
                            Maison.get(i).ChangeHumor(+1);
                            System.out.println("Cette maison vous remercie pour votre confiance !"+newLine);
                        }
                        if (x == ask) {
                            System.out.println("L’échange s'est effectué avec succès !"+newLine);
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
                            System.out.println(ANSI_RED+"Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement !"+newLine+ ANSI_RESET);
                        }
                        if (x > ask) {
                            Maison.get(i).ChangeHumor(+1);
                            System.out.println(ANSI_GREEN+"Cette maison vous remercie pour votre confiance !"+newLine+ ANSI_RESET);
                        }
                        if (x == ask) {
                            System.out.println("L’échange s'est effectué avec succès !"+newLine);
                        }
                    }


                }
                for (int i = 0; i < Maison.size(); ++i) {
                    System.out.println(Maison.get(i));
                    //house.get(i).toString();
                }
                store.checkHouse(maire);
            }
        System.out.println("GAME OVER");
        }
    }


