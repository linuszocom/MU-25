/*
-- Primära datatyper

// Heltal
int    - Standard för heltal (32 bitar)
byte   - Används till mycket små tal (8 bitar)
short  - lite större heltal (16 bitar)
long   - väldigt stora heltal (64 bitar)

// Decimaltal
double - Standard för decimaltal (högre precision, 15-17 decimala siffror)
float  - Mindre precision och vill spara på minnet (6-7 decimala siffror)

// Övriga typer
boolean - endast sant eller falskt
char    - lagrar enskilda tecken, antingen en bokstav ('A') eller en siffra ('1')

*/

import java.util.Scanner; // Vi importerar Scanner-verktyget

public class Application {

    public static void main(String[] args) {

        /*
        // 1. Deklaration - Vi skapar en tom låda av typen string
        String userName;

        // 2. Initiering - Vi lägger till värde i lådan
        userName = "Luna";

        // 3. Deklarering och Initiering (vanligaste sättet)
        String lastName = "Larson";

        System.out.println(userName);
        System.out.println(lastName);

        // Datatyper

        // 1. Heltal (int)
        int userAge = 30;
        int bankBalance = -100; // Heltal kan vara negativa

        // 2. Decimaltal (double)
        double temperature = 20.5; // Punkt och inte kommatecken
        double price = 199.90;

        // 3. Sanningsvärde (booleans)
        boolean isLoggedIn = true;
        boolean isStudent = false;

        System.out.println("användaren är " + userAge + " år gammal");

        int nextYearAge = userAge + 1;
        System.out.println("Nästa år är användaren " + nextYearAge + " år gammal");

        // Implicit casting - sköts automatiskt
        int heltal = 5;
        double decimaltal = heltal;

        // Explicit Casting - vi är medvetna om förlusten .99
        double mittTal = 10.99;
        int baraHeltal = (int) mittTal;

        System.out.println(baraHeltal);
        */

        Scanner scanner = new Scanner(System.in);

        // REKOMMENDERAT SÄTT (Läs in som sträng, konvertera till int)
        // Detta undviker buffertproblem med nextLine() senare.
        System.out.println("Hur gammal är du?");
        String userInput = scanner.nextLine(); // Läser hela raden (inkl. Enter)
        
        // Konverterar strängen till ett heltal
        int userAge = Integer.parseInt(userInput); 
        System.out.println("användaren är " + userAge);

        // INTE rekommenderat sätt att läsa int (lämnar Enter i bufferten)
        System.out.println("Hur gammal är du?");
        int userSecondAge = scanner.nextInt(); 
        
        // RENSAR bufferten efter nextInt() så att nästa nextLine() fungerar korrekt
        scanner.nextLine();


        // Fråga efter namn
        System.out.println("Vad heter du?");
        String userName = scanner.nextLine(); // Läser en hel textrad
        System.out.println("Ditt namn är: " + userName); // Lade till en utskrift för klarhet

        System.out.println("Vart bor du?");
        String cityName = scanner.nextLine();

        System.out.println("Jag bor i " + cityName);
        
        // OBS! Glöm inte att stänga scannern i ett riktigt program!
        // scanner.close();
    }
}