package com.veereshkamble;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber(12345);
        bankAccount.setBalance(1000);
        bankAccount.setCustomerName("Ronaldo");
        bankAccount.setEmail("cristiano@ronaldo.com");
        bankAccount.setPhoneNumber(7);

        System.out.println("Account Number : " +bankAccount.getAccountNumber());
        System.out.println("Balance : " +bankAccount.getBalance());
        System.out.println("Name : " +bankAccount.getCustomerName());
        System.out.println("Email : " +bankAccount.getEmail());
        System.out.println("Phone Number : " +bankAccount.getPhoneNumber());

        bankAccount.depositFunds(500.00);

        bankAccount.withdrawFinds(500.00);

        bankAccount.withdrawFinds(11000.00);

    }
}
