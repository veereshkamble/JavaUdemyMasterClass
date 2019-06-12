package com.veereshkamble;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(12345, 1000, "Ronaldo",
                "cristiano@ronaldo.com", 777777777);


        System.out.println("Account Number : " +bankAccount.getAccountNumber());
        System.out.println("Balance : " +bankAccount.getBalance());
        System.out.println("Name : " +bankAccount.getCustomerName());
        System.out.println("Email : " +bankAccount.getEmail());
        System.out.println("Phone Number : " +bankAccount.getPhoneNumber());

        bankAccount.depositFunds(500.00);

        bankAccount.withdrawFinds(500.00);

        bankAccount.withdrawFinds(11000.00);

        BankAccount bankAccount1 = new BankAccount("Messi", "messi@barcelona.com", 101010);
        

    }
}
