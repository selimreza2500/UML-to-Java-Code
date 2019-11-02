package Problam_4;

public class Problam_4_Student extends Problam_4_person {
	
	private String studID;
	private double cgpa;
	
	
	public Problam_4_Student(String name, String phone,Problam_4_address address,String studID, double cgpa) {
		super(name, phone,address);
		this.studID = studID;
		this.cgpa = cgpa;
	}


	public void display() {
		super.display();
		System.out.println("Student ID  : "+studID);
		System.out.println("Student CGPA: "+cgpa);

	}
}
