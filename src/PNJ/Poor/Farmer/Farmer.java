package PNJ.Poor.Farmer;

import House.Farm.Farm;
import PNJ.Poor.Poor;

public class Farmer extends Poor {
    public Farmer() {
        this.setJob("Farmer");
    }
    public Farmer(String name){
        this.setJob("Farmer");
        this.setName(name);
    }
}
