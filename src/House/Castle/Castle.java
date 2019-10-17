package House.Castle;

import House.House;

import static Display.Display.*;

public class Castle extends House {
    private static final int  MAXNUMBER = 12;
    public Castle() {
        this.setName("Chateaux");
    }

    @Override
    public String toString() {
        return ANSI_CYAN +this.getName() + ":"+ newLine +
                "   Money = " + this.getItem() + newLine +
                "   Humeur = " + this.getHumor() + newLine +
                "   Number of PNJ = " + this.getNumberPNJ()+ ANSI_RESET;
    }
}
