package Mayor;


public class Mayor {
    private int ressources, money;


    public void GiveMoney(int money){
        this.money -= money;
    }

    public void GiveRessources(int ressources){
        this.ressources -= ressources;
    }

    public Mayor() {
        this.setRessources(20);
        this.setMoney(400);
    }

//    public static int getCoastBourgeois() {
//        return coastBourgeois;
//    }
//
//    public static int getCoastPoor() {
//        return coastPoor;
//    }
//
//    public static int getCoastWife() {
//        return coastWife;
//    }
//
//    public static int getCoastBourgeoisHouse() {
//        return coastBourgeoisHouse;
//    }
//
//    public static int getCoastPoorHouse() {
//        return coastPoorHouse;
//    }

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

    @Override
    public String toString() {
        return "Mayor{" +
                "ressources=" + ressources +
                ", money=" + money +
                "$}";
    }







}
