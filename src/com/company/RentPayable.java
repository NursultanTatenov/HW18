package com.company;

public interface RentPayable {
    default String rentPay(){
        return "Family pay to rent";
    }

}
