package PNJ.Bourgeois;

import PNJ.PNJ;

public class Bourgeois extends PNJ {

    public Bourgeois(String name) {
        super(name);
        this.setSocial("Bourgeois");
    }

    public Bourgeois() {
        this.setSocial("Bourgeois");
    }

    public void MakeMoney(int money){
        this.setItem(this.getItem()+2);
    }

}
