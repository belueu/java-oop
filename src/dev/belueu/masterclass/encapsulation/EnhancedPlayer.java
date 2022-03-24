package dev.belueu.masterclass.encapsulation;

public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.health = (health > 0 && health <= 100) ? health : 100;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) System.out.println("Player died");
    }

    public int getHealth() {
        return health;
    }
}
