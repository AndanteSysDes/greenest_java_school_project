import java.util.HashMap;
import java.util.Map;

public class GreenHotel {
    private Map<String, Plant> plants = new HashMap<>();

    public GreenHotel(){
        plants.put("laura", new Palm("Laura", 5 ) );
        plants.put("igge", new Cactus("Igge", 0.2 ) );
        plants.put("meatloaf", new CarnivorousPlants("Meatloaf", 0.7 ) );
        plants.put("olof", new Palm("Olof", 1 ) );
    }

    /**
     * Returns all plants names as text.
     *
     * @return text listing the names of plants
     */
    public String allPlants (){
        StringBuilder sb = new StringBuilder();
        sb.append("Greenest har följande växter:\n");
        for(Plant plant : plants.values()){
            sb.append("  ").append(plant.name).append("\n");
        }
        return sb.toString();
    }

    public boolean hasPlant(String searchWord){
        return plants.containsKey(searchWord);
    }

    /**
     * Returns which type of liquid and how much it required by the specified plant.
     *
     * @param plantName the name of the plant
     * @return the message that contains what kind of liquid and how much it required
     */
    public String getLiquidAmount(String plantName){
        Plant target = plants.get(plantName);
        double liquidAmount = target.AmountOfLiquidInLiter();
        String liquidType = target.getTypeOfLiquid();

        String result = "Du behöver ge " + target.getName() + " " + liquidAmount + " liter "+ liquidType + " per dag.";

        return result;
    }


}
