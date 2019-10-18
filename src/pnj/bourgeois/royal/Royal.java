package pnj.bourgeois.royal;

import pnj.bourgeois.Bourgeois;

/**
 * The type Royal.
 */
public class Royal extends Bourgeois {
    /**
     * Instantiates a new Royal.
     *
     * @param name the name
     */
    public Royal(String name) {
        this.setJob("royal");
        this.setName(name);
    }

    /**
     * Instantiates a new Royal.
     */
    public Royal() {
        this.setJob("royal");
    }
}
