package Problam_4;

public class Problam_4_person {
	
	
   protected String name,phone;
   Problam_4_address address;
   
public Problam_4_person(String name, String phone,Problam_4_address address) {

	
	this.name = name;
	this.phone = phone;
	this.address = address;
}
   
public void display() {

	System.out.println("Name        : "+name);
	System.out.println("Phone       : "+phone);
	address.display();
	
}
   
}
