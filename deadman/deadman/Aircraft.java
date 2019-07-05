package deadman;

public abstract class Aircraft {

    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter = 0;

    protected Aircraft(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;

        this.id = idCounter;
        idCounter = ++idCounter;
    }

    private long nextId() {
        id = ++idCounter;
        return (id);
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }
}