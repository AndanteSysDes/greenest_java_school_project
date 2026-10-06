import java.util.Scanner;

public class View {

    Scanner scanner;
    GreenHotel hotel;

    String startMessage = "Välkommen till Växthotellet Greenest";
    String askingMessage = "Vilken växt ska få vätska? Ange ett namn:";

    public View(GreenHotel hotel){
        scanner = new Scanner(System.in);
        this.hotel = hotel;
    }

    public void closeScanner() {
        scanner.close();
    }

    public void printSeparator(){
        System.out.println("----------------------------------------------------");
    }

    public void printDoubleSeparator() {
        System.out.println("===================================================");
    }

    public void printStartMessage(){
        printDoubleSeparator();
        System.out.println(startMessage);
        printDoubleSeparator();
    }

    public void showHotelPlants(){
        hotel.showAllPlants();
        printSeparator();
    }

    public String askPlantName(){
        while(true){
            System.out.print(askingMessage);
            String input = scanner.nextLine().trim();
            String searchWord = input.toLowerCase();
            if(hotel.hasPlant(searchWord)){
                return searchWord;
            }
            System.out.println("Hotellet har inte " + input + ". Försök igen.");
        }
    }

    public void showWaterAmount(String plantName){
        /*
        Programmet visar en ny ruta som talar om:
        hur mycket vätska växten ska ha
        vilken sorts vätska det är (kranvatten, mineralvatten eller proteindryck)
         */
        System.out.println();
        System.out.println(hotel.getLiquidAmount(plantName));
        System.out.println();
    }




}
