package ARP;

public class BuyLaptop {
	public String date;
	public int qty;
	
	Customer cust;
	Laptop lap;
	
	public BuyLaptop(Customer cust,Laptop lap,String date, int qty) {
		
		this.cust=cust;
		this.lap=lap; 
		this.date = date;
		this.qty = qty;
		
	}
	public void display() {
		//cust.display();
		lap.display();
		System.out.println("Buying Date   : "+date);
		System.out.println("Quintity      : "+qty);

	}

}
