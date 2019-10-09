package PNJ.Bourgeois.Artist;

import PNJ.Bourgeois.Bourgeois;

public class Artist extends Bourgeois {
    public Artist() {
        this.setJob("Artist");
    }
    public Artist(String name){
        this.setJob("Artist");
        this.setName(name);
    }
}
