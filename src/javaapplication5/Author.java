/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

public class Author {

    /**
     * @param args the command line arguments
     */
   private String name;
   private String email;
   private char gender;   
 
   public Author(String name, String email, char gender) {
      this.name = name;
      this.email = email;
      this.gender = gender;
   }
 
   public String getName() {
      return name;
   }
  
   public char getGender() {
      return gender;
   }
   
   public String getEmail() {
      return email;
   }
   
   public void setEmail(String email) {
      this.email = email;
   }
 
   /** Returns a self-descriptive String */
   public String toString() {
      return name + " (" + gender + ") at " + email;
   }
  
    public static void main(String[] args) {
       
        Author ahTeck = new Author("Raneem", "raneem@gmail.com", 'm');
      System.out.println(ahTeck);  // Author's toString()
     
      Book dummyBook = new Book("Java j", ahTeck, 9.99, 99);
      System.out.println(dummyBook);  // Book's toString()
      dummyBook.setPrice(8.88);
      dummyBook.setQty(88);
      System.out.println("name is: " + dummyBook.getName());
      System.out.println("price is: " + dummyBook.getPrice());
      System.out.println("qty is: " + dummyBook.getQty());
      System.out.println("author is: " + dummyBook.getAuthor());  
      System.out.println("author's name is: " + dummyBook.getAuthor().getName());
      System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
      System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
    
   } 
    }

 class Book {
   // The private instance variables
   private String name;
   private Author author;
   private double price;
   private int qty;
 
   public Book(String name, Author author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }
 
   public String getName() {
      return name;
   }
   
   public Author getAuthor() {
      return author;  
   }
   
   public double getPrice() {
      return price;
   }
  
   public void setPrice(double price) {
      this.price = price;
   }
  
   public int getQty() {
      return qty;
   }
      public void setQty(int qty) {
      this.qty = qty;
   }
 
   /** Returns a self-descriptive String */
   public String toString() {
      return "'" + name + "' by " + author;  // author.toString()
   }
}
    

