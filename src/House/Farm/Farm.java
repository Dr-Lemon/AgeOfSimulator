package House.Farm;

import House.House;

import static Display.Display.*;

public class Farm extends House {
    private static final int  MaxNumber = 9;


    public static int getMaxNumber() {
        return MaxNumber;
    }

    public Farm() {
        this.setName("Ferme");
    }
    @Override
    public String toString() {
        return  ANSI_PURPLE +this.getName() + ":"+ newLine +
                "   Ressources = " + this.getItem() + newLine +
                "   Humeur = " + this.getHumor() + newLine +
                "   Number of PNJ = " + this.getNumberPNJ() +ANSI_RESET;
    }
}
