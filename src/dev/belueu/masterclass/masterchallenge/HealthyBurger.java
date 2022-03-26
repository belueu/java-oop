package dev.belueu.masterclass.masterchallenge;

public class HealthyBurger extends Hamburger {

    private HealthyItem healthyItem;

    public HealthyBurger(String meatType, double price) {
        super("Healthy Burger", meatType, price, "Brown Bread");
    }

    public HealthyItem getHealthyItem() {
        return healthyItem;
    }

    public void setHealthyItem(HealthyItem healthyItem) {
        this.healthyItem = healthyItem;
        setPrice(getPrice() + healthyItem.getHealthyItemPrice());
    }
}
