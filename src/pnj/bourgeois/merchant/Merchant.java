package pnj.bourgeois.merchant;

import pnj.bourgeois.Bourgeois;

public class Merchant extends Bourgeois {
    public Merchant() {
        this.setJob("merchant");
    }
    public Merchant(String name){
        this.setName(name);
        this.setJob("merchant");
    }
}
