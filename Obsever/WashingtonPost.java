package Obsever;

public class WashingtonPost implements Observer {
    private static final String KEY = "Jeff Bezos";
    public void notify(String s) {
        if (s.contains(KEY)) {
            System.out.println("The Washington Post: " + s);
        }
    }
}
