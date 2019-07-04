package All;

public abstract class AircraftFactory {

        public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height)
        {
            Coordinates coordinates = new Coordinates(latitude, longitude, height);

                if (type.equals("Baloon")) {
                    return new Baloon(name, coordinates);
                }
                else if (type.equals("JetPlane")) {
                    return new JetPlane(name, coordinates);
                }
                else if (type.equals("Helicopter")) {
                    return new Helicopter(name, coordinates);
                } else {
                    return null;
                }

        }
    }


