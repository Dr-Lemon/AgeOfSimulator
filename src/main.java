import Display.Display;
import House.Castle.Castle;
import House.Farm.Farm;
import House.House;
import Mayor.Mayor;
import Store.Store;
import PNJ.Bourgeois.Bourgeois;
import PNJ.PNJ;
import PNJ.Poor.Poor;
import PNJ.Wife.Wife;

import java.util.ArrayList;
import java.util.Scanner;
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


        while (maire.getMoney() != 100000) {
            int day = 1;
            int choix = 0;
            while (choix != 6) {
                System.out.println(maire);
                System.out.println("Que voulez vous faire ?");
                System.out.println("1- Créer une maison de Bourgeois (" + Store.getCoastBourgeoisHouse() + "$) (Disposant déjà d un H et une F)");
                System.out.println("2- Créer un Bourgeois (" + Store.getCoastBourgeois() + "$)");
                System.out.println("3- Créer une maison de Pauvres (" + Store.getCoastPoorHouse() + " $) (Disposant déjà d’un H et une F)");
                System.out.println("4- Créer un Pauvre (" + Store.getCoastPoor() + "$)");
                System.out.println("5- Créer une Femme (" + Store.getCoastWife() + "$)");
                System.out.println("6- Continuer");
                affichage.IntegerTest();
                choix = affichage.getIntegre();
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
                        affichage.IntegerTest();
                        int choix2 = affichage.getIntegre();
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
                // JOUR
                while (day != 7) {
                    for (int i = 0; i < Maison.size(); ++i) {
                        House CurrentHouse = Maison.get(i);
                        //int Numb = SelectHouse.getNumberPNJ();
                        CurrentHouse.Product(); // ON POINTE VERS UNE MAISON
                    }
                    for (int i = 0; i < Maison.size(); ++i) {
                        System.out.println(Maison.get(i));
                        ; // Affiche l’humeur et les ressources de chaque maison Chaque Jour

                    }
//                sc.next();
                    affichage.promptEnterKey();
                    day += 1;
                }


                // FIN DE SEMAINE
                for (int i = 0; i < Maison.size(); ++i) {
                    System.out.println(Maison.get(i));
                    ;// Affiche l’humeur et les ressources de chaque maison à la fin de la semaine
                    // Sleep de 500ms pour lui laisser le temps de lire, à faire sur le thread.
                }

                for (int i = 0; i < Maison.size(); ++i) {
                    Maison.get(i).getItem();
                    int x;
                    if (Maison.get(i).getName() == "Chateaux") {// Si c’est bourgeois
                        int ask = (Maison.get(i).getItem() / 2);
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
                            System.out.println("Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement !");
                        }
                        if (x > ask) {
                            Maison.get(i).ChangeHumor(+1);
                            System.out.println("Cette maison vous remercie pour votre confiance !");
                        }
                        if (x == ask) {
                            System.out.println("L’échange s'est effectué avec succès !");
                        }
                    } else { // Si c’est pauvre
                        int ask = (Maison.get(i).getItem());
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
                            System.out.println("Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement !");
                        }
                        if (x > ask) {
                            Maison.get(i).ChangeHumor(+1);
                            System.out.println("Cette maison vous remercie pour votre confiance !");
                        }
                        if (x == ask) {
                            System.out.println("L’échange s'est effectué avec succès !");
                        }
                    }


                }
                for (int i = 0; i < Maison.size(); ++i) {
                    System.out.println(Maison.get(i));
                    //house.get(i).toString();
                }
            }
        }
    }


