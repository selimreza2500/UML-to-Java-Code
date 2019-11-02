package Defualt;

public class problam_2_Food extends Problam_2_Item {
   private String color;
   private double price;
   
public problam_2_Food( int itemid,String color, double price) {
	super(itemid);
	this.color = color;
	this.price = price;
}
   public void display() {
	   super.display();
	   
	   System.out.println("Item's Color : "+color);
	   System.out.println("Item's Price : "+price);

   }
  
}
