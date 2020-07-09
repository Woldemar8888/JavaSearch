package by.epamtc.aladzyin.search;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String appliance = "TabletPC";
        String property = "MEMORY_ROM";
        String value = "8000";

        System.out.println(new Matcher().getMatches(appliance, property, value));

    }
}
