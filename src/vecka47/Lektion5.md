```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
```
```
public class Application {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> todoList = new ArrayList<>();
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("Våran To-Do lista");
            System.out.println("1. Lägg till en uppgift");
            System.out.println("2. Visa våran lista");
            System.out.println("3. Ta bort en uppgift");
            System.out.println("4. Avsluta");
            System.out.println("Tingeling!");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Ange en uppgift");
                    String task = scanner.nextLine();
                    todoList.add(task);
                    System.out.println(task + " tillagd i listan");
                    break;

                case "2":
                    System.out.println("Här är din nuvarande lista");
                    if (todoList.isEmpty()) {
                        System.out.println("Listan är tom");
                    } else {
                        for (int index = 0; index < todoList.size(); index++) {
                            System.out.println(( index + 1) + ": " + todoList.get(index));
                        }
                    }
                    break;
                case "3":
                    System.out.println("Finns inte ännu");
                    break;

                case "4":
                    System.out.println("Hej då");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Ogiltigt val");
            }
        }
    }
}
        
```
```

        Map<String, Integer> productPrices = new HashMap<>();

        productPrices.put("Mjölk" , 20);
        productPrices.put("Bröd", 30);
        productPrices.put("Smör", 40);

        // 1. Hämta en sak (med nyckel INTE index)
        int priceOfBread = productPrices.get("Bröd");
        System.out.println("Priset på bröd är " + priceOfBread + " kronor");

        // 2. Loopa (om man måste)

        System.out.println("Alla produkter i vår HashMap");
        for (String productName : productPrices.keySet()) {
            int price = productPrices.get(productName);
            System.out.println(productName + " kostar " + price + " kronor");
        }


    }
```