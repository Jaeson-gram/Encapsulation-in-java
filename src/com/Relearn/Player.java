package com.Relearn;

public class Player {
    public String name;
    public int health;
    public String weapon;

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
