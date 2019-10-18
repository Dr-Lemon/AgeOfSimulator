package pnj.poor.farmer;

import pnj.poor.Poor;

/**
 * The type Farmer.
 */
public class Farmer extends Poor {
    /**
     * Instantiates a new Farmer.
     */
    public Farmer() {
        this.setJob("farmer");
    }

    /**
     * Instantiates a new Farmer.
     *
     * @param name the name
     */
    public Farmer(String name) {
        this.setJob("farmer");
        this.setName(name);
    }
}
