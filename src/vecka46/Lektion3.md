```     
       // VARNING! Oändlig loop
       while (true) {
           System.out.println("Detta är en loop");
       }
       
```

```
// Kontrollerad loop
// Start: En rälnare (kallas ofta i (iteration)

   int i = 0;

    // Villkor: Loopen körs SÅ LÄNGE som 'i' är mindre än 5
   while (i < 5) {
       System.out.println("Nummer: " +i);

       // SUPERVIKTIG! Öka 'i' med 1
       i++;
   }
       
   System.out.println("Klar");

```

```
    // Villkorsstyrd loop
       String correctPassword = "Java123";
       String guess = "";


       // Kör loopen SÅ LÄNGE som gissningen INTE är lika med rätt lösenord
       // använd .equals() för att jämföra Strings
       
       while ( !guess.equals(correctPassword) ) {
           System.out.println("Ange lösenord för att logga in");
           guess = scanner.nextLine();


           if ( !guess.equalsIgnoreCase(correctPassword)) {
               System.out.println("Fel lösenord, försök igen");
           }
       }

       System.out.println("Välkommen in");
```

```
       // FOR-loopen
       for (int i = 0; i < 10; i++) {
           System.out.println("i är nu " + i);
       }
       System.out.println("For-loopen är klar");

```

```
   // Räknar som räknar ner
   System.out.println("Nedräkning...");
   
   for (int i = 10; i > 0; i--) { // Vi använder i-- (minska med 1)
       System.out.println(i);
   }
   
   System.out.println("Gott nytt år!!");
```

```
   // Räkna jämna tal
   System.out.println("Jämna tal mellan 0 och 20");

   for (int i = 0; i <= 20; i += 2) {
       System.out.println(i);
   }
```

```
    // Do-While loop
    String choice;
    
    do {
       System.out.println("MENY");
       System.out.println("1. Starta spelet");
       System.out.println("2. Avsluta");
    
       choice = scanner.nextLine();
       
       if (choice.equals("1")) {
           System.out.println("Spelet startar");
       }
    } while ( !choice.equals("2")) ;
    
    System.out.println("Välkommen tillbaka");

```

```
// Break: (Nödbroms)

    System.out.println("Leta efter nummer 5");
    
       for (int i = 0; i < 10; i++) {

           if (i == 5) {
               System.out.println("Vi hittade 5! Avbryt.");
               break;
           }

           System.out.println("i är: " + i);
       }

       System.out.println("Loopen är avbruten");

```

```
    // Coninue: (HOPPA ÖVER DETTA VARV)
    
       System.out.println("Räkna 0-9, men hoppar över 5");
       
       for (int i = 0; i < 10; i++) {
       
           if (i == 5) {
               System.out.println("Hoppa över 5...");
               continue; // Avbryter varvet, men hoppar till nästa (i++)
           }

           System.out.println("i är: " + i);
       }
       
       System.out.println("Nu är loopen klar!");
```