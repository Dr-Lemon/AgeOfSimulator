package PNJ.Bourgeois;

import PNJ.PNJ;

public class Bourgeois extends PNJ {

    public Bourgeois() {
    }

    public void MakeMoney(int money){
        this.setItem(this.getItem()+2);
    }

}
