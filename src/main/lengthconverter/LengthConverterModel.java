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

    void convertMToAll() {

        mmValue = String.valueOf(Double.parseDouble(mValue) * 1000);
        cmValue = String.valueOf(Double.parseDouble(mValue) * 100);
        dmValue = String.valueOf(Double.parseDouble(mValue) * 10);
        kmValue = String.valueOf(Double.parseDouble(mValue) * 1000);
        inValue = String.valueOf(Double.parseDouble(mValue) * 39.3700787);
        ftValue = String.valueOf(Double.parseDouble(mValue) * 3.2808399);
        ydValue = String.valueOf(Double.parseDouble(mValue) * 1.0936133);
        miValue = String.valueOf(Double.parseDouble(mValue) * 0.000621371192);
        ligaValue = String.valueOf(Double.parseDouble(mValue) * 0.000207123730745778);
    }

    void convertMmToM() {
        mValue = String.valueOf(Double.parseDouble(mmValue) * 0.001);
    }

    void convertCmToM() {
        mValue = String.valueOf(Double.parseDouble(cmValue) * 0.01);
    }

    void convertDmToM() {
        mValue = String.valueOf(Double.parseDouble(dmValue) * 0.1);
    }

    void convertKmToM() {
        mValue = String.valueOf(Double.parseDouble(kmValue) * 1000);
    }

    void convertInToM() {
        mValue = String.valueOf(Double.parseDouble(inValue) * 0.0254);
    }

    void convertFtToM() {
        mValue = String.valueOf(Double.parseDouble(ftValue) * 0.3048);
    }

    void convertYdToM() {
        mValue = String.valueOf(Double.parseDouble(ydValue) * 0.9144);
    }

    void convertMiToM() {
        mValue = String.valueOf(Double.parseDouble(miValue) * 1609.344);
    }

    void convertLigaToM() {
        mValue = String.valueOf(Double.parseDouble(ligaValue) * 4828.032);
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

    void setMmValue(String newValue) {
        this.mmValue = newValue;
    }

    void setCmValue(String newValue) {
        this.cmValue = newValue;
    }

    void setDmValue(String newValue) {
        this.dmValue = newValue;
    }

    void setMValue(String newValue) {
        this.mValue = newValue;
    }

    void setKmValue(String newValue) {
        this.kmValue = newValue;
    }

    void setInValue(String newValue) {
        this.inValue = newValue;
    }

    void setFtValue(String newValue) {
        this.ftValue = newValue;
    }

    void setYdValue(String newValue) {
        this.ydValue = newValue;
    }

    void setMiValue(String newValue) {
        this.miValue = newValue;
    }

    void setLigaValue(String newValue) {
        this.ligaValue = newValue;
    }
}
