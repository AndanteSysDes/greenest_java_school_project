public abstract class Plant implements LiquidCalculator {
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
