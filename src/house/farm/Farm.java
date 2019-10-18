package house.farm;

import house.House;

import static display.Display.*;

/**
 * The type Farm.
 */
public class Farm extends House {
    private static final int MaxNumber = 9;


    /**
     * Gets max number.
     *
     * @return the max number
     */
    public static int getMaxNumber() {
        return MaxNumber;
    }

    /**
     * Instantiates a new Farm.
     */
    public Farm() {
        this.setName("Ferme");
    }

    @Override
    public String toString() {
        return ANSI_PURPLE + this.getName() + ":" + newLine +
                "   Ressources = " + this.getItem() + newLine +
                "   Humeur = " + this.getHumor() + newLine +
                "   Number of pnj = " + this.getNumberPNJ() + ANSI_RESET;
    }
}
