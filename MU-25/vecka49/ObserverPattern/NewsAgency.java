package vecka49.ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setNews(String news) {
        this.news = news;
        for (Observer observer : observers) {
            observer.update(this.news);
        }
    }

}
