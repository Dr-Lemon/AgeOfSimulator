package mayor;

import static display.Display.*;

public class Mayor {
    private int ressources, money;
    private static int dept=0;


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
    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
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
