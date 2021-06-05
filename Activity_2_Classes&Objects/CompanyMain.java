import java.util.*;
class Company {

private String name;
private String employees;
private String teamlead;
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getEmployees() 
{
	return employees;
}
public void setEmployees(String employees) 
{
	this.employees = employees;
}
public String getTeamlead()
{
	return teamlead;
}
public void setTeamlead(String teamlead) 
{
	this.teamlead = teamlead;
}



}


public class CompanyMain {

	public static void main(String[] args) {
		

		Company c1 = new Company();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Company name:");
		String name = sc.nextLine();
		System.out.println("Enter the employess:");
		String employees = sc.next();
		System.out.println("Enter TeamLead:");
		String teamlead = sc.next();
		
		
		int flag = 0;
        for(String str: employees.split(",")){
            if(teamlead.equals(str)){
                flag = 1;
            }
        }

        if(flag == 0){
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        c1.setName(name);
		c1.setEmployees(employees);
		c1.setTeamlead(teamlead);
		 
		System.out.println("Name:"+c1.getName());
	     System.out.println("Employees:"+c1.getEmployees());
	     System.out.println("Lead:"+c1.getTeamlead());
		
		
		sc.close();
		
		
	}

}
