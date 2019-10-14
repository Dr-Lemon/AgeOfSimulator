package Mayor;

import PNJ.PNJ;

public class Mayor {
    private int ressources, money;
    private static final int coastBourgeois = 10;
    private static final int coastPoor = 5;
    private static final int coastWife = 7;
    private static final int coastBourgeoisHouse = 20;
    private static final int coastPoorHouse = 20;

    public void AddPNJ(){

    }

    public void AddHouse(){

    }

    public void GiveMoney(int money){
        this.money -= money;
    }

    public void GiveRessources(int ressources){
        this.ressources -= ressources;
    }

    public Mayor(int ressources, int money) {
        this.ressources = ressources;
        this.money = money;
    }

    public static int getCoastBourgeois() {
        return coastBourgeois;
    }

    public static int getCoastPoor() {
        return coastPoor;
    }

    public static int getCoastWife() {
        return coastWife;
    }

    public static int getCoastBourgeoisHouse() {
        return coastBourgeoisHouse;
    }

    public static int getCoastPoorHouse() {
        return coastPoorHouse;
    }

    public int getRessources() {
        return ressources;
    }

    public void setRessources(int ressources) {
        this.ressources = ressources;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Mayor() {
    }
}
