package Obsever;

public class NewYorkTimes implements Observer {
    private static final String KEY = "Manhattan";
    public void notify(String s) {
        if (s.contains(KEY)) {
            System.out.println("New York Times: " + s);
        }
    }
}
