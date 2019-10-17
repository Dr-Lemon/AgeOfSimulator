package Mayor;

import static Display.Display.*;

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
