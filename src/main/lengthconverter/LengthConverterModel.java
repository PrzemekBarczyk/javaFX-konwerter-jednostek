package main.lengthconverter;

class LengthConverterModel {

    private String mmValue;
    private String cmValue;
    private String dmValue;
    private String mValue;
    private String kmValue;
    private String inValue;
    private String ftValue;
    private String ydValue;
    private String miValue;
    private String ligaValue;

    LengthConverterModel() {

        mmValue = "0";
        cmValue = "0";
        dmValue = "0";
        mValue = "0";
        kmValue = "0";
        inValue = "0";
        ftValue = "0";
        ydValue = "0";
        miValue = "0";
        ligaValue = "0";
    }

    void convertMToAllUnits() {

        mmValue = String.valueOf(Double.parseDouble(mValue) * 1000);
        cmValue = String.valueOf(Double.parseDouble(mValue) * 100);
        dmValue = String.valueOf(Double.parseDouble(mValue) * 10);
        kmValue = String.valueOf(Double.parseDouble(mValue) * 0.001);
        inValue = String.valueOf(Double.parseDouble(mValue) * 39.3700787);
        ftValue = String.valueOf(Double.parseDouble(mValue) * 3.2808399);
        ydValue = String.valueOf(Double.parseDouble(mValue) * 1.0936133);
        miValue = String.valueOf(Double.parseDouble(mValue) * 0.000621371192);
        ligaValue = String.valueOf(Double.parseDouble(mValue) * 0.000207123730745778);
    }

    void convertUnitToM(String selectedUnit) {

        if (selectedUnit.equals("mm")) {
            mValue = String.valueOf(Double.parseDouble(mmValue) * 0.001);
        } else if (selectedUnit.equals("cm")) {
            mValue = String.valueOf(Double.parseDouble(cmValue) * 0.01);
        } else if (selectedUnit.equals("dm")) {
            mValue = String.valueOf(Double.parseDouble(dmValue) * 0.1);
        } else if (selectedUnit.equals("m")) {
            ;
        } else if (selectedUnit.equals("km")) {
            mValue = String.valueOf(Double.parseDouble(kmValue) * 1000);
        } else if (selectedUnit.equals("in")) {
            mValue = String.valueOf(Double.parseDouble(inValue) * 0.0254);
        } else if (selectedUnit.equals("ft")) {
            mValue = String.valueOf(Double.parseDouble(ftValue) * 0.3048);
        } else if (selectedUnit.equals("yd")) {
            mValue = String.valueOf(Double.parseDouble(ydValue) * 0.9144);
        } else if (selectedUnit.equals("mi")) {
            mValue = String.valueOf(Double.parseDouble(miValue) * 1609.344);
        } else {
            mValue = String.valueOf(Double.parseDouble(ligaValue) * 4828.032);
        }
    }

    String getMmValue() {
        return mmValue;
    }

    String getCmValue() {
        return cmValue;
    }

    String getDmValue() {
        return dmValue;
    }

    String getMValue() {
        return mValue;
    }

    String getKmValue() {
        return kmValue;
    }

    String getInValue() {
        return inValue;
    }

    String getFtValue() {
        return ftValue;
    }

    String getYdValue() {
        return ydValue;
    }

    String getMiValue() {
        return miValue;
    }

    String getLigaValue() {
        return ligaValue;
    }

    void setUnitValue(String selectedUnit, String newValue) {

        if (selectedUnit.equals("mm")) {
            this.mmValue = newValue;
        } else if (selectedUnit.equals("cm")) {
            this.cmValue = newValue;
        } else if (selectedUnit.equals("dm")) {
            this.dmValue = newValue;
        } else if (selectedUnit.equals("m")) {
            this.mValue = newValue;
        } else if (selectedUnit.equals("km")) {
            this.kmValue = newValue;
        } else if (selectedUnit.equals("in")) {
            this.inValue = newValue;
        } else if (selectedUnit.equals("ft")) {
            this.ftValue = newValue;
        } else if (selectedUnit.equals("yd")) {
            this.ydValue = newValue;
        } else if (selectedUnit.equals("mi")) {
            this.miValue = newValue;
        } else {
            this.ligaValue = newValue;
        }
    }
}
