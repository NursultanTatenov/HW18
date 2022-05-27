package com.company;

public class Dormitory extends Person implements RentPayable{

    private int address;


    public Dormitory(String name, int age) {
        super(name, age);
    }
    public Dormitory(){}

    public static String getAddress(String address) {
        return address;
    }

    @Override
    public String rentPay() {
        return RentPayable.super.rentPay();
    }


    @Override
    public String toString() {
        return  super.toString();
    }

}