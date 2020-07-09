package by.epamtc.aladzyin.search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Matcher {

    private String path = "appliances_db.txt";

    public List getMatches(String appliance, String property, String value ) throws IOException {

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Appliance> mapList = new ArrayList<>();

        while (bufferedReader.ready()){
            String str = bufferedReader.readLine();

            if (str.startsWith(appliance) && str.contains(property + "=" + value)) {
                mapList.add( createAppliance(str, appliance));
            }
        }

        return mapList;
    }

    private Map<String, String> createParameters(String str) {
        Map<String, String> params = new HashMap<>();
        String lineParameters = str.replaceAll(".*: ", "").trim();

        for (String paramPair : lineParameters.split(",")) {
            String key = paramPair.replaceAll("=.*", "").trim();
            String value = paramPair.replaceAll(".*=", "").trim();
            params.put(key, value);
        }

        return params;
    }

    private Appliance createAppliance(String str, String appliance ){
        Map<String, String> params = createParameters(str);

        switch (appliance){
            case "Oven":
                return new Oven(params);
            case "Laptop":
                return new Laptop(params);

            case "Refrigerator":
                return new Refrigerator(params);
            case "Speakers":
                return new Speakers(params);
            case "TabletPC":
                return  new TabletPC(params);
            case "VacuumCleaner":
                return new VacuumCleaner(params);
            default:
                return null;
        }

    }
}

