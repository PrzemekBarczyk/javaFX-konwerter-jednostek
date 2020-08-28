package main.lengthconverter;

import main.Main;
import main.mainmenu.MainMenuController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;

public class LengthConverterController {

    private LengthConverterView theView;
    private LengthConverterModel theModel;

    public LengthConverterController() {

        this.theView = new LengthConverterView();
        this.theModel = new LengthConverterModel();

        this.theView.addListeners(this.actionHandler, this.keyHandler);
    }

    EventHandler<ActionEvent> actionHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Main.setScene(new MainMenuController().getScene()); // zaznaczono przycisk menu głównego
        }
    };

    EventHandler<KeyEvent> keyHandler = new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent event) {

            Object evt = event.getSource();
            
            String chosenOperation = "";
            if (evt == theView.getMmValueTextField()) {
                theModel.setMmValue(theView.getMmValueTextField().getText());
                theModel.convertMmToM();
                chosenOperation = "mm";
            }
            else if (evt == theView.getCmValueTextField()) {
                theModel.setCmValue(theView.getCmValueTextField().getText());
                theModel.convertCmToM();
                chosenOperation = "cm";
            }
            else if (evt == theView.getDmValueTextField()) {
                theModel.setDmValue(theView.getDmValueTextField().getText());
                theModel.convertDmToM();
                chosenOperation = "dm";
            }
            else if (evt == theView.getMValueTextField()) {
                theModel.setMValue(theView.getMValueTextField().getText());
                chosenOperation = "m";
            }
            else if (evt == theView.getKmValueTextField()) {
                theModel.setKmValue(theView.getKmValueTextField().getText());
                theModel.convertKmToM();
                chosenOperation = "km";
            }
            else if (evt == theView.getInValueTextField()) {
                theModel.setInValue(theView.getInValueTextField().getText());
                theModel.convertInToM();
                chosenOperation = "in";
            }
            else if (evt == theView.getFtValueTextField()) {
                theModel.setFtValue(theView.getFtValueTextField().getText());
                theModel.convertFtToM();
                chosenOperation = "ft";
            }
            else if (evt == theView.getYdValueTextField()) {
                theModel.setYdValue(theView.getYdValueTextField().getText());
                theModel.convertYdToM();
                chosenOperation = "yd";
            }
            else if (evt == theView.getMiValueTextField()) {
                theModel.setMiValue(theView.getMiValueTextField().getText());
                theModel.convertMiToM();
                chosenOperation = "mi";
            }
            else if (evt == theView.getLigaValueTextField()) {
                theModel.setLigaValue(theView.getLigaValueTextField().getText());
                theModel.convertLigaToM();
                chosenOperation = "liga";
            }

            theModel.convertMToAll();
            updateUnitValues(chosenOperation);
        }
    };

    private void updateUnitValues(String chosenOperation) {

        if (!chosenOperation.equals("mm"))
            theView.getMmValueTextField().setText(theModel.getMmValue());
        if (!chosenOperation.equals("cm"))
            theView.getCmValueTextField().setText(theModel.getCmValue());
        if (!chosenOperation.equals("dm"))
            theView.getDmValueTextField().setText(theModel.getDmValue());
        if (!chosenOperation.equals("m"))
            theView.getMValueTextField().setText(theModel.getMValue());
        if (!chosenOperation.equals("km"))
            theView.getKmValueTextField().setText(theModel.getKmValue());
        if (!chosenOperation.equals("in"))
            theView.getInValueTextField().setText(theModel.getInValue());
        if (!chosenOperation.equals("ft"))
            theView.getFtValueTextField().setText(theModel.getFtValue());
        if (!chosenOperation.equals("yd"))
            theView.getYdValueTextField().setText(theModel.getYdValue());
        if (!chosenOperation.equals("mi"))
            theView.getMiValueTextField().setText(theModel.getMiValue());
        if (!chosenOperation.equals("liga"))
            theView.getLigaValueTextField().setText(theModel.getLigaValue());
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
