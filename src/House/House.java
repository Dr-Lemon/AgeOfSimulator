package House;

import PNJ.PNJ;

import java.util.ArrayList;

public class House {
    public int item;
    ArrayList<PNJ>;
    public House() {
        this.item = 20;
    }

    private int resources, MaxNumber, NumberPerson;
    private String name;

    public int getRessources() {
        return resources;
    }

    public void setRessources(int ressources) {
        this.resources = ressources;
    }

    public int getMAXNUMBER() {
        return MaxNumber;
    }

    public void setMAXNUMBER(int MAXNUMBER) {
        this.MaxNumber = MAXNUMBER;
    }

    public int getNumber_pers() {
        return number_pers;
    }

    public void setNumber_pers(int number_pers) {
        this.number_pers = number_pers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
