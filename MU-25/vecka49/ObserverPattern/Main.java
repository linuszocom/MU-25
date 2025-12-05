package vecka49.ObserverPattern;

public class Main {

    static void main(String[] args) throws InterruptedException {
        NewsAgency agency = new NewsAgency();

        // Skapa prenumeranter
        NewsChannel svt = new NewsChannel("SVT");
        NewsChannel tv4 = new NewsChannel("TV4");

        agency.addObserver(svt);
        agency.addObserver(tv4);

        agency.setNews("Java är kul?");
        agency.setNews("Nu är det snart jul");

    }
}
