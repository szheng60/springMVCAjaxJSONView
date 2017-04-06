package song.mvc.ajax.model;

import com.fasterxml.jackson.annotation.JsonView;
import song.mvc.ajax.view.InfoView;

/**
 * Created by xinyu on 4/5/2017.
 */
public class Address {
    @JsonView(InfoView.DetailView.class)
    private int number;
    @JsonView(InfoView.PublicView.class)
    private String street;
    @JsonView(InfoView.DetailView.class)
    private String city;
    @JsonView(InfoView.DetailView.class)
    private String state;
    @JsonView(InfoView.PublicView.class)
    private int zipCode;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Address() {
    }


    public Address(int number, String street, String city, String state, int zipCode) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
