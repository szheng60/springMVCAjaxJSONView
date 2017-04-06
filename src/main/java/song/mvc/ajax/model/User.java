package song.mvc.ajax.model;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import song.mvc.ajax.serializers.LocalDateDeserializer;
import song.mvc.ajax.serializers.LocalDateSerializer;
import song.mvc.ajax.view.InfoView;

import java.time.LocalDate;

/**
 * Created by xinyu on 4/5/2017.
 */
public class User {
    @JsonView(InfoView.PublicView.class)
    private String userName;

    @JsonView(InfoView.DetailView.class)
    private String password;

    @JsonView(InfoView.PublicView.class)
    private String email;

    @JsonView(InfoView.PublicView.class)
    private String phone;

    @JsonView(InfoView.DetailView.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate dob;

    @JsonView(InfoView.DetailView.class)
    private Address address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User() {

    }

    public User(String userName, String password, String email, String phone, LocalDate dob, Address address) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}
