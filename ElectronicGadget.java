package ARP;

public class ElectronicGadget {
    protected String manufacture;

	public ElectronicGadget(String manufacture) {

		this.manufacture = manufacture;
	}
    public void display() {
		System.out.println("Manufacture By: "+manufacture);

    }
}
