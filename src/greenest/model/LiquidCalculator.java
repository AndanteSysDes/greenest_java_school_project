/*
Jag överlägger amountOfLiquidInLiter-metod från LiquidCalculator interface.
Det är olika hur mycket vätska beroende på klasserna.
Så använder jag polymorfism här.
Det betyder att en annan klass kan anropa samma metoden i Plant-subklass,
men hur det fungerar är olika beroende på vilket subklass det är.
 */
package greenest.model;

public interface LiquidCalculator {
    /**
     * This will return the amount of liquid required for this type of plant, converted to liters.
     * @return the amount of liquid in liter
     */
    double amountOfLiquidInLiter();
}
