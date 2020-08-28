package main.lengthconverter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

class LengthConverterView {

    private Scene scene;
    private Button mainMenuButton;
    private TextField mmValueTextField;
    private TextField cmValueTextField;
    private TextField dmValueTextField;
    private TextField mValueTextField;
    private TextField kmValueTextField;
    private TextField inValueTextField;
    private TextField ftValueTextField;
    private TextField ydValueTextField;
    private TextField miValueTextField;
    private TextField ligaValueTextField;

    LengthConverterView() {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(25);
        pane.setVgap(25);
        pane.setPadding(new Insets(30, 30, 30, 30));

        Text metricSystemNameText = new Text("Metric System");
        GridPane.setHalignment(metricSystemNameText, HPos.CENTER);
        metricSystemNameText.setFont(new Font("Default", 20));
        pane.add(metricSystemNameText, 0,0, 2, 1);

        Text mmNameText = new Text("milimetr [mm]");
        pane.add(mmNameText, 0, 1);
        mmValueTextField = new TextField("0");
        pane.add(mmValueTextField, 1, 1);

        Text cmNameText = new Text("centymetr [cm]");
        pane.add(cmNameText, 0, 2);
        cmValueTextField = new TextField("0");
        pane.add(cmValueTextField, 1, 2);

        Text dmNameText = new Text("decymetr [dm]");
        pane.add(dmNameText, 0, 3);
        dmValueTextField = new TextField("0");
        pane.add(dmValueTextField, 1, 3);

        Text mNameText = new Text("metr [m]");
        pane.add(mNameText, 0, 4);
        mValueTextField = new TextField("0");
        pane.add(mValueTextField, 1, 4);

        Text kmNameText = new Text("kilometr [km]");
        pane.add(kmNameText, 0, 5);
        kmValueTextField = new TextField("0");
        pane.add(kmValueTextField, 1, 5);

        Text imperialSystemNameText = new Text("Imperial System");
        GridPane.setHalignment(imperialSystemNameText, HPos.CENTER);
        imperialSystemNameText.setFont(new Font("Default", 20));
        pane.add(imperialSystemNameText, 0,6, 2, 1);

        Text inNameText = new Text("cal [in]");
        pane.add(inNameText, 0, 7);
        inValueTextField = new TextField("0");
        pane.add(inValueTextField, 1, 7);

        Text ftNameText = new Text("stopa [ft]");
        pane.add(ftNameText, 0, 8);
        ftValueTextField = new TextField("0");
        pane.add(ftValueTextField, 1, 8);

        Text ydNameText = new Text("jard [yd]");
        pane.add(ydNameText, 0, 9);
        ydValueTextField = new TextField("0");
        pane.add(ydValueTextField, 1, 9);

        Text miNameText = new Text("mila [mi]");
        pane.add(miNameText, 0, 10);
        miValueTextField = new TextField("0");
        pane.add(miValueTextField, 1, 10);

        Text ligaNameText = new Text("liga");
        pane.add(ligaNameText, 0, 11);
        ligaValueTextField = new TextField("0");
        pane.add(ligaValueTextField, 1, 11);

        mainMenuButton = new Button("return");
        GridPane.setHalignment(mainMenuButton, HPos.RIGHT);
        pane.add(mainMenuButton, 1, 12);

        scene = new Scene(pane);
    }

    void addListeners(EventHandler<ActionEvent> actionListener, EventHandler<KeyEvent> keyListener) {

        mainMenuButton.setOnAction(actionListener);
        mmValueTextField.setOnKeyReleased(keyListener);
        cmValueTextField.setOnKeyReleased(keyListener);
        dmValueTextField.setOnKeyReleased(keyListener);
        mValueTextField.setOnKeyReleased(keyListener);
        kmValueTextField.setOnKeyReleased(keyListener);
        inValueTextField.setOnKeyReleased(keyListener);
        ftValueTextField.setOnKeyReleased(keyListener);
        ydValueTextField.setOnKeyReleased(keyListener);
        miValueTextField.setOnKeyReleased(keyListener);
        ligaValueTextField.setOnKeyReleased(keyListener);
    }

    Scene getScene() {
        return scene;
    }

    TextField getMmValueTextField() {
        return mmValueTextField;
    }

    TextField getCmValueTextField() {
        return cmValueTextField;
    }

    TextField getDmValueTextField() {
        return dmValueTextField;
    }

    TextField getMValueTextField() {
        return mValueTextField;
    }

    TextField getKmValueTextField() {
        return kmValueTextField;
    }

    TextField getInValueTextField() {
        return inValueTextField;
    }

    TextField getFtValueTextField() {
        return ftValueTextField;
    }

    TextField getYdValueTextField() {
        return ydValueTextField;
    }

    TextField getMiValueTextField() {
        return miValueTextField;
    }

    TextField getLigaValueTextField() {
        return ligaValueTextField;
    }

    Button getMainMenuButton() {
        return mainMenuButton;
    }
}
