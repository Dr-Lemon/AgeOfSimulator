package House.Farm;

import House.House;

public class Farm extends House {
    private static final int  MAXNUMBER = 9;

    public Farm() {
        this.setName("Ferme");
    }
    @Override
    public String toString() {
        return "{" + this.getName() +
                ",Ressources = " + this.getItem() +
                ", humor = " + this.getHumor() +
                ", Number of PNJ = " + this.getNumberPNJ() +
                '}';
    }
}
