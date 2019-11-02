package Defualt;

public class Problam_2_Rahim extends Problam_2_Customer {
	private String email;

	public Problam_2_Rahim(problam_2_Food f, int custid, String email) {
		super(f, custid);
		this.email = email;
	}
    public void display() {
    	super.display();
    	System.out.println("Email        : "+email);
    }
    public static void main(String[] args) {
    	 problam_2_Food f  = new  problam_2_Food(120,"Purple",1240);
    	 Problam_2_Rahim r = new  Problam_2_Rahim(f,120154,"selimreja2500@gmail.com");
    	 r.display();
    }
}
