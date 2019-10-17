package Mayor;


public class Mayor {
    public static String newLine = System.getProperty("line.separator");
    public static final String ANSI_RESET = "\u001B[0m"; // PERMET L'AFFIFICHAGE EN COULEUR
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
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
        return ANSI_BLUE +"MAIRIE : " + newLine +ANSI_RESET+
                ANSI_PURPLE +"   Ressources=" + ressources + ANSI_RESET +
                ANSI_CYAN +"   Money=" + money + ANSI_RESET +
                " $";
    }







}
