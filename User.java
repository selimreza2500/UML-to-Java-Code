package ARP;

public class User {

    protected String UserName,LoginID,Passward;
    
    public User(String UserName,String LoginID,String Passward){
    	
        this.UserName=UserName;
        this.LoginID=LoginID;
        this.Passward=Passward;
    }
    public void display(){
        System.out.println("User Name     : "+UserName);
        System.out.println("LoginID       : "+LoginID);
        System.out.println("Passward      : "+Passward);
              
    }
    
}
