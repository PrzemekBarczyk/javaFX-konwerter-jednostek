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

            // zwraca skrót jednostki która została wywołana
            String unitSymbol = determineUnitSymbol(event.getSource());

            // weryfikacja przypadków nieporządanych
            String unitNewValue = theView.getUnitValue(unitSymbol); // aktualna wartość wpisanej jednostki
            if (unitNewValue.equals("")) { // usunięto ostatnią cyfrę
                theModel.setUnitValue(unitSymbol, "0"); // ustaw wartość wybranej jednostki na "0"
            } else {
                theModel.setUnitValue(unitSymbol, unitNewValue); // ustaw nową wartość wybranej jednostce
            }

            theModel.convertUnitToM(unitSymbol); // zamień wybraną jednostę na metry
            theModel.convertMToAllUnits(); // zamień metry na wszystkie jednostki
            updateViewUnitValues(unitSymbol); // zaaktualizuj wszystkie jednostki z wyjątkiem wybranej
        }
    };

    private String determineUnitSymbol(Object selectedField) {

        if (selectedField == theView.getMmValueTextField()) {
            return "mm";
        } else if (selectedField == theView.getCmValueTextField()) {
            return "cm";
        } else if (selectedField == theView.getDmValueTextField()) {
            return "dm";
        } else if (selectedField == theView.getMValueTextField()) {
            return "m";
        } else if (selectedField == theView.getKmValueTextField()) {
            return "km";
        } else if (selectedField == theView.getInValueTextField()) {
            return "in";
        } else if (selectedField == theView.getFtValueTextField()) {
            return "ft";
        } else if (selectedField == theView.getYdValueTextField()) {
            return "yd";
        } else if (selectedField == theView.getMiValueTextField()) {
            return "mi";
        } else {
            return "liga";
        }
    }

    private void updateViewUnitValues(String selectedUnit) {

        if (!selectedUnit.equals("mm"))
            theView.getMmValueTextField().setText(theModel.getMmValue());
        if (!selectedUnit.equals("cm"))
            theView.getCmValueTextField().setText(theModel.getCmValue());
        if (!selectedUnit.equals("dm"))
            theView.getDmValueTextField().setText(theModel.getDmValue());
        if (!selectedUnit.equals("m"))
            theView.getMValueTextField().setText(theModel.getMValue());
        if (!selectedUnit.equals("km"))
            theView.getKmValueTextField().setText(theModel.getKmValue());
        if (!selectedUnit.equals("in"))
            theView.getInValueTextField().setText(theModel.getInValue());
        if (!selectedUnit.equals("ft"))
            theView.getFtValueTextField().setText(theModel.getFtValue());
        if (!selectedUnit.equals("yd"))
            theView.getYdValueTextField().setText(theModel.getYdValue());
        if (!selectedUnit.equals("mi"))
            theView.getMiValueTextField().setText(theModel.getMiValue());
        if (!selectedUnit.equals("liga"))
            theView.getLigaValueTextField().setText(theModel.getLigaValue());
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
