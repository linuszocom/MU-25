package vecka49.DecoratorPattern;

public class Main {

    static void main(String[] args) {
        //1. En vanlig kaffe
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " . " + myCoffee.getCost());

        //2. Vi lägger till mjölk
        // Vi stoppar ner kaffet i mjölk-klassen
        myCoffee = new Milk(myCoffee);
        System.out.println(myCoffee.getDescription() + " : " + myCoffee.getCost());
        
        // Vi lägger till socker
        // Stoppa ner mjölk-kaffet i socker klassen
        myCoffee = new Sugar(myCoffee);
        System.out.println(myCoffee.getDescription() + " : " + myCoffee.getCost());
    }
}
