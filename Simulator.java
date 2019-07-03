package sources.deadman;

import java.util.*;
import java.io;
import java.io.*;

public class Simulator {
    private static  WeatherTower weatherTower;
    private static List<Flyable> flyables = new ArrayList<>();
    public static void main(String[] args) throws InterreptedException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line = reader.readline();
            if (line != null) {
                weatherTower = new WeatherTower();
                int simulations = Integer.parseInt(line.split(" ")[0]);
            }
        }
    }
}