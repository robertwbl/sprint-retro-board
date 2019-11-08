package com.fivium.sprintretroboard.model;

public class Person {
    private String forename;
    private String surname;
    //String confluenceUserName;


    public Person(String forename, String surname) {
        this.forename = forename;
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
