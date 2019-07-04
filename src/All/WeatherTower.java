package All;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates) {
        return(getWeather().getCurrentWeather(coordinates));
    }

    void changeWeather(){
        this.conditionsChanged;
    }
}
