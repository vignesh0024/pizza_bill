package com.pizza;

public class Main {
    public static void main(String[] args) {



        pizza p =  new pizza(false);
        p.addcheese();
        p.addtoppings();
        p.paperbag();
        System.out.println(p.getbill());


    }
}