package All;

public class Baloon extends Aircraft implements Flyable {
    
    public WeatherTower weatherTower;

    Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }
    public	void	updateConditions() {
		String weather = this.weatherTower.getWeather(this.coordinates);
		switch (weather) {
			case "SUN":
//				this.coordinates.setLongitude(this.coordinates.getLongitude() + 2);
//				this.coordinates.setHeight(this.coordinates.getHeight() + 4);
				if (this.coordinates.getHeight() > 100)
					this.coordinates.setLongitude(100);
				//Simulator.writer.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
				System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
                break;
            case "RAIN":
                //this.coordinates.setHeight(this.coordinates.getHeight() - 5);
				//Simulator.writer.println("All.Baloon#" + this.name + "(" + this.id + "): I WISH THIS BALLON WASN'T OPEN");
				this.coordinates = new Coordinates(coordinates.getLongitude() + 4, coordinates.getLatitude() + 2, coordinates.getHeight() - 5);
				System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
				break;
			case "FOG":
				this.coordinates = new Coordinates(coordinates.getLongitude() + 10, coordinates.getLatitude() + 2, coordinates.getHeight() - 2);
				//this.coordinates.setHeight(this.coordinates.getHeight() - 2);
				//Simulator.writer.println("All.Baloon#" + this.name + "(" + this.id + "): I CAN'T SEE!!!");
				System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
				break;
			case "SNOW":
				this.coordinates = new Coordinates(coordinates.getLongitude() + 10, coordinates.getLatitude() + 2, coordinates.getHeight() - 5);
				//this.coordinates.setHeight(this.coordinates.getHeight() - 15);
//				Simulator.writer.println("All.Baloon#" + this.name + "(" + this.id + "): IM STARTING TO FREEZE UP HERE!");
//				Simulator.writer.println("All.Tower  says: All.Baloon#" + this.name + "(" + this.id + ")" + " unregistered from weather tower.");
				System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
				break;
			default:
				//Simulator.writer.println("All.Baloon#" + this.name + "(" + this.id + "): I CANT CONTACT THE WEATHER TOWER");
				System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
				break;
		}
		if (this.coordinates.getHeight() <= 0){
			//Simulator.writer.println("All.Baloon#" + this.name + "(" + this.id + ") landing.");
			System.out.println("All.Baloon#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
		}
    }
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
    }
}
