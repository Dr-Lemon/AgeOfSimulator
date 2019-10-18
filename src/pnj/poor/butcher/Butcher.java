package pnj.poor.butcher;

import pnj.poor.Poor;

public class Butcher extends Poor {
    public Butcher() {
        this.setJob("butcher");
    }

    public Butcher(String name) {
        this.setJob("butcher");
        this.setName(name);
    }
}
