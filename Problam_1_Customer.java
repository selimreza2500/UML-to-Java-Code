package Defualt_Pakege;

public class Problam_1_Customer extends Problam_1_Human {
	public int id;
	public String name;
	Problam_1_Item item;
	
	public Problam_1_Customer(String ScientificName,int id, String name,Problam_1_Item item) {
		
		super(ScientificName);
		this.id = id;
		this.name = name;
		this.item=item;
	}
	public void display() {
		 
		super.display();
		System.out.println("ID              : "+id);
		System.out.println("Name            : "+name);
		item.display();
		
		
	}
    public static void main(String[] args) {
    	
    	 Problam_1_Item item1 = new Problam_1_Item(452352564,"Processor");
    	 Problam_1_Customer cust = new Problam_1_Customer ("Intel Core i5 8265U",12124,"SelimReza",item1);
         cust.display();
	   
}
	
}