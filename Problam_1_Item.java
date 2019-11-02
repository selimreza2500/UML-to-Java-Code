package Defualt_Pakege;

public class Problam_1_Item {
	public int itemId;
	public String ItemName;
	
	public Problam_1_Item(int itemId, String ItemName) {
	
		this.itemId = itemId;
		this.ItemName = ItemName;
	}
	public void display() {
		System.out.println("Item ID         : "+itemId);
		System.out.println("Item Name       : "+ItemName);
	}

}
