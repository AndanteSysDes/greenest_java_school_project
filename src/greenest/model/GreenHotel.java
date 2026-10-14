package greenest.model;

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
        String firstMessage = "Greenest har följande växter:\n";
        StringBuilder sb = new StringBuilder();
        sb.append(firstMessage);
        for(Plant plant : plants.values()){
            sb.append("  " + plant.name + "\n");
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
        String messageTemplate = "Du behöver ge %s %.2f liter %s per dag.";

        Plant target = plants.get(plantName);

        /*
        Här används polymorfism.
        `target` kan vara en instans av `Palm`, `Cactus` eller `CarnivorousPlants`.
        Eftersom alla tre klasserna ärver från `Plant` kan ett `GreenHotel`-objekt anropa samma metod på `target`.
        Metoden beter sig olika beroende på vilken klass objektet tillhör.
         */
        double liquidAmount = target.amountOfLiquidInLiter();

        String liquidType = target.getTypeOfLiquid();

        String message =  messageTemplate.formatted(target.getName(), liquidAmount, liquidType);

        return message;
    }


}
