package sources.deadman;

public class Flyable  {
    public void updateConditions();
    public void registerTower(WeatherTower WeatherTower) {
        this.WeatherTower = WeatherTower;
    }
}
