package pnj.bourgeois;

import pnj.PNJ;

public class Bourgeois extends PNJ {
    private static final int coast = 10;

    public Bourgeois(String name) {
        super(name);
        this.setRessources(10);
        this.setSocial("bourgeois");
        this.setSexe("Homme");
    }

    public int getCoast() {
        return coast;
    }

    public Bourgeois() {
        this.setSocial("bourgeois");
    }

    @Override
    public void Farm(int item){
        this.setMoney(this.getMoney()+item);
    }

}
