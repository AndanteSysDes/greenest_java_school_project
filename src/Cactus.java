public class Cactus extends Plant{

    public Cactus(String name, double height){
        super(name, height);
        this.typeOfLiquid = Liquids.MINERAL_WATER;
    }

    @Override
    public double amountOfLiquidInLiter() {
        /*
        Formel: 2 cl per dag
        */
        return 0.02;
    }

    @Override
    public String toString() {
        return super.toString() + " - Plant type: Cactus.";
    }
}
