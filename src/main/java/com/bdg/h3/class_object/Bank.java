package com.bdg.h3.class_object;

//Սահմանել Bank class :
//fields (bankName,   address (type Address))
public class Bank {

    private String bankName;

    private Address address;

    public Bank(String bankName, Address address) {
        this.bankName = bankName;
        this.address = address;
    }

    public String getBankName() {
        return bankName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", address=" + address +
                '}';
    }
}
