package greenest.ui;

import greenest.model.GreenHotel;

import javax.swing.*;

public class View {

    private GreenHotel hotel;

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
     * @return the plants name in lower case, or {@code null} if it's canceled or catch an error.
     */
    public String askPlantName(){
        String askingMessage = "Vilken växt ska få vätska?\nAnge ett namn:\n";
        String wrongMessage = "Hotellet har inte %s. Försök igen.";

        while(true){
            try {
                String input = JOptionPane.showInputDialog(
                        hotel.allPlants() +
                                SEPARATOR +
                                askingMessage
                );

                if(input==null){
                    return null;
                }

                input = input.trim();
                String searchWord = input.toLowerCase();
                if(hotel.hasPlant(searchWord)){
                    return searchWord;
                }

                JOptionPane.showMessageDialog(
                        null,
                        wrongMessage.formatted(input)
                );

            } catch (Exception e){
                return null;
            }
        }
    }

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
        String cancelMessage = "Åtgärden har avbrutits.";
        JOptionPane.showMessageDialog(
                null,
                cancelMessage
        );
    }
}
