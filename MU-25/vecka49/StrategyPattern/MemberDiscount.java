package vecka49.StrategyPattern;

public class MemberDiscount implements DiscountStrategy{
    @Override
    public double getPrice(double price) {
        return price * 0.8;
    }
}
