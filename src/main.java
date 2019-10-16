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
        Mayor maire = new Mayor(); // en paramètres le nom ou pas
        maire.setRessources(20);
        maire.setMoney(400);
        ArrayList<House> house = new ArrayList<House>();
        int day = 1;
        int choix =0;
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

        while (choix != 6) {
            System.out.println("Que voulez vous faire ?");
            System.out.println("1- Créer une maison de Bourgeois (" + Store.getCoastBourgeoisHouse() + "$) (Disposant déjà d un H et une F)");
            System.out.println("2- Créer un Bourgeois (" + Store.getCoastBourgeois() + "$)");
            System.out.println("3- Créer une maison de Pauvres (" + Store.getCoastPoorHouse() + " $) (Disposant déjà d’un H et une F)");
            System.out.println("4- Créer un Pauvre (" + Store.getCoastPoor() + "$)");
            System.out.println("5- Créer une Femme (" + Store.getCoastWife() + "$)");
            System.out.println("6- Continuer");
            choix = sc.nextInt();
            System.out.println(choix);

        }
        // SWITCH MENU A FAIRE

        // JOUR
        while(day != 7){
            for(int i = 0; i < house.size(); ++i){
                House CurrentHouse = house.get(i);
                System.out.println("COOLC");
                //int Numb = SelectHouse.getNumberPNJ();
                CurrentHouse.Product(); // ON POINTE VERS UNE MAISON
            }
            for (int i = 0; i < house.size(); ++i){
                System.out.println(house.get(i));; // Affiche l’humeur et les ressources de chaque maison Chaque Jour

            }
            sc.next();
            day += 1;
        }

        System.out.println("coucou");
        // FIN DE SEMAINE
        for (int i = 0; i < house.size(); ++i){
            System.out.println(house.get(i));;// Affiche l’humeur et les ressources de chaque maison à la fin de la semaine
            // Sleep de 500ms pour lui laisser le temps de lire, à faire sur le thread.
        }

        for (int i = 0; i < house.size(); ++i){
            house.get(i).getRessources();
            int x;
            if(house.get(i).getName() == "Bourgeois"){// Si c’est bourgeois
                int ask = (house.get(i).getRessources() / 2);
                System.out.println("cette maison reclame"+ ask);
                System.out.println("Combien voulez vous donner ?");
                x = sc.nextInt();
                maire.setRessources(maire.getRessources()-x); // Maire donne un nbr de ressources
                maire.setRessources(maire.getRessources()+(house.get(i).getRessources())); // Il récupère toutes les ressources de la maison bourgeoise(Argent qu’ils ont récoltés)
                house.get(i).setRessources(0); // On met les ressources de la maison à 0
                if( x < ask ){
                    house.get(i).ChangeHumor(-1);
                    System.out.println("Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement !");
                }
                if( x > ask ){
                    house.get(i).ChangeHumor(+1);
                    System.out.println("Cette maison vous remercie pour votre confiance !");
                }
                if( x == ask ){
                    System.out.println("L’échange s'est effectué avec succès !");
                }
            }


            else{ // Si c’est pauvre
                int ask = (house.get(i).getRessources());
                System.out.println("cette maison reclame"+ ask);
                System.out.println("Combien voulez vous donner ?");
                x = sc.nextInt();
                maire.setRessources(maire.getRessources()-x); // Maire donne un nbr de ressources
                maire.setRessources(maire.getRessources()+(house.get(i).getRessources())); // Il récupère toutes les ressources de la maison pauvre(Ressources qu’ils ont récoltés)
                house.get(i).setRessources(0); // On met les ressources de la maison à 0
                if( x < ask ){
                    house.get(i).ChangeHumor(-1);
                    System.out.println("Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement !");
                }
                if( x > ask ){
                    house.get(i).ChangeHumor(+1);
                    System.out.println("Cette maison vous remercie pour votre confiance !");
                }
                if( x == ask ){
                    System.out.println("L’échange s'est effectué avec succès !");
                }
            }


        }
        for (int i=0 ; i < house.size(); ++i){
            System.out.println(house.get(i));
            //house.get(i).toString();
        }
    }
}


