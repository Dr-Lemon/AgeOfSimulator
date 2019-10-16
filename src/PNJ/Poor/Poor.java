package PNJ.Poor;

import PNJ.PNJ;

public class Poor extends PNJ {
    public Poor() {
        this.setSocial("Poor");
    }

    public Poor(String name) {
        super(name);
        this.setSocial("Poor");
    }

    @Override
    public void Farm(int item){
        this.setRessources(this.getRessources()+item);
    }
}
