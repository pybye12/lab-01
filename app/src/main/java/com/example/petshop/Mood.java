package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date date;

    //Constructor1 default date
    public Mood(){
        this.date = new Date();
    }
    //Constructor 2 we pass it
    public Mood(Date date){
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public abstract String typeofmood();



}
