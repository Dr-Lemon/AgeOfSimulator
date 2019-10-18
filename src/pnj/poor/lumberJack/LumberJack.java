package pnj.poor.lumberJack;

import pnj.poor.Poor;

/**
 * The type Lumber jack.
 */
public class LumberJack extends Poor {
    /**
     * Instantiates a new Lumber jack.
     *
     * @param name the name
     */
    public LumberJack(String name) {
        this.setJob("lumberJack");
        this.setName(name);
    }

    /**
     * Instantiates a new Lumber jack.
     */
    public LumberJack() {
        this.setJob("lumberJack");
    }
}
