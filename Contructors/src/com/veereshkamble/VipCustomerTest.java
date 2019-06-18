package com.veereshkamble;

public class VipCustomerTest {

    public static void main(String[] args) {

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("bob", "bob@gmail.com");
        System.out.println(vipCustomer2.getName());

        VipCustomer vipCustomer3 = new VipCustomer("Time", 50000, "tim@gmail.com");
        System.out.println(vipCustomer3.getName());
    }
}
