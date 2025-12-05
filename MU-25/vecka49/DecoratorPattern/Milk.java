package vecka49.DecoratorPattern;

public class Milk implements Coffee{
    private Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return this.coffee.getCost() + 5.0;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", Mjölk";
    }
}
