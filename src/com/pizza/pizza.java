package com.pizza;

public class pizza {

    int price = 0;
    boolean isveg = false;
    String bill = "";
    boolean cheeseadded = false;

    boolean addtoppings = false;

    boolean paperbag =false;

    boolean billgenerated =false;

    public pizza (boolean isveg)
    {
        this.isveg = isveg;
        if (isveg == true)
        {
            price += 300;
            bill += "The Pizza bill is : 300\n";
        }else {
            price += 400;
            bill += "The Pizza bill is : 400\n";
        }
    }

    public void addcheese(){
        if (cheeseadded == false){
            cheeseadded =true;
            price += 80;
            //bill += "The Pizza bill after extra cheese is  : " + price + "/n";
        }
    }

    public void addtoppings() {
        if(addtoppings == false)
        {
            addtoppings=true;
            if(isveg == true)
            {
                price += 70;
                //bill += "The Pizza bill after extra cheese and added toppings is  : " + price + "/n";
            } else {
                price += 120;
                //bill += "The Pizza bill after extra cheese and added toppings is  : " + price + "/n";
            }
        }
    }

    public void paperbag(){
        if (paperbag == false){
            paperbag =true;
            price += 20;
            //bill += "The Pizza bill after extra cheese and added toppings and paperbag is  : " + price + "/n";
        }
    }

    public String getbill(){
        if(billgenerated ==  false){

            if(cheeseadded)
            {
                bill += "Bill for extra cheese is  : 80\n";
            }
            if(addtoppings){
                if(isveg == true)
                {
                    bill += "bill for added toppings is  : 70\n";
                } else {
                    bill += "bill for added toppings is  : 120\n";
                }
            }
            if(paperbag)
            {
                bill += "bill for paperbag is :20\n";
            }
            bill = bill + "Total Price: " + price + "\n";
            billgenerated =true;
        }
        return bill;
    }
}
