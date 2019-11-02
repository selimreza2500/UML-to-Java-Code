package Defualt;

public class Problam_2_Customer {
	problam_2_Food f;
	
	protected int custid;
	
	public Problam_2_Customer(problam_2_Food f,int custid) {
		this.f = f;
		this.custid = custid;
	
	}
	
	public void display() {
		f.display();
		System.out.println("Customer ID  : "+custid);
		
	}

}
