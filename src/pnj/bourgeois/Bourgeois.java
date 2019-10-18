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

    public void Farm(){
        if(this.getHumor()==1){
            this.setMoney(this.getMoney() + 1);
        }
        if(this.getHumor()==2){
            this.setMoney(this.getMoney() + 1 + (int)(Math.random() * ((2 - 1) + 1)));
        }
        if(this.getHumor()==3){
            this.setMoney(this.getMoney() + 1 + (int)(Math.random() * ((3 - 1) + 1)));
        }
    }
}
