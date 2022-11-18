package Obsever;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewsFeed feed = new NewsFeed();
        List<Observer> newspapers = Arrays.asList(
            new WallStreetJournal(),
            new NewYorkTimes(),
            new WashingtonPost());
        newspapers.forEach(feed::registerObserver);
        feed.notifyObservers("Trump knows o'doyle rules");
        feed.notifyObservers("Free pizza in downtown Manhattan");
        feed.notifyObservers("Jeff Bezos owns the Washington Post");
        /*
         * WSJ exclusive! Trump knows o'doyle rules
         * New York Times: Free pizza in downtown Manhattan
         * The Washington Post: Jeff Bezos owns the Washington Post
         */
    }
}
