import java.util.*;
 class Employee1 
{

	private String name;
	private String address;
	private String mobile;


	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		
		this.name = name;
	}
	public String getAddress() 
	{
		
		return address;
	}
	public void setAddress(String address) 
	{
		System.out.println("Enter Adress:");
		this.address = address;
	}
	public String getMobile() 
	{
		return mobile;
	}
	public void setMobile(String mobile) 
	{
		System.out.println("Enter Mobile:");
		this.mobile = mobile;
	}
	}

public class Employee1Main
{

	public static void main(String[] args) 
	{
		
     Employee1 s = new Employee1();
    Scanner input = new Scanner(System.in);
     System.out.println("Enter the name:");
     String name = input.next();
     System.out.println("Enter Adress:");
     String address = input.next();
     System.out.println("Enter Mobile:");
     String mobile = input.next();
     s.setName(name);
     s.setAddress(address);
     s.setMobile(mobile);
     
     System.out.println("Employee Details");
     System.out.println("Name:"+s.getName());
     System.out.println("Address:"+s.getAddress());
     System.out.println("Mobile:"+s.getMobile());
     
	}

}

