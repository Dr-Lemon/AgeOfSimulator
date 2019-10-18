package mayor;

import static display.Display.*;

/**
 * The type Mayor.
 */
public class Mayor {
    private int ressources, money;
    private static int dept = 0;


    /**
     * Give money.
     *
     * @param money the money
     */
    public void GiveMoney(int money) {
        this.money -= money;
    }

    /**
     * Give ressources.
     *
     * @param ressources the ressources
     */
    public void GiveRessources(int ressources) {
        this.ressources -= ressources;
    }

    /**
     * Instantiates a new Mayor.
     */
    public Mayor() {
        this.setRessources(20);
        this.setMoney(400);
    }

    /**
     * Gets dept.
     *
     * @return the dept
     */
    public int getDept() {
        return dept;
    }

    /**
     * Sets dept.
     *
     * @param dept the dept
     */
    public void setDept(int dept) {
        this.dept = dept;
    }

    /**
     * Gets ressources.
     *
     * @return the ressources
     */
    public int getRessources() {
        return ressources;
    }

    /**
     * Sets ressources.
     *
     * @param ressources the ressources
     */
    public void setRessources(int ressources) {
        this.ressources = ressources;
    }

    /**
     * Gets money.
     *
     * @return the money
     */
    public int getMoney() {
        return money;
    }

    /**
     * Sets money.
     *
     * @param money the money
     */
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return ANSI_BLUE + "MAIRIE : " + newLine + ANSI_RESET +
                ANSI_PURPLE + "   Ressources=" + ressources + ANSI_RESET +
                ANSI_CYAN + "   Money=" + money + ANSI_RESET +
                " $";
    }


}
