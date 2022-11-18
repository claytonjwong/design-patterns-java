package Obsever;

public class WallStreetJournal implements Observer {
    private static final String KEY = "Trump";
    public void notify(String s) {
        if (s.contains(KEY)) {
            System.out.println("WSJ exclusive! " + s);
        }
    }
}
