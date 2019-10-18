package pnj;

import static display.Display.*;

/**
 * The type Pnj.
 */
public abstract class PNJ {

    private boolean life;
    private boolean seek;
    private int humor;
    private int sleep;
    private int money;
    private int ressources;
    private String Name;
    private String Job;
    private String Social;
    private String Sexe;

    /**
     * Instantiates a new Pnj.
     *
     * @param name the name
     */
    public PNJ(String name) {
        this.life = true;
        this.seek = false;
        this.humor = 2;
        this.sleep = 0;
        this.ressources = 0;
        this.money = 0;
        this.setName(name);
    }

    /**
     * Instantiates a new Pnj.
     */
    public PNJ() {
        this.life = true;
        this.seek = false;
        this.humor = 2;
        this.sleep = 0;
        this.setName("Kevin");
    }

    /**
     * Gets coast.
     *
     * @return the coast
     */
    public abstract int getCoast();

    /**
     * Gets sexe.
     *
     * @return the sexe
     */
    public String getSexe() {
        return Sexe;
    }

    /**
     * Sets sexe.
     *
     * @param sexe the sexe
     */
    public void setSexe(String sexe) {
        Sexe = sexe;
    }

    /**
     * Eat.
     *
     * @param item the item
     */
    public void Eat(int item) {
        this.ressources -= item;
    }

    /**
     * Farm.
     *
     * @param item the item
     */
    public void Farm(int item) {
        System.out.println("Error classe non surchargé");
    }

    /**
     * Gets job.
     *
     * @return the job
     */
    public String getJob() {
        return Job;
    }

    /**
     * Sets job.
     *
     * @param job the job
     */
    public void setJob(String job) {
        Job = job;
    }


    /**
     * Is life boolean.
     *
     * @return the boolean
     */
    public boolean isLife() {
        return life;
    }

    /**
     * Sets life.
     *
     * @param life the life
     */
    public void setLife(boolean life) {
        this.life = life;
    }

    /**
     * Is seek boolean.
     *
     * @return the boolean
     */
    public boolean isSeek() {
        return seek;
    }

    /**
     * Sets seek.
     *
     * @param seek the seek
     */
    public void setSeek(boolean seek) {
        this.seek = seek;
    }

    /**
     * Gets humor.
     *
     * @return the humor
     */
    public int getHumor() {
        return humor;
    }

    /**
     * Sets humor.
     *
     * @param humor the humor
     */
    public void setHumor(int humor) {
        this.humor = humor;
    }

    /**
     * Gets sleep.
     *
     * @return the sleep
     */
    public int getSleep() {
        return sleep;
    }

    /**
     * Sets sleep.
     *
     * @param sleep the sleep
     */
    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Gets social.
     *
     * @return the social
     */
    public String getSocial() {
        return Social;
    }

    /**
     * Sets social.
     *
     * @param social the social
     */
    public void setSocial(String social) {
        Social = social;
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

    @Override
    public String toString() {
        return "pnj sans type :" + newLine +
                "   life=" + life + newLine +
                "   seek=" + seek + newLine +
                "   humor=" + humor + newLine +
                "   sleep=" + sleep + newLine +
                "   money=" + money + newLine +
                "   ressources=" + ressources + newLine +
                "   Name='" + Name + '\'' + newLine +
                "   Job='" + Job + '\'' + newLine +
                "   Social='" + Social + '\'' + newLine +
                '}';
    }


}
