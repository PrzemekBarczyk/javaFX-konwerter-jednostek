package main.mainmenu;

import main.Main;
import main.lengthconverter.LengthConverterController;
//import main.massconverter.MassConverterController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class MainMenuController implements EventHandler<ActionEvent> {

    private MainMenuView theView;
    private MainMenuModel theModel;

    public MainMenuController() {

        this.theView = new MainMenuView();
        this.theModel = new MainMenuModel();

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

        if (evt == theView.getLengthButton()) {
            Main.setScene(new LengthConverterController().getScene());
        }
//        else if (evt == theView.getMassButton()) {
//            Main.setScene(new MassConverterController().getScene());
//        }
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
