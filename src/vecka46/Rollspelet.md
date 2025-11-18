````
import java.util.Scanner;

public class DemoSpel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int hp = 100;

        System.out.println("Välkommen till Äventyret!");

        while (isRunning) {
            // Meny 1
            System.out.println("\n HUVUDMENY ");
            System.out.println("Du står vid ett vägskäl. Vart vill du gå?");
            System.out.println("1. Gå in i den mörka skogen");
            System.out.println("2. Gå in i den fuktiga grottan");
            System.out.println("3. Avsluta spelet");
            System.out.print("Ditt val: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // SCENARIO 1: SKOGEN
                    System.out.println("\nDu går in i skogen. Träden är höga.");

                    // Action Meny (Meny 2)
                    printActionMenu();

                    String forestAction = scanner.nextLine();
                    if (forestAction.equals("2")) {
                        System.out.println("Du slåss mot en varg! Du förlorar 10 HP.");
                        hp = hp - 10;
                    } else {
                        System.out.println("Du tar det lugnt i skogen.");
                    }
                    break;

                case "2":
                    // SCENARIO 2: GROTTAN
                    System.out.println("\nDu kryper in i grottan. Det droppar vatten.");

                    // Action meny (Meny 2)
                    printActionMenu();

                    String caveAction = scanner.nextLine();
                    if (caveAction.equals("2")) {
                        System.out.println("Du slåss mot en fladdermus! Du förlorar 5 HP.");
                        hp = hp - 5;
                    } else {
                        System.out.println("Du tar det lugnt i grottan.");
                    }
                    break;

                case "3":
                    System.out.println("Du lämnar äventyret. Hejdå!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Ogiltigt val.");
            }

            if (isRunning) {
                System.out.println("Din HP är nu: " + hp);
            }
        }
    }

    public static void printActionMenu() {
        System.out.println("--- VAD VILL DU GÖRA? ---");
        System.out.println("1. Se dig omkring");
        System.out.println("2. Slåss mot svåra monster");
        System.out.println("3. Vila");
        System.out.print("Val: ");

    }
}
````