```
// Byrå när vi VET våra värden direkt
    int[] numbers = {5, 10, 15};

// Skapa en Array när vi VET STORLEKEN men inte innehållet.
    String[] names = new String[5];
```

```
// Skriva data till vår array (tilldela värden till vår byrå)
    String[] names = new String[5];
    
    names[0] = "Luna";
    names[1] = "Linus";
    names[2] = "Maria";
    names[3] = "Peter";
    names[4] = "Filippa";

```

```
String[] fruits = new String[3];

    // Hur skriver vi ut ALLA frukter? Med en for-loop!
    String[] fruits = new String[3];
    
    fruits[0] = "Äpple";
    fruits[1] = "Banan";
    fruits[2] = "Päron";
    
    for (int index = 0; index < fruits.length; index++) {
        System.out.println("På index " + index + " finns: " + fruits[index]);
    }
```

```
// Fyller vår array (byrå) med hjälp av en scanner        
    String[] groceries = new String[3];

    System.out.println("Skriv in 3 saker du ska handla");

    for (int index = 0; index < groceries.length; index++) {
        System.out.println("Ange vara " + (index + 1) + ":");
        groceries[index] = scanner.nextLine();
    }

    System.out.println("-- Din inköpslista --");
    for (int index = 0; index < groceries.length; index++) {
        System.out.println(groceries[index]);
    }
```

```
 // for-loopen VS for-each-loopen

    String[] names = {"Linus", "Luna", "Maria", "Peter"};


    // Vår klassiska for-loop
    for (int index = 0; index < names.length; index++) {
        System.out.println(names[index]);
    }

    // for-each-loop
    System.out.println("Utskrift med for-each");
    for (String name : names) {
        System.out.println(name);
    }
```
