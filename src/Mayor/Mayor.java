package Mayor;

import PNJ.PNJ;

public class Mayor {
    private int ressources, money;

    public void AddPNJ(PNJ test){

    }

    public void AddMaison(){

    }

    public void GiveMoney(int money){
        this.money -= money;
    }

    public void GiveRessources(int ressources){
        this.ressources -= ressources;
    }
}
