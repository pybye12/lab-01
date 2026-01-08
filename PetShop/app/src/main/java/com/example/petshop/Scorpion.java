package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet{
    public Scorpion(String name){
        super(name);
    }
    // Constructor 2: Name and Date
    public Scorpion(String name, Date birthDate) {
        super(name, birthDate);
    }
    @Override
    public String speak(){
        return "hiss";
    }

}

}
