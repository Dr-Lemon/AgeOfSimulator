package PNJ.Bourgeois;

import PNJ.PNJ;

public class Bourgeois extends PNJ {

    public Bourgeois(String name) {
        super(name);
        this.setRessources(10);
        this.setSocial("Bourgeois");
    }

    public Bourgeois() {
        this.setSocial("Bourgeois");
    }

    @Override
    public void Farm(int item){
        this.setMoney(this.getMoney()+item);
    }

}
