package by.epamtc.aladzyin.search;

import java.util.Map;

public class Laptop extends Appliance {
    private final double BATTERY_CAPACITY;
    private final String OS;
    private final int MEMORY_ROM;
    private final int SYSTEM_MEMORY;
    private final double CPU;
    private final double DISPLAY_INCHS;

    public Laptop(double BATTERY_CAPACITY, String OS, int MEMORY_ROM, int SYSTEM_MEMORY, double CPU, double DISPLAY_INCHS) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.OS = OS;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    public Laptop(Map<String, String> params) {
        BATTERY_CAPACITY = Double.parseDouble(params.get("BATTERY_CAPACITY"));
        OS = params.get("OS");
        MEMORY_ROM = Integer.parseInt(params.get("MEMORY_ROM"));
        SYSTEM_MEMORY = Integer.parseInt(params.get("SYSTEM_MEMORY"));
        CPU = Double.parseDouble(params.get("CPU"));
        DISPLAY_INCHS = Double.parseDouble(params.get("DISPLAY_INCHS"));
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", SYSTEM_MEMORY_=" + SYSTEM_MEMORY +
                ", CPU=" + CPU +
                ", DISPLAY_INCHS=" + DISPLAY_INCHS +
                '}';
    }
}
