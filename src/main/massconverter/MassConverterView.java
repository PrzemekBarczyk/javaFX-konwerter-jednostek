package main.massconverter;

import javafx.geometry.HPos;
import javafx.scene.input.KeyEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import main.utilities.NumericFormattedTextField;

class MassConverterView {

    private Scene scene;
    private Button mainMenuButton;
    private NumericFormattedTextField mgValueTextField;
    private NumericFormattedTextField gValueTextField;
    private NumericFormattedTextField dkgValueTextField;
    private NumericFormattedTextField kgValueTextField;
    private NumericFormattedTextField TValueTextField;
    private NumericFormattedTextField ozValueTextField;
    private NumericFormattedTextField lbValueTextField;
    private NumericFormattedTextField stValueTextField;
    private NumericFormattedTextField cetnarUsValueTextField;
    private NumericFormattedTextField cetnarUkValueTextField;
    private NumericFormattedTextField tonUsValueTextField;
    private NumericFormattedTextField tonUkValueTextField;
    private NumericFormattedTextField grValueTextField;

    MassConverterView() {
        this.createGUI();
    }

    private void createGUI() {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(25);
        pane.setVgap(25);
        pane.setPadding(new Insets(30, 30, 30, 30));

        Text metricSystemNameText = new Text("Metric System");
        GridPane.setHalignment(metricSystemNameText, HPos.CENTER);
        metricSystemNameText.setFont(new Font("Default", 20));
        pane.add(metricSystemNameText, 0,0, 2, 1);

        Text mgNameText = new Text("miligram [mg]");
        pane.add(mgNameText, 0, 1);
        mgValueTextField = new NumericFormattedTextField("0");
        pane.add(mgValueTextField, 1, 1);

        Text gNameText = new Text("gram [g]");
        pane.add(gNameText, 0, 2);
        gValueTextField = new NumericFormattedTextField("0");
        pane.add(gValueTextField, 1, 2);

        Text dkgNameText = new Text("dekagram [dkg]");
        pane.add(dkgNameText, 0, 3);
        dkgValueTextField = new NumericFormattedTextField("0");
        pane.add(dkgValueTextField, 1, 3);

        Text kgNameText = new Text("kilogram [kg]");
        pane.add(kgNameText, 0, 4);
        kgValueTextField = new NumericFormattedTextField("0");
        pane.add(kgValueTextField, 1, 4);

        Text TNameText = new Text("tona [T]");
        pane.add(TNameText, 0, 5);
        TValueTextField = new NumericFormattedTextField("0");
        pane.add(TValueTextField, 1, 5);

        Text imperialSystemNameText = new Text("Imperial System");
        GridPane.setHalignment(imperialSystemNameText, HPos.CENTER);
        imperialSystemNameText.setFont(new Font("Default", 20));
        pane.add(imperialSystemNameText, 0,6, 2, 1);

        Text ozNameText = new Text("uncja [oz]");
        pane.add(ozNameText, 0, 7);
        ozValueTextField = new NumericFormattedTextField("0");
        pane.add(ozValueTextField, 1, 7);

        Text lbNameText = new Text("funt [lb]");
        pane.add(lbNameText, 0, 8);
        lbValueTextField = new NumericFormattedTextField("0");
        pane.add(lbValueTextField, 1, 8);

        Text stNameText = new Text("stone [st]");
        pane.add(stNameText, 0, 9);
        stValueTextField = new NumericFormattedTextField("0");
        pane.add(stValueTextField, 1, 9);

        Text cetnarUsNameText = new Text("cetnar US");
        pane.add(cetnarUsNameText, 0, 10);
        cetnarUsValueTextField = new NumericFormattedTextField("0");
        pane.add(cetnarUsValueTextField, 1, 10);

        Text cetnarUkNameText = new Text("cetnar UK");
        pane.add(cetnarUkNameText, 0, 11);
        cetnarUkValueTextField = new NumericFormattedTextField("0");
        pane.add(cetnarUkValueTextField, 1, 11);

        Text tonUsNameText = new Text("tona krótka [ton US]");
        pane.add(tonUsNameText, 0, 12);
        tonUsValueTextField = new NumericFormattedTextField("0");
        pane.add(tonUsValueTextField, 1, 12);

        Text tonUkNameText = new Text("tona długa [ton UK]");
        pane.add(tonUkNameText, 0, 13);
        tonUkValueTextField = new NumericFormattedTextField("0");
        pane.add(tonUkValueTextField, 1, 13);

        Text grNameText = new Text("grain [gr]");
        pane.add(grNameText, 0, 14);
        grValueTextField = new NumericFormattedTextField("0");
        pane.add(grValueTextField, 1, 14);

        mainMenuButton = new Button("return");
        GridPane.setHalignment(mainMenuButton, HPos.RIGHT);
        pane.add(mainMenuButton, 1, 15);

        scene = new Scene(pane);
    }

    void addEventHandlers(EventHandler<ActionEvent> actionEventHandler, EventHandler<KeyEvent> keyEventHandler) {

        mainMenuButton.setOnAction(actionEventHandler);
        mgValueTextField.setOnKeyReleased(keyEventHandler);
        gValueTextField.setOnKeyReleased(keyEventHandler);
        dkgValueTextField.setOnKeyReleased(keyEventHandler);
        kgValueTextField.setOnKeyReleased(keyEventHandler);
        TValueTextField.setOnKeyReleased(keyEventHandler);
        ozValueTextField.setOnKeyReleased(keyEventHandler);
        lbValueTextField.setOnKeyReleased(keyEventHandler);
        stValueTextField.setOnKeyReleased(keyEventHandler);
        cetnarUsValueTextField.setOnKeyReleased(keyEventHandler);
        cetnarUkValueTextField.setOnKeyReleased(keyEventHandler);
        tonUsValueTextField.setOnKeyReleased(keyEventHandler);
        tonUkValueTextField.setOnKeyReleased(keyEventHandler);
        grValueTextField.setOnKeyReleased(keyEventHandler);
    }

    Scene getScene() {
        return scene;
    }

    NumericFormattedTextField getMgValueTextField() {
        return mgValueTextField;
    }

    NumericFormattedTextField getGValueTextField() {
        return gValueTextField;
    }

    NumericFormattedTextField getDkgValueTextField() {
        return dkgValueTextField;
    }

    NumericFormattedTextField getKgValueTextField() {
        return kgValueTextField;
    }

    NumericFormattedTextField getTValueTextField() {
        return TValueTextField;
    }

    NumericFormattedTextField getOzValueTextField() {
        return ozValueTextField;
    }

    NumericFormattedTextField getLbValueTextField() {
        return lbValueTextField;
    }

    NumericFormattedTextField getStValueTextField() {
        return stValueTextField;
    }

    NumericFormattedTextField getCetnarUsValueTextField() {
        return cetnarUsValueTextField;
    }

    NumericFormattedTextField getCetnarUkValueTextField() {
        return cetnarUkValueTextField;
    }

    NumericFormattedTextField getTonUsValueTextField() {
        return tonUsValueTextField;
    }

    NumericFormattedTextField getTonUkValueTextField() {
        return tonUkValueTextField;
    }

    NumericFormattedTextField getGrValueTextField() {
        return grValueTextField;
    }

    String getUnitValue(String selectedUnit) {

        if (selectedUnit.equals("mg"))
            return mgValueTextField.getText();
        if (selectedUnit.equals("g"))
            return gValueTextField.getText();
        if (selectedUnit.equals("dkg"))
            return dkgValueTextField.getText();
        if (selectedUnit.equals("kg"))
            return kgValueTextField.getText();
        if (selectedUnit.equals("T"))
            return TValueTextField.getText();
        if (selectedUnit.equals("oz"))
            return ozValueTextField.getText();
        if (selectedUnit.equals("lb"))
            return lbValueTextField.getText();
        if (selectedUnit.equals("st"))
            return stValueTextField.getText();
        if (selectedUnit.equals("cetnarUs"))
            return cetnarUsValueTextField.getText();
        if (selectedUnit.equals("cetnarUk"))
            return cetnarUkValueTextField.getText();
        if (selectedUnit.equals("tonUs"))
            return tonUsValueTextField.getText();
        if (selectedUnit.equals("tonUk"))
            return tonUkValueTextField.getText();
        return grValueTextField.getText();
    }
}
