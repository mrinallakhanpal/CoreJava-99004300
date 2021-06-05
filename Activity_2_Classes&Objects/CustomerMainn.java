import java.util.*;
 class Customer 
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
		this.address = address;
	}
public String getMobile() 
	{
		return mobile;
	}
public void setMobile(String mobile) 
	{
	this.mobile = mobile;
	}
}

public class CustomerMainn 
{

	public static void main(String[] args) 
{
		

		
		Customer t = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details:");
		String string = sc.next();
//using string split
		String delimiter = "[,]";
		String temp[];
		temp = string.split(delimiter); 
		
		t.setName(temp[0]);   
		t.setAddress(temp[1]);
		t.setMobile(temp[2]);
		System.out.println("Name:"+t.getName());
	     System.out.println("Address:"+t.getAddress());
	     System.out.println("Mobile:"+t.getMobile());
		
		}

}