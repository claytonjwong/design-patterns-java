package Observer;

import java.util.List;
import java.util.ArrayList;

public class NewsFeed implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void notifyObservers(String s) {
        observers.forEach(o -> o.notify(s));
    }
}
