package pnj.bourgeois.artisan;

import pnj.bourgeois.Bourgeois;

/**
 * The type Artisan.
 */
public class Artisan extends Bourgeois {
    /**
     * Instantiates a new Artisan.
     */
    public Artisan() {
        this.setJob("artisan");
    }

    /**
     * Instantiates a new Artisan.
     *
     * @param name the name
     */
    public Artisan(String name) {
        this.setJob("artisan");
        this.setName(name);
    }
}
