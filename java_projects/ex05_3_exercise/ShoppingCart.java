package ex05_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        int i = 0;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";

        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);

       for (String name : items) {
        System.out.println("Item Name is " + name);
       }

       for (String name : items) {        
        System.out.println(i + " Item Name is " + name);
        i++;
       }

    }    
}