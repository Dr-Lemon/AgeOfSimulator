package PNJ.Wife;

import PNJ.PNJ;

public class Wife extends PNJ {
    public Wife(String name) {
        super(name);
    }
    @Override
    public void Farm(int item){
        System.out.println("La femme se repose encore et encore !");
    }
    public Wife() {
    }

//    public GiveBirth(){
//    }
}
