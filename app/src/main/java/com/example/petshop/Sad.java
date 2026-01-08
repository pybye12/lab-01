package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{
    public Sad(Date date){
        super(date);
    }
    public Sad(){
        super();
    }
    @Override
    public String typeofmood(){
        return "Mood is Sad";
    }

}
