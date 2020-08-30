package main.utilities;

import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.text.DecimalFormat;

public class NumericFormattedTextField extends TextField {

    private static DecimalFormat decimalFormat = new DecimalFormat("#.####");

    public NumericFormattedTextField(String text) {

        super(text);

        this.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() { // można wpisać tylko cyfry
            @Override
            public void handle(KeyEvent keyEvent) {
                if (!"0123456789".contains(keyEvent.getCharacter())) {
                    keyEvent.consume();
                }
            }
        });
    }

    public void setFormatedText(String value) {

        value = decimalFormat.format(Double.parseDouble(value));
        super.setText(value);
    }

    @Override
    public void paste() { } // usuwa możliwość wklejania danych
}
