package pnj.poor.farmer;

import pnj.poor.Poor;

public class Farmer extends Poor {
    public Farmer() {
        this.setJob("farmer");
    }

    public Farmer(String name) {
        this.setJob("farmer");
        this.setName(name);
    }
}
