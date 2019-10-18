package pnj.poor;

import pnj.PNJ;

/**
 * The type Poor.
 */
public class Poor extends PNJ {
    private static final int coast = 5;

    /**
     * Instantiates a new Poor.
     */
    public Poor() {
        this.setSocial("poor");
        this.setSexe("Homme");
    }

    /**
     * Instantiates a new Poor.
     *
     * @param name the name
     */
    public Poor(String name) {
        super(name);
        this.setSocial("poor");
    }

    public int getCoast() {
        return coast;
    }

    @Override
    public void Farm(int item) {
        this.setRessources(this.getRessources() + item);
    }
}
