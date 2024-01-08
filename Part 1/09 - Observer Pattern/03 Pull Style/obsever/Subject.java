package obsever;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void notifyObserver() {
        for (var observer : observers) {
            observer.update();
        }
    }
}
