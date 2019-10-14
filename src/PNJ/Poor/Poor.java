package PNJ.Poor;

import PNJ.PNJ;

public class Poor extends PNJ {
    public Poor() {
    }

    public Poor(String name) {
        super(name);
    }

    public void MakeProduct(int item){
        this.setItem(this.getItem()+1);
    }
}
