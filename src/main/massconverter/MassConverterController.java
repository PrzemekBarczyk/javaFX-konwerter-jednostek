package main.massconverter;

import main.Main;
import main.mainmenu.MainMenuController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.Scene;

public class MassConverterController {

    private MassConverterView theView;
    private MassConverterModel theModel;

    private EventHandler<ActionEvent> actionEventHandler;
    private EventHandler<KeyEvent> keyEventHandler;

    public MassConverterController() {

        this.theView = new MassConverterView();
        this.theModel = new MassConverterModel();

        this.createEventHandlers();
        this.theView.addEventHandlers(actionEventHandler, keyEventHandler);
    }

    private void createEventHandlers() {

        actionEventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Main.setScene(new MainMenuController().getScene());
            }
        };

        keyEventHandler = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                // zwraca skrót jednostki która została wywołana
                String unitSymbol = determineUnitSymbol(event.getSource());

                // weryfikacja przypadków nieporządanych
                String unitNewValue = theView.getUnitValue(unitSymbol); // aktualna wartość wpisanej jednostki
                if (unitNewValue.equals("")) { // usunięto ostatnią cyfrę
                    theModel.setUnitValue(unitSymbol, "0"); // ustaw wartość wybranej jednostki na "0"
                } else {
                    theModel.setUnitValue(unitSymbol, unitNewValue); // ustaw nową wartość wybranej jednostce
                }

                theModel.convertUnitToKg(unitSymbol); // zamień wybraną jednostę na metry
                theModel.convertKgToAllUnits(); // zamień metry na wszystkie jednostki
                updateViewUnitValues(unitSymbol); // zaaktualizuj wszystkie jednostki z wyjątkiem wybranej
            }
        };
    }

    private String determineUnitSymbol(Object selectedField) {

        if (selectedField == theView.getMgValueTextField()) {
            return "mg";
        } else if (selectedField == theView.getGValueTextField()) {
            return "g";
        } else if (selectedField == theView.getDkgValueTextField()) {
            return "dkg";
        } else if (selectedField == theView.getKgValueTextField()) {
            return "kg";
        } else if (selectedField == theView.getTValueTextField()) {
            return "T";
        } else if (selectedField == theView.getOzValueTextField()) {
            return "oz";
        } else if (selectedField == theView.getLbValueTextField()) {
            return "lb";
        } else if (selectedField == theView.getStValueTextField()) {
            return "st";
        } else if (selectedField == theView.getCetnarUsValueTextField()) {
            return "cetnarUs";
        } else if (selectedField == theView.getCetnarUkValueTextField()) {
            return "cetnarUk";
        } else if (selectedField == theView.getTonUsValueTextField()) {
            return "tonUs";
        } else if (selectedField == theView.getTonUkValueTextField()) {
            return "tonUk";
        } else {
            return "gr";
        }
    }

    private void updateViewUnitValues(String selectedUnit) {

        if (!selectedUnit.equals("mg"))
            theView.getMgValueTextField().setFormatedText(theModel.getMgValue());
        if (!selectedUnit.equals("g"))
            theView.getGValueTextField().setFormatedText(theModel.getGValue());
        if (!selectedUnit.equals("dkg"))
            theView.getDkgValueTextField().setFormatedText(theModel.getDkgValue());
        if (!selectedUnit.equals("kg"))
            theView.getKgValueTextField().setFormatedText(theModel.getKgValue());
        if (!selectedUnit.equals("T"))
            theView.getTValueTextField().setFormatedText(theModel.getTValue());
        if (!selectedUnit.equals("oz"))
            theView.getOzValueTextField().setFormatedText(theModel.getOzValue());
        if (!selectedUnit.equals("lb"))
            theView.getLbValueTextField().setFormatedText(theModel.getLbValue());
        if (!selectedUnit.equals("st"))
            theView.getStValueTextField().setFormatedText(theModel.getStValue());
        if (!selectedUnit.equals("cetnarUs"))
            theView.getCetnarUsValueTextField().setFormatedText(theModel.getCetnarUsValue());
        if (!selectedUnit.equals("cetnarUk"))
            theView.getCetnarUkValueTextField().setFormatedText(theModel.getCetnarUkValue());
        if (!selectedUnit.equals("tonUs"))
            theView.getTonUsValueTextField().setFormatedText(theModel.getTonUsValue());
        if (!selectedUnit.equals("tonUk"))
            theView.getTonUkValueTextField().setFormatedText(theModel.getTonUkValue());
        if (!selectedUnit.equals("gr"))
            theView.getGrValueTextField().setFormatedText(theModel.getGrValue());
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
