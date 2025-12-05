package vecka49.StrategyPattern;

public class ChristmasDiscount implements DiscountStrategy {
    @Override
    public double getPrice(double price) {
        return price * 0.9;
    }
}
