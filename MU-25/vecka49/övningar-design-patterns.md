

### 1. **Singleton Pattern**
### Rekommenderar (Viktigast)
**Uppgift:** Implementera en enkel `Logger`-klass som bara kan ha en enda instans.  
**Instruktioner:**
- Skapa en klass `Logger` med en privat konstruktor.
- Implementera en statisk metod `getInstance()` för att få tillgång till instansen.
- Lägg till en metod `log(String message)` som skriver ut meddelanden till konsolen.  
  **Extra:** Utöka loggern för att skriva till en fil istället för konsolen.

---

### 2. **Factory Method Pattern**
### Rekommenderar
**Uppgift:** Implementera en fabrik för att skapa olika typer av geometriska former (`Shape`).  
**Instruktioner:**
- Skapa ett gränssnitt `Shape` med metoden `draw()`.
- Implementera klasserna `Circle`, `Square`, och `Rectangle` som implementerar `Shape`.
- Skapa en `ShapeFactory`-klass med en metod `createShape(String type)`.
- Anropa fabriken och rita olika former i main-metoden.

---

### 3. **Observer Pattern**
### Bonus (Om tid finns)
**Uppgift:** Simulera ett nyhetsflöde där flera användare prenumererar på uppdateringar.  
**Instruktioner:**
- Skapa ett gränssnitt `Observer` med metoden `update(String news)`.
- Skapa en klass `NewsAgency` som kan hantera en lista av `Observer`-objekt och meddela dem.
- Implementera flera klasser som representerar användare och implementerar `Observer`.
- Simulera att nyhetsbyrån skickar nyheter till användarna.

---

### 4. **Strategy Pattern**
### Rekommenderar om tid finns
**Uppgift:** Implementera ett system för att beräkna olika typer av rabatter.  
**Instruktioner:**
- Skapa ett gränssnitt `DiscountStrategy` med metoden `double applyDiscount(double price)`.
- Implementera klasserna `PercentageDiscount`, `FixedAmountDiscount`, och `NoDiscount`.
- Skapa en klass `Cart` som använder en `DiscountStrategy` för att beräkna rabatten.
- Testa olika rabatter genom att byta strategi.

---

### 5. **Decorator Pattern**
### Bonus (om tid finns)
**Uppgift:** Bygg en enkel beställningsapp för kaffe med tillval.  
**Instruktioner:**
- Skapa ett gränssnitt `Coffee` med metoden `double getCost()` och `String getDescription()`.
- Implementera en basklass `SimpleCoffee` som implementerar `Coffee`.
- Skapa dekoratorklasser som `Milk`, `Sugar`, och `WhippedCream` som lägger till kostnad och beskrivning.
- Bygg en kaffeorder med flera tillval och beräkna slutpriset.

---