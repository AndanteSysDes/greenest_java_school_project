public class Palm extends Plant{

    public Palm (String name, double height){
        super(name, height);
        this.typeOfLiquid = Liquids.TAP_WATER;
    }

    @Override
    public double amountOfLiquidInLiter() {
        /*
        Formel: 0,5 liter per dag gånger längden i meter
        Exempel: en palm som är 3 meter hög behöver 0,5 × 3 = 1,5 liter per dag
         */
        return 0.5 * heightInMeter;
    }

    @Override
    public String toString() {
        return super.toString() + " - Plant type: Palm.";
    }
}
