package main.mainmenu;

import main.Main;
import main.lengthconverter.LengthConverterController;
import main.massconverter.MassConverterController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class MainMenuController {

    private MainMenuView theView;
    private MainMenuModel theModel;

    private EventHandler<ActionEvent> actionEventHandler;

    public MainMenuController() {

        this.theView = new MainMenuView();
        this.theModel = new MainMenuModel();

        this.createEventHandlers();
        this.theView.addEventHandlers(actionEventHandler);
    }

    private void createEventHandlers() {

        actionEventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Object evt = event.getSource();

                if (evt == theView.getLengthButton()) {
                    Main.setScene(new LengthConverterController().getScene());
                } else {
                    Main.setScene(new MassConverterController().getScene());
                }
            }
        };
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
