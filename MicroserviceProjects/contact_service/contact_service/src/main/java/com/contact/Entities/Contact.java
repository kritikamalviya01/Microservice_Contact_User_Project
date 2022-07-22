package com.contact.Entities;

public class Contact {
    private long id;
    private String email;
    private String contactNumber;
    private long Userid;


    public Contact() {
    }

    public Contact(long id, String email, String contactNumber, long userid) {
        this.id = id;
        this.email = email;
        this.contactNumber = contactNumber;
        Userid = userid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public long getUserid() {
        return Userid;
    }

    public void setUserid(long userid) {
        Userid = userid;
    }
}
