package Main;


import House.Castle.Castle;
import House.Farm.Farm;
import House.House;
import Mayor.Mayor;
import PNJ.Bourgeois.Bourgeois;
import PNJ.Poor.Poor;
import PNJ.Wife.Wife;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mayor maire = new Mayor() // en paramètres le nom ou pas
        maire.setRessources(20);
        maire.setMoney(400);
        ArrayList<House> house = new ArrayList<House>();
        int day = 0;

// ArrayList c’est comme un tableau mais qu’on peut agrandir comme on veux on a juste a faire Pauvres.add (Thierry) et ça nous ajoute un élément pour le comptage des PNJ et si on veut ajouter un PNJ ce sera plus simple. //

        int choix;

        while (1){
            System.out.println("Que voulez vous faire ?");
            System.out.println("1- Créer une maison de Bourgeois (" + maire.getCoastBourgeoisHouse() + ") (Disposant déjà d un H et une F)");
            System.out.println("2- Créer un Bourgeois (" + maire.getCoastBourgeois() + ")");
            System.out.println("3- Créer une maison de Pauvres (" + maire.getCoastPoorHouse() + " ) (Disposant déjà d’un H et une F)");
            System.out.println("4- Créer un Pauvre (" + maire.getCoastPoor() + ")");
            System.out.println("5- Continuer");
            choix = sc.nextInt();
            if (choix == 1){
                //moneyMayor = maire.(get.Money)
                if(maire.getMoney() < maire.getCoastBourgeoisHouse() ){ // Il faudrait définir le prix des maisons
                    System.out.println("Pas assez d'argent !");
                }
                else{
                    Bourgeois y = new Bourgeois();
                    Wife z = new Wife();
                    Castle x = new Castle();
                    house.add(x);
                    x.setRessources(20);

                } }
            if (choix == 2){

            }
            else if (choix == 3){
                //moneyMayor = maire.(get.Money)
                if(maire.getMoney() < maire.getCoastPoorHouse()){ // Dans des variables globale pour y avoir accès partout sans créer d’objet Maison ou alors on créer un objet..
                    System.out.println("Pas assez d'argent");
                }
                Poor y = new Poor();
                Wife z = new Wife();
                Farm x = new Farm();
                house.add(x);
                x.setRessources(20);
            }

            else if (choix == 5){
                int choix2;
                System.out.println("Etes vous sur de bien vouloir continuer ?");
                System.out.println("OUI : 1 NON : 2");
                choix2 = sc.nextInt();
                if (choix2 == 1){
                    break; }
                else if (choix2 == 2){
                // On fait rien pour que ça recommence la boucle.
                }
                while (choix <1 || choix>2){
                    System.out.print("Choix incorrect. ");
                    System.out.print("Votre choix: ");
                    choix = sc.nextInt();
                }
//                else{
//                    System.out.println("Choix incorrect !");
//                }
            }
            while(day != 7){
                for (int i = 0; i < house.size(); ++i){
                    countHouse = house.get(i);
                    Numb = countHouse.get(NbrPers);
                    for(int t = 0; t < Numb.size(); ++t){
                        Numb.product(); // va produire pour chaque PNJ un nbr de ressources
                        Numb.eat(); // va retirer un certain Nombres (on le fait aussi pour les riches )
                        Numb.giveRessources(); // donne le restant à la maison
                    }
                }


                for (int i = 0; i < house.size(); ++i){
                    house.get(i).toString(); // Affiche l’humeur et les ressources de chaque maison
                }
                day += 1;
            }

            for (int i = 0; i < house.size(); ++i){
                house.get(i).toString();// Affiche l’humeur et les ressources de chaque maison
            }


            for (int i = 0; i < house.size(); ++i){
                house.get(i).getRessources();

                int x;
                if(house.get(i).getName() == Bourgeois){// Si c’est bourgeois
                    int ask = (house.get(i).getRessources() / 2);
                    System.out.println("cette maison reclame"+ ask);
                    System.out.println("Combien voulez vous donner ?");
                    x = sc.nextInt();
                    maire.setRessources(maire.getRessources()-x)); // Maire donne un nbr de ressources
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
                        PNJ.ChangeHumor(-1);
                        System.out.println("Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement !");
                        }
                        if( x > ask ){
                            PNJ.ChangeHumor(+1);
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
}
