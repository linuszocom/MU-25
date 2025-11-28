```
// Detta är ett KONTRAKT
// Definerera ett "kan-göra" beteende
public interface Flyable {
    // Alla metoder i ett interface är public och abstract
    void fly();
}

```

````
// Detta är superklassen (föräldern)
public abstract class Animal {

    // Fält som ALLA djur delar
    protected String name;
    protected int age;

    // Konstruktor för att bygga ett djur
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metod som ALLA djur delar
    public void eat() {
        System.out.println(this.name + " äter mat...");
    }

    // Abstrakt metod
    // Tvingar alla subklasser (barn) att implementera denna metod
    public abstract void makeSound();

    // Metod som barnen (subklass) kan specialisera
    /*
    public void makeSound() {
        System.out.println("Ett generiskt djurläte..");
    }

     */
}
````
````
// Detta är ett KONTRAKT
// Definerera ett "kan-göra" beteende
public interface Flyable {
    // Alla metoder i ett interface är public och abstract
    void fly();
}

````

````
public class Bird extends Animal implements Flyable {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " kvittrar!");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " flaxar med singa vingar");
    }

}
````

````

public class Airplane implements Flyable {

    private String model;

    public Airplane(String model) {
        this.model = model;
    }

    @Override
    public void fly(){
        System.out.println(this.model + " startar sina motorer");
    }

}
````


