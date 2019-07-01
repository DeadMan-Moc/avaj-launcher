package sources.deadman;

private int name;
public class Helicopter extends Aircraft implements Flyable {

    WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {

        this.name = name;
        this.coordinates = coordinates;

    }

    public void updateConditions() {

    }

    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
    }

}
