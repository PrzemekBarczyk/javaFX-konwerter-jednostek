package main.massconverter;

class MassConverterModel {

    private String mgValue;
    private String gValue;
    private String dkgValue;
    private String kgValue;
    private String TValue;
    private String ozValue;
    private String lbValue;
    private String stValue;
    private String cetnarUsValue;
    private String cetnarUkValue;
    private String tonUsValue;
    private String tonUkValue;
    private String grValue;

    MassConverterModel() {

        mgValue = "0";
        gValue = "0";
        dkgValue = "0";
        kgValue = "0";
        TValue = "0";
        ozValue = "0";
        lbValue = "0";
        stValue = "0";
        cetnarUsValue = "0";
        cetnarUkValue = "0";
        tonUsValue = "0";
        tonUkValue = "0";
        grValue = "0";
    }

    void convertKgToAllUnits() {

        mgValue = String.valueOf(Double.parseDouble(kgValue) * 1000000);
        gValue = String.valueOf(Double.parseDouble(kgValue) * 1000);
        dkgValue = String.valueOf(Double.parseDouble(kgValue) * 100);
        TValue = String.valueOf(Double.parseDouble(kgValue) * 0.001);
        ozValue = String.valueOf(Double.parseDouble(kgValue) * 35.2739619);
        lbValue = String.valueOf(Double.parseDouble(kgValue) * 2.20462262);
        stValue = String.valueOf(Double.parseDouble(kgValue) * 0.1574803149606299);
        cetnarUsValue = String.valueOf(Double.parseDouble(kgValue) * 0.0220462442018378);
        cetnarUkValue = String.valueOf(Double.parseDouble(kgValue) * 0.0196841305522212);
        tonUsValue = String.valueOf(Double.parseDouble(kgValue) * 0.0011023170704822);
        tonUkValue = String.valueOf(Double.parseDouble(kgValue) * 0.0009842035332906845);
        grValue = String.valueOf(Double.parseDouble(kgValue) * 15432.35835294143 );
    }

    void convertUnitToKg(String selectedUnit) {

        if (selectedUnit.equals("mg")) {
            kgValue = String.valueOf(Double.parseDouble(mgValue) * 0.000001);
        } else if (selectedUnit.equals("g")) {
            kgValue = String.valueOf(Double.parseDouble(gValue) * 0.001);
        } else if (selectedUnit.equals("dkg")) {
            kgValue = String.valueOf(Double.parseDouble(dkgValue) * 0.01);
        } else if (selectedUnit.equals("kg")) {
            ;
        } else if (selectedUnit.equals("T")) {
            kgValue = String.valueOf(Double.parseDouble(TValue) * 1000);
        } else if (selectedUnit.equals("oz")) {
            kgValue = String.valueOf(Double.parseDouble(ozValue) * 0.0283495231648476);
        } else if (selectedUnit.equals("lb")) {
            kgValue = String.valueOf(Double.parseDouble(lbValue) * 0.4535923703803783);
        } else if (selectedUnit.equals("st")) {
            kgValue = String.valueOf(Double.parseDouble(stValue) * 6.35);
        } else if (selectedUnit.equals("cetnarUs")) {
            kgValue = String.valueOf(Double.parseDouble(cetnarUsValue) * 45.3592);
        } else if (selectedUnit.equals("cetnarUk")) {
            kgValue = String.valueOf(Double.parseDouble(cetnarUkValue) * 50.80234544);
        } else if (selectedUnit.equals("tonUs")) {
            kgValue = String.valueOf(Double.parseDouble(tonUsValue) * 907.18);
        } else if (selectedUnit.equals("tonUk")) {
            kgValue = String.valueOf(Double.parseDouble(tonUkValue) * 1016.05);
        } else {
            kgValue = String.valueOf(Double.parseDouble(grValue) * 0.00006479891);
        }
    }

    String getMgValue() {
        return mgValue;
    }

    String getGValue() {
        return gValue;
    }

    String getDkgValue() {
        return dkgValue;
    }

    String getKgValue() {
        return kgValue;
    }

    String getTValue() {
        return TValue;
    }

    String getOzValue() {
        return ozValue;
    }

    String getLbValue() {
        return lbValue;
    }

    String getStValue() {
        return stValue;
    }

    String getCetnarUsValue() {
        return cetnarUsValue;
    }

    String getCetnarUkValue() {
        return cetnarUkValue;
    }

    String getTonUsValue() {
        return tonUsValue;
    }

    String getTonUkValue() {
        return tonUkValue;
    }

    String getGrValue() {
        return grValue;
    }

    void setUnitValue(String selectedUnit, String newValue) {

        if (selectedUnit.equals("mg")) {
            this.mgValue = newValue;
        } else if (selectedUnit.equals("g")) {
            this.gValue = newValue;
        } else if (selectedUnit.equals("dkg")) {
            this.dkgValue = newValue;
        } else if (selectedUnit.equals("kg")) {
            this.kgValue = newValue;
        } else if (selectedUnit.equals("T")) {
            this.TValue = newValue;
        } else if (selectedUnit.equals("oz")) {
            this.ozValue = newValue;
        } else if (selectedUnit.equals("lb")) {
            this.lbValue = newValue;
        } else if (selectedUnit.equals("st")) {
            this.stValue = newValue;
        } else if (selectedUnit.equals("cetnarUs")) {
            this.cetnarUsValue = newValue;
        } else if (selectedUnit.equals("cetnarUk")){
            this.cetnarUkValue = newValue;
        } else if (selectedUnit.equals("tonUs")) {
            this.tonUsValue = newValue;
        } else if (selectedUnit.equals("tonUk"));
        else {
            this.grValue = newValue;
        }
    }
}
