# Växthotellet Greenest 🌱

Ett Java-program som hjälper växthotellet Greenest att beräkna hur mycket vätska varje växt behöver per dag. Projektet är en individuell skoluppgift i objektorienterad programmering.

## Funktioner

- Välj en av hotellets fyra växter: **Laura**, **Olof**, **Meatloaf** eller **Igge**.
- Beräkna vätskebehovet och visa rätt vätsketyp.
- Använd dialogrutor med `JOptionPane`.
- Hantera okända namn, tom inmatning och avbruten inmatning.

## Demo

**1. Välkomstmeddelande**

![Välkomstmeddelande](docs/images/01-welcome.png)

**2. Välj en växt**

![Dialog för att välja växt](docs/images/02-plant-selection.png)

**3. Se resultatet**

![Resultat för Laura](docs/images/03-result.png)

## Teknik och objektorientering

- **Java 25** och **Swing** (`JOptionPane`)
- Arv: `Plant` med subklasserna `Palm`, `Cactus` och `CarnivorousPlants`
- Interface: `LiquidCalculator`
- Polymorfism: varje växttyp beräknar vätskebehovet med `amountOfLiquidInLiter()`
- Enum: `Liquids` för vätsketyperna
- Inkapsling: växthotellets plantsamling hanteras via `GreenHotel`-klassens publika metoder

## Kör programmet

1. Öppna projektet i **IntelliJ IDEA**.
2. Ställ in **JDK 25** som Project SDK.
3. Kör `src/greenest/Main.java`.
