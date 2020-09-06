
package javaapplication5;
public class Circle {
   // private instance variables
   private double radius;
   private String color;

   // Constructors
   public Circle() {
      this.radius = 1.0;
      this.color = "red";
      System.out.println("Construced a Circle with Circle()");  // for debugging
   }
   public Circle(double radius) {
      this.radius = radius;
      this.color = "red";
      System.out.println("Construced a Circle with Circle(radius)");  // for debugging
   }
   public Circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
      System.out.println("Construced a Circle with Circle(radius, color)");  // for debugging
   }

   // public getters and setters for the private variables
   public double getRadius() {
      return this.radius;
   }
   public String getColor() {
      return this.color;
   }
   public void setRadius(double radius) {
      this.radius = radius;
   }
   public void setColor(String color) {
      this.color = color;
   }

   /** Returns a self-descriptive String */
   public String toString() {
      return "Circle[radius=" + radius + ",color=" + color + "]";
   }

   /** Returns the area of this Circle */
   public double getArea() {
      return radius * radius * Math.PI;
   }

      public static void main(String[] args) {
        
     Cylinder cy1 = new Cylinder();
      //Construced a Circle with Circle()
      //Constructed a Cylinder with Cylinder()
      System.out.println("Radius is " + cy1.getRadius()
         + ", Height is " + cy1.getHeight()
         + ", Color is " + cy1.getColor()
         + ", Base area is " + cy1.getArea()
         + ", Volume is " + cy1.getVolume());
      
      Cylinder cy2 = new Cylinder(5.0, 2.0);
      //Construced a Circle with Circle(radius)
      //Constructed a Cylinder with Cylinder(height, radius)
      System.out.println("Radius is " + cy2.getRadius()
         + ", Height is " + cy2.getHeight()
         + ", Color is " + cy2.getColor()
         + ", Base area is " + cy2.getArea()
         + ", Volume is " + cy2.getVolume());
     
      }

}
  class Cylinder extends Circle {
   // private instance variable
   private double height;

   // Constructors
   public Cylinder() {
      super();  // invoke superclass' constructor Circle()
      this.height = 1.0;
      System.out.println("Constructed a Cylinder with Cylinder()");  // for debugging
   }
   public Cylinder(double height) {
      super();  // invoke superclass' constructor Circle()
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height)");  // for debugging
   }
   public Cylinder(double height, double radius) {
      super(radius);  // invoke superclass' constructor Circle(radius)
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height, radius)");  // for debugging
   }
   public Cylinder(double height, double radius, String color) {
      super(radius, color);  // invoke superclass' constructor Circle(radius, color)
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");  // for debugging
   }

   // Getter and Setter
   public double getHeight() {
      return this.height;
   }
   public void setHeight(double height) {
      this.height = height;
   }

   /** Returns the volume of this Cylinder */
   public double getVolume() {
      return getArea()*height;   // Use Circle's getArea()
   }

   /** Returns a self-descriptive String */
   public String toString() {
      return "This is a Cylinder";  // to be refined later
   }
}
   


  

    

