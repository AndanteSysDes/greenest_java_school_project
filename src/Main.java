public class Main {
    void main(){
        GreenHotel hotel = new GreenHotel();
        View view = new View(hotel);

        view.printStartMessage();

        view.showHotelPlants();
        String targetName = view.askPlantName();
        view.showWaterAmount(targetName);

        view.closeScanner();
    }

}
