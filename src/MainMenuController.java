import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController implements EventHandler<ActionEvent> {

    private Stage primaryStage;
    private MainMenuView theView;
    private MainMenuModel theModel;

    public MainMenuController(MainMenuView theView, MainMenuModel theModel, Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {

        Object evt = event.getSource();

//        if (evt == theView.getLengthButton()) {
//            primaryStage.setScene(new LengthConverterController(new LengthConverterView(), new LengthConverterModel(), primaryStage).getScene());
//        }
//        else if (evt == theView.getMassButton()) {
//            primaryStage.setScene(new MassConverterController(new MassConverterView(), new MassConverterModel(), primaryStage).getScene());
//        }
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
