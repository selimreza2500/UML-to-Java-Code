package Problam_4;

public class Problam_4_Main {
	public static void main(String[] args) {
		
		Problam_4_address address = new Problam_4_address("Dhaka","Bangladesh");
		
		Problam_4_Teacher teacher = new Problam_4_Teacher("Syhed Akter Hossain","01727557289" ,address,"Head Of the dept.");
		teacher.display();
		
		Problam_4_Student student = new Problam_4_Student("SelimReza","01942953729",address,"183-15-12020",3.77);
		student.display();
		
		
		
	}

}
