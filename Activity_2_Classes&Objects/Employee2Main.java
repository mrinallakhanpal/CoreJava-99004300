import java.util.*;
 class Employee2 {

private String name;
private String address;
private String mobile;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
	
}

public class Employee2Main {

	public static void main(String[] args) {
		
       
		Employee2 x = new Employee2();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = input.next();
		System.out.println("Enter Address:");
		String address = input.next();
		System.out.println("Enter Mobile:");
		String mobile = input.next();
		x.setName(name);
		x.setAddress(address);
		x.setMobile(mobile);
		System.out.println("Employee Details:");
		System.out.println("Name:"+x.getName());
	     System.out.println("Address:"+x.getAddress());
	     System.out.println("Mobile:"+x.getMobile());
	     System.out.println("Verify and Update Details:");
	     System.out.println("Menu");
	     while(true)
	     {
	     
	     System.out.println(" 1.Update Employee name\n 2.Update Employee Adress\n 3.Update Employee mobile\n 4. All information correct/Exit\n");
	     int choice = input.nextInt();
	     
	    	 
	     switch (choice) {
	     case 1:
	       System.out.println("Current Employee name is: "+x.getName());
	       System.out.println("Enter the name");
	       String name1 = input.next();
	       x.setName(name1);
	       break;
	     case 2:
	    	 System.out.println("Current address is: "+x.getAddress());
	    	 System.out.println("Enter the address");
		       String address1 = input.next();
		       x.setAddress(address1);
	    	 break;
	     case 3:
	    	 System.out.println("Current mobile no. : "+x.getMobile());
	    	 System.out.println("Enter the mobile no.:");
		       String mobile1 = input.next();
		       x.setMobile(mobile1);
		       break;
	     case 4:
	    	 System.out.println("The details are:");
	    	  System.out.println("Name:"+x.getName());
	    	     System.out.println("Address:"+x.getAddress());
	    	     System.out.println("Mobile:"+x.getMobile());
	         	System.exit(0);
	     default:
	       System.out.println("Invalid input");
	       
	     }
	     
}
}
}
