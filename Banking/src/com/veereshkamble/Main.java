package com.veereshkamble;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("State Bank of India");

        if(bank.addBranch("Belgaum")) {
            System.out.println("Belgaum bank craeted");
        }

        bank.addCustomer("Belgaum", "Ronaldo", 777.7);
        bank.addCustomer("Belgaum", "Messi", 1010.10);
        bank.addCustomer("Belgaum", "Neymar", 1111.11);

        bank.addBranch("Pune");
        bank.addCustomer("Pune", "Hazard", 1717.17);

        bank.addCustomerTransaction("Belgaum", "Ronaldo", 7777.77);
        bank.addCustomerTransaction("Belgaum", "Ronaldo", 7777.77);
        bank.addCustomerTransaction("Belgaum", "Messi", 1010.10);

        bank.listCustomers("Belgaum", true);
        bank.listCustomers("Pune", true);

        bank.addBranch("Shettihalli");

        if(!bank.addCustomer("Shettihalli", "Bale", 1111.11)) {
            System.out.println("Error: Shettihalli branch does not exist");
        }

        if(!bank.addBranch("Belgaum")) {
            System.out.println("Error: Belgaum branch already exists");
        }

        if(!bank.addCustomerTransaction("Belgaum", "Griezmann", 171.4)) {
            System.out.println("Error: Customer does not exist ");
        }

    }
}
