package dev.belueu.masterclass.masterchallenge;

public class Hamburger {

    private String name;
    private String meatType;
    private double price;
    private String breadType;

    private ExtraItem extraItem;

    public Hamburger(String name, String meatType, double price, String breadType) {
        this.name = name;
        this.meatType = meatType;
        this.price = price;
        this.breadType = breadType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public ExtraItem getExtraItem() {
        return extraItem;
    }

    public void setExtraItem(ExtraItem extraItem) {
        this.extraItem = extraItem;
    }

    public void setAdditionalItem(ExtraItem extraItem) {
        this.extraItem = extraItem;
        price += extraItem.getItemPrice();
    }

}
