package com.veereshkamble;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*Player player = new Player();

        player.fullName = "Vee";
        player.health = 20;
        player.weapon = "Swaord";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("remaining health = " + player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("Vee", 50, "sword");
        System.out.println("Initial health is " +player.getHealth());
        */

        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total" +
                "print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total" +
                "print count for printer = " + printer.getPagesPrinted());

    }
}
