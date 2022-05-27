package com.company;

public class Hotel extends Person implements RentPayable{

    private String address;


    public Hotel (String name, int age) {
        super(name, age);
    }
    public Hotel (){}

    public static String getAddress(String address) {
        return address;
    }

    @Override
    public String rentPay() {
        return RentPayable.super.rentPay();
    }
}
