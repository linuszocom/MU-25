package vecka49.StrategyPattern;

public class Main {

    static void main(String[] args) {
        double currentPrice = 1000;

        DiscountStrategy strategy = new ChristmasDiscount();

        double newPrice = strategy.getPrice(currentPrice);

        System.out.println("Pris med vald strategi: " + newPrice);

        // Kunden loggar in och blir medlem
        strategy = new MemberDiscount();

        System.out.println("Pris för medlem: " + strategy.getPrice(currentPrice));
    }

}
