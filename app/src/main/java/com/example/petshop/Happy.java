package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {
    public Happy(Date date) {
        super(date);
    }

    public Happy() {
        super();
    }

    @Override
    public String typeofmood() {
        return "Mood is Happy";
    }
}

