# Spelprojekt : Tre-i-rad

## Uppgift

Skapa ett text-baserat Tre-i-rad-spel i Java som spelas av två mänskliga spelare i terminalen/konsollen. 
Varje spelare turas om att ange var i ett 3x3-rutnät spelaren önskar placera X (eller O). 
När en spelare har tre X (eller O) i rad horisontellt, vertikalt eller diagonalt meddelar spelet vem som vann. 
Har ingen spelare tre i rad när inga tomma rutor längre kvarstår slutar spelet oavgjort. Efter att ett spel är klart börjar spelet om med ett nytt tomt rutnät.

## Exempel

````
 X | O |  
---+---+---
   | O |
---+---+---
   |   | X 

Spelare X, vilken ruta (1-9)?
> 8

 X | O |  
---+---+---
   | O |
---+---+---
   | X | X 

Spelare O, vilken ruta (1-9)?   
>
````

## Frivilligt

- Du väljer själv om du för spelaren vill representera rutorna i rutnätet med siffror (1--9) eller koordinater (a1, a2, a3, b1, b2 o.s.v.) eller på annat motiverat sätt.

- Spelplanen behöver inte se ut som i exemplet ovan utan du väljer själv hur spelplanen ska se ut i terminalen/konsollen. Du ska kunna motivera hur designen av din spelplan antingen gjort det enklare för dig att skriva kod eller lättare för spelaren att ta till sig spelet.

## Inlämning

Uppgiften lämnas in som github-länk på Azomo senaste fredag 5 december kl 23.59
vid den tidpunkten skall nedan krav vara uppfyllda.

## Krav

#### För godkänt ska spelet minst uppfylla följande krav:

- Spelet ska vara spelbart mellan två människor som turas om att ge indata till terminalen/kommandotolken där spelet visas med text-baserad grafik.
- Spelet ska kontrollera och meddela vilken spelare som vunnit eller om spelet slutat oavgjort
- Spelet ska vid varje drag kontrollera att indata motsvarar en tom ruta i rutnätet
- När en spelare vunnit börjar spelet om från början.
- Din kod skall vara skriven på engelska: variabelnamn, klassnamn, metodnamn och helst även kommentarer
- Spelat skall vara skrivet Objektorienterat, så det skall innehålla olika klasser.
- Projektet finns upplagt på GitHub.

Dessutom ska koden vara strukturerad och du ska visa på att du förstår och kan använda dig av variabler, strängar, tal, villkorssatser, loopar och funktioner i Java. 
Onödig kodupprepning ska i största mån undvikas.

#### För betyget väl godkänt ska spelet, utöver kraven för godkänt, minst uppfylla nedan krav

- Spelet ska fråga om spelarnas namn och vid varje drag skriva ut vems tur det är
- Spelet ska räkna hur många vinster varje spelare har
- Indata från användaren skall korrekt felhanteras så spelet varken kraschar eller att andra fel uppstår
- Under projektet har Git använts kontinuerlig och versionshistorik finns tillgänglig i den slutgiltiga inlämningen

#### Extra
Spelet får gärna byggas ut utöver detta. Tex med bättre datorspelare och olika nivåer på hur bra datorspelaren är.


## Riktlinjer för användning av Aizo och AI:

1. AI som ett hjälpmedel, inte en ersättning: Använd AI-verktyg och resurser som en hjälpande hand för att förbättra din produktivitet och förståelse av ämnet. Tänk på AI som ett komplement till ditt eget arbete, inte som ett sätt att ersätta det. Använd AI endast för att skapa kortare funktionalitet och inte för att generera hela program.
2. Förstå din kod: Se till att du förstår den kod du skriver. Om du använder AI för att generera kod, var säker på att du kan förklara hur koden fungerar och varför den är korrekt.
3. Skriv egen kod: Skriv alltid din egen kod från grunden. Att kopiera och klistra in kod som genererats av AI utan att förstå den strider mot principen om akademisk ärlighet.
4. Be om hjälp och klargörande: Om du är osäker på hur du ska använda AI eller om det är tillåtet i en viss uppgift, tveka inte att be om hjälp eller klargörande från lärare.
5. Lär och förbättra dig: Använd uppgifterna som en möjlighet att lära dig och förbättra dina färdigheter. Använd AI som ett verktyg för att utveckla din kunskap, inte som en genväg.

