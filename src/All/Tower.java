package All;

import java.util.ArrayList;

public abstract class Tower {

    private ArrayList<Flyable> observers = new ArrayList<>();

    public void register(Flyable flyabe) {
        observers.add(flyabe);
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
    }

    protected void condtionsChanged() {
        
    }
}
