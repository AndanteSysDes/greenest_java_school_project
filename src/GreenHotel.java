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

    public void showAllPlants (){
        for(Plant plant : plants.values()){
            System.out.println(plant);
        }
    }

    public boolean hasPlant(String searchWord){
        return plants.containsKey(searchWord);
    }

    public String getLiquidAmount(String plantName){
        Plant target = plants.get(plantName);
        double liquidAmount = target.AmountOfLiquidInLiter();
        String liquidType = target.getTypeOfLiquid().getValue();

        String result = "Du behöver ge " + target.getName() + " " + liquidAmount + " liter "+ liquidType + " per dag.";

        return result;
    }


}
