package ARP;

public class Customer extends User {
	private String email,cellNO;

	public Customer(String UserName,String LoginID,String Passward,String email, String cellNO) {
		
	    super(UserName,LoginID,Passward);
		this.email = email;
		this.cellNO = cellNO;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Email Account : "+email);
		System.out.println("Cell Number   : "+cellNO);
		

	}
}
