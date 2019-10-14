package House.Castle;

import House.House;

public class Castle extends House {
    private static final int  MAXNUMBER = 12;

    public Castle() {
        this.setName("Chateaux");
    }

    @Override
    public String toString() {
        return "Name{" + this.getName() +
                ",item=" + this.getRessources() +
                ", humor=" + this.getHumor() +
                '}';
    }
}
