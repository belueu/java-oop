package dev.belueu.masterclass.oop;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
}
