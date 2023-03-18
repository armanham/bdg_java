package com.bdg.h8.inheritance.association.address_user;

import java.util.List;

public class Address {

    private String country;

    private String region;

    private String city;

    private String zipCode;

    private List<User> users;    // One address many users

    public Address(String country, String region, String city, String zipCode, List<User> users) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.zipCode = zipCode;
        this.users = users;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", users=" + users +
                "}\n";
    }
}
