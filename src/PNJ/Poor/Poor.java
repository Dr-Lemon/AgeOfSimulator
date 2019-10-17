package PNJ.Poor;

import PNJ.PNJ;

public class Poor extends PNJ {
    private static final int coast = 5;
    public Poor() {
        this.setSocial("Poor");
        this.setSexe("Homme");
    }

    public Poor(String name) {
        super(name);
        this.setSocial("Poor");
    }

    public int getCoast() {
        return coast;
    }

    @Override
    public void Farm(int item){
        this.setRessources(this.getRessources()+item);
    }
}
