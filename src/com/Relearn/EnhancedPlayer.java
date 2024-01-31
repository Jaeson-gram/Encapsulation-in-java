package com.Relearn;

public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Mind");
    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health < 1)
            this.health = 1;
        else if(health >100)
            this.health = 100;
        else this.health = health; //        else this.health = Math.min(health, 100);
        this.weapon = weapon;
    }


    public void loseHealth(int damage){
        health -= damage;

//        System.out.printf("%d % damage done", damage);
        System.out.println(damage + "% damage done!");

        if (health <= 0){
            System.out.println("player KO'd!");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restorHealth(int extraHealth){
        health += extraHealth;
//        System.out.printf("%d % health gotten", health);
        System.out.println(extraHealth + "% health gained!");

        if (health > 100){
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
