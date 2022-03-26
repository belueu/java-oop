package dev.belueu.masterclass.masterchallenge;

public class HealthyItem {

    private String healthyItemName;
    private double healthyItemPrice;

    public HealthyItem(String healthyItemName, double healthyItemPrice) {
        this.healthyItemName = healthyItemName;
        this.healthyItemPrice = healthyItemPrice;
    }

    public String getHealthyItemName() {
        return healthyItemName;
    }

    public void setHealthyItemName(String healthyItemName) {
        this.healthyItemName = healthyItemName;
    }

    public double getHealthyItemPrice() {
        return healthyItemPrice;
    }

    public void setHealthyItemPrice(double healthyItemPrice) {
        this.healthyItemPrice = healthyItemPrice;
    }
}
