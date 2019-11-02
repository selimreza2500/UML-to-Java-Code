package ARP;

public class Main {
	public static void main(String []args) {
		
		Customer cust = new Customer("Selim Reza","12020","123456","selimreja2500@gmail.com","01942953729");
		cust.display();
		Laptop lap=new Laptop("ASUS","ASUS VivoBook","170000.00","Original19V 1.75A 33W Genuine AC laptop adapter Charger for ASUS Vivobook ");
	    BuyLaptop bl= new BuyLaptop(cust,lap,"02-11-2019",2);
	    bl.display();
		
	}

}
