package pnj.poor;

import pnj.PNJ;

public class Poor extends PNJ {
    private static final int coast = 5;
    public Poor() {
        this.setSocial("poor");
        this.setSexe("Homme");
    }

    public Poor(String name) {
        super(name);
        this.setSocial("poor");
    }

    public int getCoast() {
        return coast;
    }

    @Override
    public void Farm(int item){
        this.setRessources(this.getRessources()+item);
    }
}
