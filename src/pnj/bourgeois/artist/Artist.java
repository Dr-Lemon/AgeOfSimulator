package pnj.bourgeois.artist;

import pnj.bourgeois.Bourgeois;

public class Artist extends Bourgeois {
    public Artist() {
        this.setJob("artist");
    }
    public Artist(String name){
        this.setJob("artist");
        this.setName(name);
    }
}
