package sources.deadman;

public class AicraftFactory
{
    public Flyable newAicraft(String type, String name, int longitude, int latitude, int height)
    {
        Coordinates coordinates = new coordinates(latitude, longitude, height);
        if (type != null) {
            if (type.equals("baloon")) {
                return new Baloon(name, coordinates);
            }
            else if (type.equals("jetplane")) {
                return new JetPlane(name, coordinates);
            }
            else if (type.equals("helicopter")) {
                return new Helicopter(name, coordinates);
            } else {
                return null;
            }
        }
    }
}
