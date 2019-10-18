package pnj.bourgeois;

import pnj.PNJ;

/**
 * The type Bourgeois.
 */
public class Bourgeois extends PNJ {
    private static final int coast = 10;

    /**
     * Instantiates a new Bourgeois.
     *
     * @param name the name
     */
    public Bourgeois(String name) {
        super(name);
        this.setRessources(10);
        this.setSocial("bourgeois");
        this.setSexe("Homme");
    }

    public int getCoast() {
        return coast;
    }

    /**
     * Instantiates a new Bourgeois.
     */
    public Bourgeois() {
        this.setSocial("bourgeois");
    }

    @Override
    public void Farm(int item) {
        this.setMoney(this.getMoney() + item);
    }

}
