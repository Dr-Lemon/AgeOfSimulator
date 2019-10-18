package pnj.poor.butcher;

import pnj.poor.Poor;

/**
 * The type Butcher.
 */
public class Butcher extends Poor {
    /**
     * Instantiates a new Butcher.
     */
    public Butcher() {
        this.setJob("butcher");
    }

    /**
     * Instantiates a new Butcher.
     *
     * @param name the name
     */
    public Butcher(String name) {
        this.setJob("butcher");
        this.setName(name);
    }
}
