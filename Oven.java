package by.epamtc.aladzyin.search;

import java.util.Map;

public class Oven extends Appliance {
    private final int POWER_CONSUMPTION;
    private final int WEIGHT;
    private final int CAPACITY;
    private final int DEPTH;
    private final double HEIGHT;
    private final double WIDTH;

    public Oven(int POWER_CONSUMPTION, int WEIGHT, int CAPACITY, int DEPTH, double HEIGHT, double WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.CAPACITY = CAPACITY;
        this.DEPTH = DEPTH;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    public Oven(Map<String, String> params) {
        POWER_CONSUMPTION = Integer.parseInt(params.get("POWER_CONSUMPTION"));
        WEIGHT = Integer.parseInt(params.get("WEIGHT"));
        CAPACITY = Integer.parseInt(params.get("CAPACITY"));
        DEPTH = Integer.parseInt(params.get("DEPTH"));
        HEIGHT = Double.parseDouble(params.get("HEIGHT"));
        WIDTH = Double.parseDouble(params.get("WIDTH"));
    }

    @Override
    public String toString() {
        return "Oven{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", CAPACITY=" + CAPACITY +
                ", DEPTH=" + DEPTH +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}


