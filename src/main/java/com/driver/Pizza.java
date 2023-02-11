package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;

    boolean isaddExtraCheese;
    boolean isaddExtraToppings;
    boolean isBillCreated;
    boolean isTakeaway;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.toppings = isVeg ? 70 : 120;
        this.isaddExtraCheese = false;
        this.isaddExtraToppings = false;
        this.isTakeaway = false;
        this.isBillCreated = false;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isaddExtraCheese){
            this.price += 80;
            this.isaddExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isaddExtraToppings){
            this.price += this.toppings;
            isaddExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            this.price += 20;
            isTakeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated) {
            if (isaddExtraCheese)
                this.bill += "Extra Cheese Added: 80" + "\n";
            if (isaddExtraToppings)
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            if (isTakeaway)
                this.bill += "Paperbag Added: 20" + "\n";
            this.bill += "Total Price: " + this.price;
            this.isBillCreated = true;
        }
        return this.bill;
    }
}
