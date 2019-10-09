package PNJ.Bourgeois.Merchant;

import PNJ.Bourgeois.Bourgeois;

public class Merchant extends Bourgeois {
    public Merchant() {
        this.setJob("Merchant");
    }
    public Merchant(String name){
        this.setName(name);
        this.setJob("Merchant");
    }
}
