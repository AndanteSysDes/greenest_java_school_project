import javax.swing.*;

public class View {

    GreenHotel hotel;

    private static final String SEPARATOR = "----------------------------------------------------\n";

    public View(GreenHotel hotel){
        this.hotel = hotel;
    }

    public void showStartMessage(){
        String startMessage = "Välkommen till Växthotellet Greenest";
        JOptionPane.showMessageDialog(null, startMessage);
    }

    /**
     * Shows all plants and ask user input a plant name on a question dialog.
     * It repeats until the user chooses a plant that exist in the hotel.
     *
     * @return the plants name in lower case, or {@code null} if the user choose cancel.
     */
    public String askPlantName(){
        while(true){
            String askingMessage = "Vilken växt ska få vätska?\nAnge ett namn:\n";
            String input = JOptionPane.showInputDialog(
                    hotel.allPlants() +
                            SEPARATOR +
                            askingMessage
            );

            if(input==null){
                return null;
            }

            String searchWord = input.trim().toLowerCase();
            if(hotel.hasPlant(searchWord)){
                return searchWord;
            }

            JOptionPane.showMessageDialog(
                    null,
                    "Hotellet har inte " + input + ". Försök igen."
            );
        }
    }

    /*
    Programmet visar en ny ruta som talar om:
    hur mycket vätska växten ska ha
    vilken sorts vätska det är (kranvatten, mineralvatten eller proteindryck)
     */

    /**
     * Displays a new window that tells you:
     * <ul>
     *     <li>How much liquid the plant needs</li>
     *     <li>What kind of liquid it is</li>
     * </ul>
     * @param plantName the name of the plant
     */
    public void showWaterAmount(String plantName){
        JOptionPane.showMessageDialog(
                null,
                hotel.getLiquidAmount(plantName)
        );
    }

    public void showCancelMessage(){
        String CANCEL_MESSAGE = "Åtgärden har avbrutits.";
        JOptionPane.showMessageDialog(
                null,
                CANCEL_MESSAGE
        );
    }




}
