package House.Farm;

import House.House;

public class Farm extends House {
    private static final int  MAXNUMBER = 9;

    public Farm() {
        this.setName("Ferme");
    }
    @Override
    public String toString() {
        return "Name{" + this.getName() +
                ",item=" + this.getRessources() +
                ", humor=" + this.getHumor() +
                '}';
    }
}
