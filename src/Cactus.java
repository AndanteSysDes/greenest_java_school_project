public class Cactus extends Plant{

    public Cactus(String name, double height){
        super(name, height);
        this.typeOfLiquid = Liquids.MINERAL_WATER;
    }

    @Override
    public double AmountOfLiquidInLiter() {
        /*
        Formel: 2 cl per dag
        */
        return 0.2;
    }

    @Override
    public String toString() {
        return super.toString() + " - Plant type: Cactus.";
    }
}
