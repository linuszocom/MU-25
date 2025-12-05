package vecka49.DecoratorPattern;

public class Sugar implements Coffee {
    private Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return this.coffee.getCost() + 2.0;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", Socker";
    }
}
