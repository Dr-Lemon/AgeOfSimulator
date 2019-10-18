package pnj.bourgeois.royal;

import pnj.bourgeois.Bourgeois;

public class Royal extends Bourgeois {
    public Royal(String name) {
        this.setJob("royal");
        this.setName(name);
    }

    public Royal() {
        this.setJob("royal");
    }
}
