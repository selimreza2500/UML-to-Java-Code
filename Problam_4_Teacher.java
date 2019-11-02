package Problam_4;

public class Problam_4_Teacher extends Problam_4_person{
	private String designation;

	public Problam_4_Teacher(String name, String phone,Problam_4_address address, String designation) {
		
		super(name, phone,address);
		this.designation = designation;
	}
	public void display() {
		super.display();
		System.out.println("Designation : "+designation);
	}

}
