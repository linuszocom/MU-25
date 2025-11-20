```

// Detta är vår ritning, vår KLASS
public class Person {

    // Fält (Data, Tillstånd)

    // Data är oftast variabler som sällan ändras under programmets gång
    private String name;
    private int age;

    // Tillstånd är variabler som ändras under programmets gång
    boolean isSleeping = false; // T.ex om man har ett program där användaren kan sova så ändras isSleeping till true

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // En GETTER för att LÄSA privat data
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
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
public class Application {

    static void main(String[] args) {

        Person person1 = new Person("Luna", 4);
        Person person2 = new Person("Maria", 42);

        person1.introduceSelf();


    }

}
```
