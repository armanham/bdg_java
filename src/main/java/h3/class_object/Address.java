package h3.class_object;

//Սահմանել Address class :
//fields (country , region, city , street, house )
public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;

    public Address(String country,
                   String region,
                   String city,
                   String street,
                   String house) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public Address(String country,
                   String city,
                   String street,
                   String house) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
