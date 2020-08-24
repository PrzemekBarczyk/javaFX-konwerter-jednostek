import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Unit Converter");
        primaryStage.setScene(new MainMenuController(new MainMenuView(), new MainMenuModel(), primaryStage).getScene());
        primaryStage.show();
    }
}
