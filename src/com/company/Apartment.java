package com.company;

public class Apartment extends Person implements UtilityPayable {
    private  String address;

    public Apartment(String name, int age) {
        super(name, age);
    }

    public Apartment() {
        super();
    }

    public static String getAddress(String address) {
        return address;
    }

    @Override
    public String utilityPay() {
        return UtilityPayable.super.utilityPay();
    }

    @Override
    public String toString() {
        return  super.toString();
    }

}
