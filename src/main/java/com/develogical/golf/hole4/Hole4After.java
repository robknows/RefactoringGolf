package com.develogical.golf.hole4;

public class Hole4After {
    public void printReceipt() {
        printName("Mr J Smith");
        printAddress("34", "High Street", "Oxford", "OX1 1TT");
        printItem("1 Book", "5.99");
        printItem("1 CD", "9.99");
        printTotal("15.98");
    }

    private void printName(String name) {
        System.out.println(name);
    }

    private void printAddress(String houseNameOrNumber, String streetName, String townOrCity, String postcode) {
        System.out.println(houseNameOrNumber + " " + streetName);
        System.out.println(townOrCity);
        System.out.println(postcode);
    }

    private void printItem(String item, String price) {
        System.out.println(item + ", " + price);
    }

    private void printTotal(String amount) {
        System.out.println("Total: " + amount);
    }

}
