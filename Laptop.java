package ARP;

public class Laptop extends ElectronicGadget {
     private String model,price,powerpack;

	public Laptop(String manufacture,String model, String price, String powerpack) {

		super (manufacture);
		this.model = model;
		this.price = price;
		this.powerpack = powerpack; 
		
	}
	
     public void display() {
    	 super.display();
 		System.out.println("Product Model : "+model);
		System.out.println("Product Price : "+price);
		System.out.println("PowerPack     : "+powerpack);

     }
     public void onService() {
    	 System.out.println("");
    	 
     }
     public void offService() {
    	 
     }
    
}
