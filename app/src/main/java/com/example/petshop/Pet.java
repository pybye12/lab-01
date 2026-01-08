package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    //In Java the attributes must be private
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    private Date birthDate;
//below is constructor which invokes each time object created this is like self.attribute = attribute
    // this is default date so no argument as date
    public Pet(String name) {
        this.name = name; // no need to mention type once prev initialised
        this.birthDate = new Date();
    }

    // 2nd Constructor with provide a date so we don't create date object and assign tht to birthdate
    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        }
    public abstract String speak();




    }

