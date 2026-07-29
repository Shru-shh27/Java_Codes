 //Write a Java program to create a Product class with attributes id, name, and
// price. The program should:
// Demonstrate the use of constructors and methods to display product details

/**
 * constructor
 */
// import java.util.*;

// class constructor {
//     int id =45;
//     String name="shoes";
//     int price=700;
//     static int  getmethod(int id , String name, int price){
//         System.out.println("id" + id + "name" + "price" + price);
//     }

//     constructor(){
//         this.id=id;
//         this.name=name;
//         this.price=price;

//     }
// 

//     public static void main(){
//         constructor c = new constructor();
//         System.out.println(c.id);
//     } }

class Product {
    int id;
    String name;
    double price;

    
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price; //parameterized
    }

   
    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }

    public static void main(String[] args) {
    
        Product p = new Product(45, "Shoes", 700);

        
        p.display();
    }
}
// public class Main {
    
    
//     static class Product{
//     // attributes
//     int id;
//     String name;
//     double price;
    
//     // Parameterized Constructor
//     Product(int id, String name, double price){
//         this.id = id;
//         this.name = name;
//         this.price = price;
//     }
    
//     void displayDetails(){
//         System.out.println("Product ID : " + id); 
//         System.out.println("Product Name : " + name); 
//         System.out.println("Product Price : ₹ " + price); 
        
//     }
    
    
// }
//     public static void main(String[] args) {
//         Product p1 = new Product(101,"Mouse", 12500.60);
//         Product p2 = new Product(101,"Rayben meta  glasses", 57255.69);
        
//         System.out.println("Product 1 Details:");
//         p1.displayDetails();
        
//         System.out.println("Product 2 Details:");
//         p2.displayDetails();
//     }
// }