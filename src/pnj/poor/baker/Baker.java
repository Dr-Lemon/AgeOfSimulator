package pnj.poor.baker;

import pnj.poor.Poor;

/**
 * The type Baker.
 */
public class Baker extends Poor {
    /**
     * Instantiates a new Baker.
     */
    public Baker() {
        this.setJob("baker");
    }

    /**
     * Instantiates a new Baker.
     *
     * @param name the name
     */
    public Baker(String name) {
        this.setName(name);
    }
}
