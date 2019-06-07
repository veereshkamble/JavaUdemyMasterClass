package com.veereshkamble;

public class Person {

    private  String firstName;
    private  String lastName;
    private  int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen(int age) {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if(firstName.isEmpty()) {
            return this.lastName;
        } else if(lastName.isEmpty()) {
            return this.firstName;
        } else {
            return this.firstName + " " +this.lastName;
        }
    }
}
