import java.util.Scanner;

public class CompareLastname 
		{

    public static void main(String[] args) 
		{
		

		ConvertLastname c1 = new ConvertLastname();
		Scanner input = new Scanner(System.in);
		String firstname = input.nextLine();
		String lastname = input.nextLine();
		String delimiter = " ";
		String temp[];
		temp = firstname.split(delimiter); 
		String temp2[];
		temp2 = lastname.split(delimiter); 
		
		if(temp[1].equals(temp2[1]))
		{
			System.out.println("YES");
		}
		else
	        {
			System.out.println("NO");
		}

		}

		}
