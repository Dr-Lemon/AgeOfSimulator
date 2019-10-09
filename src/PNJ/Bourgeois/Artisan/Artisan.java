package PNJ.Bourgeois.Artisan;

import PNJ.Bourgeois.Artist.Artist;
import PNJ.Bourgeois.Bourgeois;

public class Artisan extends Bourgeois {
    public Artisan() {
        this.setJob("Artisan");
    }
    public Artisan(String name){
        this.setJob("Artisan");
        this.setName(name);
    }
}
