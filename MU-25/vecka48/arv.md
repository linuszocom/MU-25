```
// Detta är superklassen (föräldern)
public class Animal {

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

    // Metod som barnen (subklass) kan specialisera
    public void makeSound() {
        System.out.println("Ett generiskt djurläte..");
    }
}
```

```
public class Cat extends Animal {

    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        // Anropar Animal-konstruktorn
        super(name, age);

        // Det Cat-specifika fältet
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " säger: Mjau!");
    }

}
```

```

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        // Anropa Animal-konstruktorn
        super(name, age);

        // Dog-specifika fältet
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " säger: Voff voff!");
    }

}
```

```
import java.util.ArrayList;
import java.util.List;

public class Application {

    static void main(String[] args) {

        Dog hundenFido = new Dog("Fido", 4, "Tax");
        Cat kattenSigge = new Cat("Sigge", 3, true);

        //List<Dog> dogs = new ArrayList<>();
        //List<Cat> cats = new ArrayList<>();

        // Början av Polymorfism
        List<Animal> myPets = new ArrayList<>();

        // Vi lägger till en hund
        myPets.add(hundenFido); // Detta fungerar eftersom Dog är ETT Animal

        // VI lägger till en katt
        myPets.add(kattenSigge); // Detta fungerar eftersom Cat är ETT Animal

        System.out.println("Mina husdjur låter såhär....");

        for(Animal pet : myPets) {
            pet.makeSound();
        }

    }
}
```