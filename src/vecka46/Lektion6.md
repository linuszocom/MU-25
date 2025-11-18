
```
public class Application {

    static void main(String[] args) {

        // Skicka med Argument
        greetUser("Kalle");

        add(5,3);

        int result = addAndReturn(10, 5);
        System.out.println("Resultatet från metoden är " + result);

        int result2 = addAndReturn(result, 2);
        System.out.println("Resultat 2 är: " + result2);

    }

    // Nya metoder skapas utanför MAIN-metoden
    // En metod som tar emot en PARAMETER
    public static void greetUser(String name) {
        System.out.println("Hej och välkommen, " + name + "!");
    }

    // En metod som har två parametrar
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Summan ör: " + sum);
    }

    public static int addAndReturn(int a, int b) {
        int sum = a + b;
        return sum;
    }

}

```
