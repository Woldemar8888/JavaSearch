package by.epamtc.aladzyin.search;

import java.util.Map;

public class TabletPC extends Appliance {
    private final int BATTERY_CAPACITY;
    private final int DISPLAY_INCHES;
    private final int MEMORY_ROM;
    private final int FLASH_MEMORY_CAPACITY;
    private final String COLOR;

    public TabletPC(int BATTERY_CAPACITY, int DISPLAY_INCHES, int MEMORY_ROM, int FLASH_MEMORY_CAPACITY, String COLOR) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.DISPLAY_INCHES = DISPLAY_INCHES;
        this.MEMORY_ROM = MEMORY_ROM;
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
        this.COLOR = COLOR;
    }

    public TabletPC(Map<String, String> params) {
        BATTERY_CAPACITY = Integer.parseInt(params.get("BATTERY_CAPACITY"));
        DISPLAY_INCHES = Integer.parseInt(params.get("DISPLAY_INCHES"));
        MEMORY_ROM = Integer.parseInt(params.get("MEMORY_ROM"));
        FLASH_MEMORY_CAPACITY = Integer.parseInt(params.get("FLASH_MEMORY_CAPACITY"));
        COLOR = params.get("COLOR");
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", DISPLAY_INCHES=" + DISPLAY_INCHES +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", FLASH_MEMORY_CAPACITY=" + FLASH_MEMORY_CAPACITY +
                ", COLOR='" + COLOR + '\'' +
                '}';
    }
}
