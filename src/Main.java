import greenest.model.GreenHotel;
import greenest.ui.View;

public class Main {
    void main(){
        GreenHotel hotel = new GreenHotel();
        View view = new View(hotel);

        view.showStartMessage();
        String targetName = view.askPlantName();
        if(targetName==null){
            view.showCancelMessage();
            System.exit(0);
        }
        view.showWaterAmount(targetName);

    }

}
