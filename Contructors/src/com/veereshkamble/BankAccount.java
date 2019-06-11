package com.veereshkamble;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(0, 0, "default", "default", 0);
        System.out.println("Empty Constructor called");
    }

    public BankAccount(long accountNumber, double balance, String customerName,
                       String email, int phoneNumber) {
        System.out.println("Construcor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

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
        System.out.println("Deposit of " +depositAmount + " made. Running balance : " + this.balance);
    }

    public void withdrawFinds(double withdrawAmount) {
        if(this.balance > withdrawAmount) {
            this.balance = this.balance - withdrawAmount;
            System.out.println("Withdrawal of " +withdrawAmount + " made. Running balance : " + this.balance);
        } else {
            System.out.println("Insufficient Funds. You can only withdraw " + this.balance);
        }
    }
}
