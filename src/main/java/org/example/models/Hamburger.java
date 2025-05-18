package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
    this.addition1Name = name;
    this.addition1Price = price;
   }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public double itemizeHamburger(){
        double totalPrice = this.price;
        System.out.println("Hamburger: "+ name + " " + "Hamburber eti: " + meat + " " + "Ekmek tipi: " + breadRollType);

        if (this.addition1Name != null) {
            System.out.println("Eklendi: " + this.addition1Name + " ek malzeme ücreti " + this.addition1Price);
            totalPrice += this.addition1Price;
        }

        if (this.addition2Name != null) {
            System.out.println("Eklendi: " + this.addition2Name + " ek malzeme ücreti " + this.addition2Price);
            totalPrice += this.addition2Price;
        }

        if (this.addition3Name != null) {
            System.out.println("Eklendi: " + this.addition3Name + " ek malzeme ücreti " + this.addition3Price);
            totalPrice += this.addition3Price;
        }

        return totalPrice;
    }


}
