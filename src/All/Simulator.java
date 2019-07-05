package All;

import java.util.*;
import java.io.*;


public class Simulator {
    private static  WeatherTower weatherTower;
    private static List<Flyable> flyables = new ArrayList<>();
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line = reader.readLine();
            if (line != null) {
                weatherTower = new WeatherTower();
                int simulations = Integer.parseInt(line.split(" ")[0]);
                if (simulations < 0) {
                    System.out.println("Invalid counting" + simulations);
                    System.exit(1);
                }
                while ((line = reader.readLine()) != null) {
                    Flyable flyable = AircraftFactory.newAircraft(line.split(" ")[0], line.split(" ")[1],
                            Integer.parseInt(line.split(" ")[2]), Integer.parseInt(line.split(" ")[3]),
                            Integer.parseInt(line.split(" ")[4]));
                    flyables.add(flyable);
                }
                for (Flyable flyable : flyables) {
                    flyable.registerTower(weatherTower);
                }
                for (int i = 1; i <= simulations; i++) {
                    weatherTower.changeWeather();
                }
            }
        }
            catch (FileNotFoundException e) {
                System.out.println("No file found" + args[0]);
            }
            catch (IOException e) {
                System.out.println("Error in reading the file" + args[0]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("What's your simulation file?");
            }

        }
    }
