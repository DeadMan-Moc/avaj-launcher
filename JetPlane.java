package sources.deadman;

public class JetPlane extends Aircraft implements Flyable {

	private WeatherTower weatherTower;

	public void updateConditions(){
		String weather = this.weatherTower.getWeather(this.coordinates);
		switch (weather) {
			case "SUN":
				this.coordinates.setLongitude(this.coordinates.getLongitude() + 10);
				this.coordinates.setHeight(this.coordinates.getHeight() + 2;
				if (this.coordinates.getHeight() > 100)
					this.coordinates.setLongitude(100);
				Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
				break;
			case "RAIN":
				this.coordinates.setHeight(this.coordinates.getHeight() + 5);
				Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + "): I WISH THIS BALLON WASN'T OPEN");
				break;
			case "FOG":
				this.coordinates.setHeight(this.coordinates.getHeight() + 1);
				Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + "): I CAN'T SEE!!!");
				break;
				case "SNOW":
				this.coordinates.setHeight(this.coordinates.getHeight() - 12);
				Simulator.writer.println("JetPlane#" + this.name + "(" + this.id + "): THE SNOW IS FREEZING MY WINDOWS THEY ARE GOING TO CRACK");
				break;
			default:
			Simulator.writer.println("JetPlane#" + this.name + "(" + this.id + "): ALL HOPE IS LOST I CAN't COUNTACT THE WEATHER TOWER");
			break;
		}
		if (this.coordinates.getHeight() <= 0) {
			Simulator.writer.println("JetPlane#" + this.name + "(" + this.id + ") landing.");
			Simulator.writer.println("Tower  says: JetPlane#" + this.name + "(" + this.id + ")" + " unregistered from weather tower.");
		}
	}

	public	void	registerTower(WeatherTower weatherTower) {
		this.weatherTower = weatherTower;
		Simulator.writer.println("Tower says: JetPlane#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
		this.weatherTower.register(this);
	}

}
		}
	}
