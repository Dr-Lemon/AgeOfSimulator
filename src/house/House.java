package house;

import pnj.PNJ;

import static display.Display.*;

import java.util.ArrayList;


/**
 * The type House.
 */
public class House {

    private int item;
    private int humor;
    private static int MaxNumber;
    private String name;
    private static int Set = 0;
    private ArrayList<PNJ> CurrentPnj = new ArrayList<PNJ>();
    private ArrayList<PNJ> WPnj = new ArrayList<PNJ>();
    private ArrayList<PNJ> HPnj = new ArrayList<PNJ>();


    /**
     * Gets set.
     *
     * @return the set
     */
    public static int getSet() {
        return Set;
    }

    /**
     * Sets set.
     *
     * @param set the set
     */
    public static void setSet(int set) {
        Set = set;
    }

    /**
     * Gets max number.
     *
     * @return the max number
     */
    public static int getMaxNumber() {
        return MaxNumber;
    }

    /**
     * Instantiates a new House.
     */
    public House() {
        this.name = "Maison sans type";
        this.item = 0;
        this.humor = 3;
        //bourgeois Thierry = new bourgeois();
        //wife Phillipine = new wife();

    }

    /**
     * Push pnj.
     *
     * @param pnj the pnj
     */
    public void PushPNJ(PNJ pnj) {
        this.CurrentPnj.add(pnj);
        if (pnj.getSexe() == "Homme") {
            this.HPnj.add(pnj);
        }
        if (pnj.getSexe() == "Femme") {
            this.WPnj.add(pnj);
        }
    }

    /**
     * Gets number pnj.
     *
     * @return the number pnj
     */
    public int getNumberPNJ() {
        return this.CurrentPnj.size();
    }

    /**
     * Gets number wpnj.
     *
     * @return the number wpnj
     */
    public int getNumberWPNJ() {
        return this.WPnj.size();
    }

    /**
     * Gets number hpnj.
     *
     * @return the number hpnj
     */
    public int getNumberHPNJ() {
        return this.HPnj.size();
    }

    /**
     * Product.
     *
     * @param humor the humor
     */
    public void Product(int humor) {
        if (humor == 3) {
            for (int i = 0; i < this.CurrentPnj.size(); ++i) {
                PNJ PNJ = CurrentPnj.get(i); // ON POINTE VERS UN pnj
                PNJ.Farm(4);
                PNJ.Eat(1);
                if (PNJ.getSocial() == "poor") {
                    this.item += PNJ.getRessources();
                }
                if (PNJ.getSocial() == "bourgeois") {
                    this.item += PNJ.getMoney();
                }
                PNJ.setRessources(0);
            }
        }
        if (humor == 2) {
            for (int i = 0; i < this.CurrentPnj.size(); ++i) {
                PNJ PNJ = CurrentPnj.get(i); // ON POINTE VERS UN pnj
                PNJ.Farm();
                PNJ.Eat();
                if (PNJ.getSocial() == "poor") {
                    this.item += PNJ.getRessources();
                }
                if (PNJ.getSocial() == "bourgeois") {
                    this.item += PNJ.getMoney();


                    PNJ.setRessources(0);
                }
            }
        }
        if (humor == 1) {
            for (int i = 0; i < this.CurrentPnj.size(); ++i) {
                PNJ PNJ = CurrentPnj.get(i); // ON POINTE VERS UN pnj
                PNJ.Farm(2);
                PNJ.Eat(1);
                if (PNJ.getSocial() == "poor") {
                    this.item += PNJ.getRessources();
                }
                if (PNJ.getSocial() == "bourgeois") {
                    this.item += PNJ.getMoney();
                }
                PNJ.setRessources(0);
            }
        }

    }


    /**
     * Gets item.
     *
     * @return the item
     */
    public int getItem() {
        return item;
    }

    /**
     * Sets item.
     *
     * @param item the item
     */
    public void setItem(int item) {
        this.item = item;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets humor.
     *
     * @return the humor
     */
    public int getHumor() {
        return humor;
    }


    public void finalize() {
        System.out.println(ANSI_RED + "Tous les habitants de cette maison sont parti" + ANSI_RESET);
        CurrentPnj.clear();
    }

    /**
     * Change humor.
     *
     * @param i the
     */
    public void ChangeHumor(int i) {
        switch (i) {
            case (-1):
                if (this.humor == 1) {
                    this.finalize();
                } else {
                    this.humor -= 1;
                }
                break;
            case (1):
                if (this.humor == 3) {
                } else {
                    this.humor += 1;
                }
                break;
        }
    }


}
