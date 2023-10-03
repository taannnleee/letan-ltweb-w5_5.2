package letan.model;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String hearAboutUs;
    private String receiveAnnouncements;
    private String contact;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        hearAboutUs="";
        receiveAnnouncements = "";
    }

    public User(String firstName, String lastName, String email,String hearAboutUs,String receiveAnnouncements,String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hearAboutUs=hearAboutUs;
        this.receiveAnnouncements = receiveAnnouncements;
        this.contact = contact;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHearAboutUs() {
        return hearAboutUs;
    }

    public void setHearAboutUs(String hearAboutUs) {
        this.hearAboutUs = hearAboutUs;
    }

    public String getReceiveAnnouncements() {
        return receiveAnnouncements;
    }

    public void settReceiveAnnouncements(String receiveAnnouncements) {
        this.receiveAnnouncements = receiveAnnouncements;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
