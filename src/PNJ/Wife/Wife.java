package PNJ.Wife;

import PNJ.PNJ;

public class Wife extends PNJ {
    private static final int coast = 7;
    public Wife(String name) {
        super(name);
    }
    @Override
    public void Farm(int item){
        System.out.println("La femme se repose");
    }
    public Wife() {
        this.setSexe("Femme");
    }

    public static int getCoast() {
        return coast;
    }
//    public GiveBirth(){
//    }
}
