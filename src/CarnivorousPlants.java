public class CarnivorousPlants extends Plant{

    public CarnivorousPlants(String name, double height){
        super(name, height);
        this.typeOfLiquid = Liquids.PROTEIN_DRINK;
    }

    @Override
    public double AmountOfLiquidInLiter() {
        /*
        Formel: en basnivå på 0,1 liter per dag plus 0,2 liter gånger längden i meter
        Exempel: en köttätande växt som är 50 cm hög behöver 0,1 + (0,2 × 0,5) = 0,2 liter per dag
        */
        return 0.1 +( 0.2 * heightInMeter);
    }

    @Override
    public String toString() {
        return super.toString() + " - Plant type: Carnivorous Plants.";
    }
}
