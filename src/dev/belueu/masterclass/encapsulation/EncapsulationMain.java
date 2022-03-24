package dev.belueu.masterclass.encapsulation;

public class EncapsulationMain {

    public static void main(String[] args) {
        System.out.println("---Bad Example of Encapsulation---");

        Player player = new Player();
        player.name = "John";
        player.health = 100;
        player.weapon = "Laser";

        player.loseHealth(10);
        System.out.println("Remaining health: " + player.heathRemaining());

        player.loseHealth(91);
        System.out.println("Remaining health: " + player.heathRemaining());
        System.out.println();

        System.out.println("---Good Example of Encapsulation");
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Bel", 150, "Knife");
        System.out.println("Current health: " + enhancedPlayer.getHealth());

        enhancedPlayer.loseHealth(25);
        System.out.println("Current health: " + enhancedPlayer.getHealth());

    }
}
