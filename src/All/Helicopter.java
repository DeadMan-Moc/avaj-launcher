package All;

public class Helicopter extends Aircraft implements Flyable {

    WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
        String weather = this.weatherTower.getWeather(this.coordinates);
        switch (weather) {
            case "SUN":
                this.coordinates.setLongitude(this.coordinates.getLongitude() + 10);
                this.coordinates.setHeight(this.coordinates.getHeight() + 2);
                if (this.coordinates.getHeight() > 100)
                    this.coordinates.setLongitude(100);
                //Simulator.writer.println("All.Helicopter#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
                System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
                break;
            case "RAIN":
                this.coordinates.setHeight(this.coordinates.getHeight() - 5);
                //Simulator.writer.println("All.Helicopter#" + this.name + "(" + this.id + "): I WISH THIS BALLON WASN'T OPEN");
                System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
                break;
            case "FOG":
                this.coordinates.setHeight(this.coordinates.getHeight() - 1);
                //Simulator.writer.println("All.Helicopter#" + this.name + "(" + this.id + "): I CAN'T SEE!!!");
                System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
                break;
            case "SNOW":
                this.coordinates.setHeight(this.coordinates.getHeight() - 12);
                //Simulator.writer.println("All.Helicopter#" + this.name + "(" + this.id + "): OH GOD ITS FREEZING UP HERE");
                System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
                break;
            default:
                //Simulator.writer.println("All.Helicopter#" + this.name + "(" + this.id + "): THE WEATHERTOWER ISN'T RESPONDING");
                System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
                break;
//
//            if (this.coordinates.getHeight() <= 0) {
//                //Simulator.writer.println("All.Helicopter#" + this.name + "(" + this.id + ") landing.");
//                //Simulator.writer.println("All.Tower  says: All.Helicopter#" + this.name + "(" + this.id + ")" + " unregistered from weather tower.");
//                System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
//            }
        }

//        public	void	registerTower(WeatherTower weatherTower) {
//            //Simulator.writer.println("All.Tower says: All.JetPlane#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
//            System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
//            this.weatherTower.register(this);
//        }
    }

    @Override
    public void registerTower(WeatherTower WeatherTower) {
        System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
        this.weatherTower.register(this);
    }
}
		