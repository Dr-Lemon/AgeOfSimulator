package PNJ;

public class PNJ {
    private boolean life;
    private boolean seek;
    private int humor;
    private int sleep;
    private int money;
    private int ressources;
    private String Name;
    private String Job;
    private String Social;

    public PNJ(String name) {
        this.life = true;
        this.seek = false;
        this.humor = 2;
        this.sleep = 0;
        this.ressources = 0;
        this.money=0;
        this.setName(name);
    }

    public PNJ() {
        this.life = true;
        this.seek = false;
        this.humor = 2;
        this.sleep = 0;
        this.setName("Kevin");
    }

    public void Eat(int item){
        this.ressources -=item;
    }

   public void Farm(int item){
       System.out.println("Error classe non surchargé");
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }


    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public boolean isSeek() {
        return seek;
    }

    public void setSeek(boolean seek) {
        this.seek = seek;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSocial() {
        return Social;
    }

    public void setSocial(String social) {
        Social = social;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getRessources() {
        return ressources;
    }

    public void setRessources(int ressources) {
        this.ressources = ressources;
    }

    @Override
    public String toString() {
        return "PNJ{" +
                "life=" + life +
                ", seek=" + seek +
                ", humor=" + humor +
                ", sleep=" + sleep +
                ", money=" + money +
                ", ressources=" + ressources +
                ", Name='" + Name + '\'' +
                ", Job='" + Job + '\'' +
                ", Social='" + Social + '\'' +
                '}';
    }
}
