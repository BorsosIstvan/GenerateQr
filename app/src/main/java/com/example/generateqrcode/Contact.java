package com.example.generateqrcode;

public class Contact {
    private int Id;
    private String Country;
    private String Email;
    private String Name;

    public Contact() {
    }

    public Contact(int id, String country, String email, String name) {
        Id = id;
        Country = country;
        Email = email;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
