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

    public void MakeProduct(int item){
        this.setItem(this.getItem()+1);
    }
}
