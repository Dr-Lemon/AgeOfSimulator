package house.castle;

import house.House;

import static display.Display.*;

/**
 * The type Castle.
 */
public class Castle extends House {
    private static final int MaxNumber = 12;

    /**
     * Instantiates a new Castle.
     */
    public Castle() {
        this.setName("Chateaux");
    }


    /**
     * Gets max number.
     *
     * @return the max number
     */
    public static int getMaxNumber() {
        return MaxNumber;
    }

    @Override
    public String toString() {
        return ANSI_CYAN + this.getName() + ":" + newLine +
                "   Money = " + this.getItem() + newLine +
                "   Humeur = " + this.getHumor() + newLine +
                "   Number of pnj = " + this.getNumberPNJ() + ANSI_RESET;
    }
}
