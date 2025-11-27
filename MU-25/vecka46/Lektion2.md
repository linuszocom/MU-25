```
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hur gammal är du?");
        String userInput = scanner.nextLine();
        int userAge = Integer.parseInt(userInput);
        
        // Här kommer själva if-satsen
        
        if (userAge >= 18) {        
            // Kodblocket körs ENDAST om vilket är SANT
            System.out.println("Du är 18 år eller äldre.");
            System.out.println("Välkommen in!");
        } else {        
            // Kodblocket körs ENDAST om vilket är SANT
            System.out.println("Du är under 18.");
            System.out.println("Du får tyvärr vänta några år");
        }
      
     } 
```

```
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hur gammal är du?");
        String userInput = scanner.nextLine();
        int userAge = Integer.parseInt(userInput);
        
        // else if-satsen
        if (userAge >= 65) {
            // Testas först
            System.out.println("Du är pensionär");
        } else if (userAge >= 18) {
            // Testas ENDAST om första villkoret är falskt
            System.out.println("Du är vuxen");;
        } else {
            // Körs bara om BÅDA villkoren ovan är falska
            System.out.println("Du är omyndig");
        }        
    }
 } 
```

```
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // LOGISKA OPERATORER (&& och ||)
        
        // && (OCH) - Båda måste vara sanna
        System.out.println("Hur gammal är du?");
        String userInput = scanner.nextLine();
        int userAge = Integer.parseInt(userInput);

        System.out.println("Har du en biljett? (ja/nej)");
        String ticketInput = scanner.nextLine();
        
        boolean hasTicket;
        if (ticketInput.equalsIgnoreCase("ja")) {
            hasTicket = true;
        } else {
            hasTicket = false;
        }
        
        // Här använder vi && (OCH)
        if (userAge >= 18 && hasTicket == true) {
            System.out.println("Du får komma in!");
        } else {
            System.out.println("Du är antingen för ung eller saknar biljett");
        }
    }
```

```
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // LOGISKA OPERATORER (&& och ||)
        
        // || (ELLER) - Minst en måste vara sann
        System.out.println("Hur gammal är du?");
        String userInput = scanner.nextLine();
        int userAge = Integer.parseInt(userInput);

        System.out.println("Är du student? (ja/nej)");
        String studentInput = scanner.nextLine();
        
        boolean isStudent = studentInput.equalsIgnoreCase("ja"); // Kortare sätt att skriva
        boolean isSenior = (userAge >= 65);
        
        if (isStudent == true || isSenior == true) {
            System.out.println("Du får rabatt på bussen");
        } else {
            System.out.println("Du får betala fullpris.");
        }
    }
}
```

```
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // LOGISKA OPERATORER (&& och ||)
        
        // || (ELLER) - Minst en måste vara sann
        System.out.println("Hur gammal är du?");
        String userInput = scanner.nextLine();
        int userAge = Integer.parseInt(userInput);

        System.out.println("Är du student? (ja/nej)");
        String studentInput = scanner.nextLine();
        
        boolean isStudent = studentInput.equalsIgnoreCase("ja"); // Kortare sätt att skriva
        boolean isSenior = (userAge >= 65);
        
        if (isStudent == true || isSenior == true) {
            System.out.println("Du får rabatt på bussen");
        } else {
            System.out.println("Du får betala fullpris.");
        }
    }
}
```

```
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {       
        
        // (!) - Vänder på sanningen, om ett villkor är true gör ! det till false och tvärtom
        
        boolean isLoggedIn = false
        
        // Villkor: Gå in i if-satsen om det ÄR SANT att användaren INTE är inloggad
        if (!isLoggedIn) {
            System.out.println("Du är inte inloggad!");
        }
        
    }
}
```

```
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // SWITCH-SATS
            System.out.println("Välkommen till kaffemaskinen");
            System.out.println("1. Tryck 1 för kaffe");
            System.out.println("2. Tryck 2 för te");
            System.out.println("3. Tryck 3 för choklad");
            System.out.println("Gör ditt val (1-3)");

            String choiceInput = scanner.nextLine();
            int choice = Integer.parseInt(choiceInput);

            // Vi 'switchar' på variabeln 'choice'
            switch (choice) {
                case 1:
                    // Körs om 'choice' har värdet 1
                    System.out.println("En kopp kaffe kommer här");
                    break; // <-- Viktigt! Hoppar ur switchen
                case 2:
                    // Körs om 'choice' har värdet 2
                    System.out.println("En kopp te kommer här");
                    break; // <-- Viktigt! Hoppar ur switchen
                case 3:
                    // Körs om 'choice' har värdet 3
                    System.out.println("En kopp choklad kommer här");
                    break; // <-- Viktigt! Hoppar ur switchen

                default:
                    System.out.println("Felaktigt val, Försök igen.");
                    break;
            }

            System.out.println("Tack för ditt besök!");
        }
    }
```