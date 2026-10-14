/*
Jag använder arv och interface.
Plant-klassen fungerar som basklassen för Palm, Cactus och CarnivorousPlants klasser.
På så sätt minskar jag mängden källkod och håller barn klasserna koncisa.
Plant-klassen behöver inte ha instans, så jag sätt "abstract" på Plant-klassen.
Dessutom implementerade jag LiquidCalculator-interface på Plant-klassen.
Det innebär att barn klasserna måste implementera amountOfLiquidInLiter()-metod, vilket förhindrar att man glömmer att beskriva nödvändiga funktioner.
*/
package greenest.model;

public abstract class Plant implements LiquidCalculator {
    /*
     * Inkapsling:
     * Instansvariablerna är protected så att subklasser
     * kan använda dem direkt, medan åtkomsten
     * från andra paket begränsas.
     */
    protected String name;
    protected double heightInMeter;
    protected Liquids typeOfLiquid;

    public Plant(String name, double heightInMeter){
        this.name = name;
        this.heightInMeter = heightInMeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeightInMeter() {
        return heightInMeter;
    }

    public void setHeightInMeter(double heightInMeter) {
        this.heightInMeter = heightInMeter;
    }

    public String getTypeOfLiquid() {
        return typeOfLiquid.getValue();
    }

    public void setTypeOfLiquid(Liquids typeOfLiquid) {
        this.typeOfLiquid = typeOfLiquid;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Height: " + heightInMeter;
    }

}
