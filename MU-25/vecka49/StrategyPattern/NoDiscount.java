package vecka49.StrategyPattern;

public class NoDiscount implements DiscountStrategy{
    @Override
    public double getPrice(double price) {
        return price;
    }
}
