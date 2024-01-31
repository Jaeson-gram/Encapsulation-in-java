package com.Relearn;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player player = new Player();
/*
        player.name = "Jey";
        //1. It encourages coupling, or interdependency
           // if we change the name of this field to, say, fullName, we have to come back here to change it. This is not a big deal in this small application, but definitely will be in a much bigger one,
           // especially when we have the field called in various places. This is one of the disadvantages of not encapsulating.
        player.health = 60;
        player.weapon = "Mind";

        //2. The calling code has to take on the responsibility for properly initialising a new instance
        //Without encapsulation, and a constructor that sets certain fields, the calling code will have to handle all the field instantiation,
        //and may omit one, say, the health for instance, which might be starting at 0

        int damage= 19;
        player.loseHealth(damage);

        System.out.println("Health remaining: " + player.healthRemaining() + "%");

        player.health = 600;
        //3. Allowing direct access to data on an object can bypass all checks and operations.
          // Even though we have a method that allows us to add health, without proper encapsulation, the calling method can still go rogue, like this <-
        player.loseHealth(42);

        */

        Printer printer = new Printer(50, false);

        System.out.println("initial pages count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current job pages: %d, printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());
        pagesPrinted = printer.printPages(10);
        System.out.printf("Current job pages: %d, printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());
    }
}
