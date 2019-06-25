package sources.deadman;

public class Baloon extends Aircraft implements Flyable {

    public WeatherTower weatherTower;

    Baloon(Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions();

    public void registerTower(WeatherTower weatherTower) {
        
    }
}
