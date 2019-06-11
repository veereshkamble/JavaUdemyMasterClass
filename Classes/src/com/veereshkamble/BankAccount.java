package com.veereshkamble;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.balance = this.balance + depositAmount;
    }

    public void withdrawFinds(double withdrawAmount) {
        if(this.balance >= withdrawAmount) {
            this.balance = this.balance - withdrawAmount;
        } else {
            System.out.println("Insufficient Funds");
        }
    }
}
