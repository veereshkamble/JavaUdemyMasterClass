package com.veereshkamble;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer() {
        this("default", 0.0, "default");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 0.0, emailAddress);
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = 0.0;

    }
}
