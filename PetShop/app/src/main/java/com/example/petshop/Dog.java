package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable{
    public Dog(String name){
        super(name);
    }
    // Constructor 2: Name and Date
    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }
    @Override
    public String speak(){
        return "bark";
    }

    @Override
    public void pet() {
        System.out.println(getName() + "bark");
    }



}
