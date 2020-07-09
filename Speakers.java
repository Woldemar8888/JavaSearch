package by.epamtc.aladzyin.search;

import java.util.Map;

public class Speakers extends Appliance {
    private final int POWER_CONSUMPTION;
    private final int NUMBER_OF_SPEAKERS;
    private final String FREQUENCY_RANGE;
    private final int CORD_LENGTH;

    public Speakers(int POWER_CONSUMPTION, int NUMBER_OF_SPEAKERS, String FREQUENCY_RANGE, int CORD_LENGTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
        this.CORD_LENGTH = CORD_LENGTH;
    }

    public Speakers(Map<String, String> params) {
        POWER_CONSUMPTION = Integer.parseInt(params.get("POWER_CONSUMPTION"));
        NUMBER_OF_SPEAKERS = Integer.parseInt(params.get("NUMBER_OF_SPEAKERS"));
        FREQUENCY_RANGE = params.get("FREQUENCY_RANGE");
        CORD_LENGTH = Integer.parseInt(params.get("CORD_LENGTH"));
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", NUMBER_OF_SPEAKERS=" + NUMBER_OF_SPEAKERS +
                ", FREQUENCY_RANGE='" + FREQUENCY_RANGE + '\'' +
                ", CORD_LENGTH=" + CORD_LENGTH +
                '}';
    }
}
