package PNJ.Poor;

import PNJ.PNJ;

public class Poor extends PNJ {
    public Poor() {
    }
    public void MakeProduct(int item){
        this.setItem(this.getItem()+1);
    }
}
