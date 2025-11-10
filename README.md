## Java Kurs: Lektion 1 - Variabler & Interaktion

Detta är ditt första egna arbete (egna arbetet). Målet är att praktisera deklaration, initiering och användningen av **Scanner** för att skapa interaktiva program.

---

### Förberedelse
Ni ska skapa ett **helt nytt projekt** i er IDE (t.ex. IntelliJ).

---

### Uppgift 1: Hårdkodad Data (Repetition)

Målet är att visa att ni kan hantera variabler, strängar och tal innan ni går över till interaktiv inmatning.

1.  **Deklaration & Initiering:**
    * Skapa en **`String`** för personens namn.
    * Skapa en **`String`** för en valfri maträtt.
    * Skapa en **`int`** (heltal) för antal dagar (eller antal gånger) i veckan de äter rätten.

2.  **Utskrift (Konsol):**
    * Använd `System.out.println()` (eller `sout`) för att sammanfoga all information.
    * Skapa en tydlig text tillsammans med variablerna.

> **Exempelutskrift:**
> "Jag heter [NAMN] och jag äter [MATRÄTT], [ANTAL] gånger i veckan!"

---

### Uppgift 2: Interaktiv Data (Scanner)

Målet är att göra programmet dynamiskt genom att läsa in värden från användaren. **Glöm inte Typomvandling!**

1.  **Förbered Scanner:** Importera och skapa ett **Scanner-objekt** i din `main`-metod.
2.  **Interaktion:**
    * Fråga användaren om deras **namn** (`String`).
    * Fråga användaren om deras **favoritmat** (`String`).
    * Fråga användaren **hur många gånger** i veckan de äter rätten (`int`).
        * **Viktigt:** Kom ihåg att läsa in talet med **`nextLine()`** och sedan använda **`Integer.parseInt()`** för att omvandla det till ett heltal.
3.  **Slutlig Utskrift:**
    * Programmet ska skriva ut en rolig sammanfattning.

> **Exempelutskrift:**
> "Okej [NAMN], du gillar alltså [MATRÄTT] och äter det [ANTAL] gånger i veckan. Smaklig måltid!"