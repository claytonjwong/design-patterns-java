package Observer;

interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(String s);
}