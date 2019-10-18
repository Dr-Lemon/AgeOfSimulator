package pnj.bourgeois.merchant;

import pnj.bourgeois.Bourgeois;

/**
 * The type Merchant.
 */
public class Merchant extends Bourgeois {
    /**
     * Instantiates a new Merchant.
     */
    public Merchant() {
        this.setJob("merchant");
    }

    /**
     * Instantiates a new Merchant.
     *
     * @param name the name
     */
    public Merchant(String name) {
        this.setName(name);
        this.setJob("merchant");
    }
}
