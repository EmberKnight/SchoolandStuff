package JavaIntermediate;

import java.util.ArrayList;

public class Address {

    private String name;
    private String street;
    private String city;

    public Address() {

    }

    public Address(String name, String street, String city) {
        super();
        setName(name);
        setStreet(street);
        setCity(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
