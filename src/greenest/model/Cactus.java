package greenest.model;

public class Cactus extends Plant {

    public Cactus(String name, double height){
        super(name, height);
        this.typeOfLiquid = Liquids.MINERAL_WATER;
    }

    @Override
    public double amountOfLiquidInLiter() {
        /*
        Formel: 2 cl per dag
        */
        final double LIQUID = 0.02;
        return LIQUID;
    }

    @Override
    public String toString() {
        return super.toString() + " - Plant type: Cactus.";
    }
}
