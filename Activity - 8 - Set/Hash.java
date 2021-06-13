package first;

import java.util.HashSet;
import java.util.Scanner;
	

public class Hash {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet();
		int size = Integer.parseInt(sc.nextLine());
															
		for(int i=0;i<size;i++)
		{
			
			hs.add(sc.nextLine());
		}
		
		System.out.println(hs.size());
		

	}

}
