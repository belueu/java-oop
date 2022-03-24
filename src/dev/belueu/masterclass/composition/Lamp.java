package dev.belueu.masterclass.composition;

public class Lamp {

    private String style;
    private boolean isBatteryPowerd;
    private int globRating;

    public Lamp(String style, boolean isBatteryPowerd, int globRating) {
        this.style = style;
        this.isBatteryPowerd = isBatteryPowerd;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBatteryPowerd() {
        return isBatteryPowerd;
    }

    public int getGlobRating() {
        return globRating;
    }
}
