package application.mainmenu;

//import application.Main;
//import application.lengthconverter.LengthConverterController;
//import application.lengthconverter.LengthConverterModel;
//import application.lengthconverter.LengthConverterView;
//import application.massconverter.MassConverterController;
//import application.massconverter.MassConverterModel;
//import application.massconverter.MassConverterView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class MainMenuController implements EventHandler<ActionEvent> {

    private MainMenuView theView;
    private MainMenuModel theModel;

    public MainMenuController(MainMenuView theView, MainMenuModel theModel) {

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

//        if (evt == theView.getLengthButton()) {
//            Main.setScene(new LengthConverterController(new LengthConverterView(), new LengthConverterModel()).getScene());
//        }
//        else if (evt == theView.getMassButton()) {
//            Main.setScene(new MassConverterController(new MassConverterView(), new MassConverterModel()).getScene());
//        }
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
