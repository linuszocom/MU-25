```
public class Address {

    // Data fält
    private String street;
    private String city;

    // Konstruktor
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Getters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return this.street + " ," + this.city;
    }
}
```
```
public class Person {

    // Fält (Data, Tillstånd)

    // Data är oftast variabler som sällan ändras under programmets gång
    private String name;
    private int age;
    private Address address;

    // Tillstånd är variabler som ändras under programmets gång
    boolean isSleeping = false; // T.ex om man har ett program där användaren kan sova så ändras isSleeping till true

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // En GETTER för att LÄSA privat data
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Address getAddress() {
        return this.address;
    }

    // En SETTER för att SKRIVA data
    public void setAge(int age){
        // Validera datan innan vi godkänner
        if (age > this.age) {
            this.age = age;
        } else {
            System.out.println("Personen kan inte bli yngre");
        }
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    // Vad kan ett Person-objekt GÖRA? (Våra metoder)
    public void introduceSelf() {
        System.out.println("Hej jag heter " + this.name + " och jag är " + this.age + " år gammal");
    }

    @Override // toString metoden som gör att vi kan själva beskriva hur objektet ser ut när man skriver ut det
    public String toString() {
        return "Hej";
    }
}
```

```
import java.util.Scanner;

public class Application {

    static void main(String[] args) {

        Address person1Address = new Address("Stora borg", "Ankeborg");

        Person person1 = new Person("Luna", 4, person1Address);

        Address person1AdrObjekt = person1.getAddress();
        String person1Stad = person1AdrObjekt.getCity();

        System.out.println(person1.getName() + " bor i " + person1Stad);
    }

}
```


