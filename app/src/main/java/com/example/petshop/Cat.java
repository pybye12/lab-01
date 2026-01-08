package com.example.petshop;
//issue is that the Pet constructor expects a name argument so cat class must help this so give that to parent
//hence use super() helps send the name to parent
// "extends" means Cat gets everything Pet has (name, birthDate, etc.)
public class Cat extends Pet implements Pettable{
    //I must have constructor which calls parent which is super() and pass in name to it
    public Cat(String name){
        super(name); // This passes the name to parent constructor
    }
    @Override //will overwrite the abstract method so sub/child classes can use them accordingly
    public String speak(){
        return "meow";
    }

    @Override
    public void pet() {
        System.out.println(getName() + "purr");
    }


}
