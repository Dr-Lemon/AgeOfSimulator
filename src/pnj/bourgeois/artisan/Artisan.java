package pnj.bourgeois.artisan;

import pnj.bourgeois.Bourgeois;

public class Artisan extends Bourgeois {
    public Artisan() {
        this.setJob("artisan");
    }
    public Artisan(String name){
        this.setJob("artisan");
        this.setName(name);
    }
}
