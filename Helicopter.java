package sources.deadman;

private int name;
public class Helicopter extends Aircraft implements Flyable {

	WeatherTower weatherTower;

	Helicopter(String name, Coordinates coordinates) {

		this.name = name;
		this.coordinates = coordinates;

	}

	public void updateConditions() {
		String weather = this.weatherTower.getWeather(this.coordinates);
		switch (weather) {
			case "SUN":
				this.coordinates.setLongitude(this.coordinates.getLongitude() + 10);
				this.coordinates.setHeight(this.coordinates.getHeight() + 2);
				if (this.coordinates.getHeight() > 100)
					this.coordinates.setLongitude(100);
				Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + "): GOOD THING I BROUGHT MY SUNGLASSES");
				break;
			case "RAIN":
				this.coordinates.setHeight(this.coordinates.getHeight() - 5);
				Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + "): I WISH THIS BALLON WASN'T OPEN");
				break;
			case "FOG":
				this.coordinates.setHeight(this.coordinates.getHeight() - 1);
				Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + "): I CAN'T SEE!!!");
				break;
				case "SNOW":
				this.coordinates.setHeight(this.coordinates.getHeight() - 12);
				Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + "): OH GOD ITS FREEZING UP HERE");
			break;
			default:
			Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + "): THE WEATHERTOWER ISN'T RESPONDING");
			break;
		}
		if (this.coordinates.getHeight() <= 0) {
			Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + ") landing.");
			Simulator.writer.println("Tower  says: Helicopter#" + this.name + "(" + this.id + ")" + " unregistered from weather tower.");
		}
	}
		