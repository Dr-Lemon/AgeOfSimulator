package pnj.bourgeois.artist;

import pnj.bourgeois.Bourgeois;

/**
 * The type Artist.
 */
public class Artist extends Bourgeois {
    /**
     * Instantiates a new Artist.
     */
    public Artist() {
        this.setJob("artist");
    }

    /**
     * Instantiates a new Artist.
     *
     * @param name the name
     */
    public Artist(String name) {
        this.setJob("artist");
        this.setName(name);
    }
}
