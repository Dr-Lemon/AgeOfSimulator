package Main;


public class main {
    public static void main(String[] args) {
        Mayor maire = new Mayor() // en paramètres le nom ou pas
        maire.setRessources(20);
        maire.setMoney(400);
        ArrayList<House> house = new ArrayList<House>();
        int day = 0;

// ArrayList c’est comme un tableau mais qu’on peut agrandir comme on veux on a juste a faire Pauvres.add (Thierry) et ça nous ajoute un élément pour le comptage des PNJ et si on veut ajouter un PNJ ce sera plus simple. //

        int choix;

        while (1){
            System.out.println("Que voulez vous faire ?");
            System.out.println("1- Créer une maison de Bourgeois (" + maire.get(coastBourgeoisHouse) + ") (Disposant déjà d un H et une F)");
            System.out.println("2- Créer un Bourgeois (" + maire.get(coastBourgeois) + ")");
            System.out.println("3- Créer une maison de Pauvres (" + maire.get(coastPoorHouse) + " ) (Disposant déjà d’un H et une F)");
            System.out.println("4- Créer un Pauvre (" + maire.get(coastPoor) + ")");
            System.out.println("5- Continuer");
            choix = MOOC.readInt();
            if (choix == 1){
                moneyMayor = maire.(get.Money)
                if(moneyMayor < costBourgeoisHouse){ // Il faudrait définir le prix des maisons
                    sout (“Pas assez d’argent !”)
                }
                else{
                    bourgeoie y = new bourgeoie();
                    Wife z = new Wife();
                    home x = new home();
                    house.add(x);
                    x.setRessources(20);

                } }
            if (choix == 2){

            }
            else if (choix == 3){
                moneyMayor = maire.(get.Money)
                if(moneyMayor < costPoorHouse){ // Dans des variables globale pour y avoir accès partout sans créer d’objet Maison ou alors on créer un objet..
                    sout (“Pas assez d’argent !”)
                }
                pauvre y = new pauvre();
                Wife z = new Wife();
                home x = new home();
                house.add(x);
                x.setRessources(20);
            }

            else if (choix == 5){
                int choix2;
                sout(“Etes vous sur de vouloir continuer ?”)
                sout(“1-Yes  2-No ?”)
                choix2 = MOOC.readInt();
                if (choix2 = 1){
                    break; }
                elseif (choix2 = 2){
// On fait rien pour que ça recommence la boucle.
                }
                while (choix <1 || choix>2){ System.out.print("Choix incorrect. "); System.out.print("Votre choix: "); choix = MOOC.readInt(); }
else{
                    sout(“Choix incorrect”);
                }
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

                if(house.get(i).getType() == Bourgeois){// Si c’est bourgeois
                    int ask = (house.get(i).getRessources() div 2)
                    sout(“Cette maison réclame :” + ask );

                    sout(“Combien voulez vous donnez ?”)
                    Scanner.readnextint();
                    x = nextInt;

                    maire.giveRessources(x); // Maire donne un nbr de ressources
                    maire.TakeRessources(house.get(i).getRessources); // Il récupère toutes les ressources de la maison bourgeoise(Argent qu’ils ont récoltés)
                    house.get(i).setRessources(0); // On met les ressources de la maison à 0
                }


                else{ // Si c’est pauvre
                    int ask = (house.get(i).getRessources())
                    sout(“Cette maison réclame :” + ask );

                    sout(“Combien voulez vous donnez ?”)
                    Scanner.readnextint();
                    x = nextInt;

                    maire.giveMoney(x); // Maire donne un nbr de ressources
                    maire.TakeRessources(house.get(i).getRessources); // Il récupère toutes les ressources de la maison pauvre(Ressources qu’ils ont récoltés)
                    house.get(i).setRessources(0); // On met les ressources de la maison à 0
                }

                if( x < NbrRessources ){
                    PNJ.ChangeHumor(-1);
                    sout(“Cette maison n’as pas bien été rémunéré attention cela va influencer leurs comportement”)
                }
                if( x > NbrRessources ){
                    PNJ.ChangeHumor(+1);
                    sout(“Cette maison vous remercie pour votre confiance !”)
                }
                if( x == NbrRessources ){
                    sout(“L’échange s'est effectué avec succès”)
                }
            }
            for (int i=0 ; i < house.size(); ++i){
//sout(“NbrRessources =” + house.get(i).getRessources());
//sout(“Nom =” + house.get(i).getNom());
//sout(“NbrPers =” + house.get(i).getNbrPers());

//ou

                house.get(i).toString();
            }

        }
}
