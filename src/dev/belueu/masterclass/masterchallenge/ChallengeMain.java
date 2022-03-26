package dev.belueu.masterclass.masterchallenge;

public class ChallengeMain {
    public static void main(String[] args) {

        Hamburger beefBurger = new Hamburger("Beef Burger", "Beef", 5.85, "Crispy");
        ExtraItem cheese = new ExtraItem("Cheese", 0.33);
        ExtraItem bacon = new ExtraItem("Bacon", 2.35);

        beefBurger.setAdditionalItem(cheese);
        beefBurger.setAdditionalItem(bacon);

        System.out.println("Total burger price is: $" + beefBurger.getPrice());
        System.out.println("-------------");

        HealthyBurger freshBurger = new HealthyBurger("Duck", 12.34);
        HealthyItem avocado = new HealthyItem("Avocado", 1.22);
        freshBurger.setHealthyItem(avocado);
        freshBurger.setAdditionalItem(cheese);

        System.out.println("Total healthy burger price is: $" + freshBurger.getPrice());
    }
}
