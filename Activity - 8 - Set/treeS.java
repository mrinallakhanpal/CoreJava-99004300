package first;

import java.util.Scanner;
import java.util.TreeSet;

public class treeS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<String>();
		int size = Integer.parseInt(sc.nextLine());
		for(int i=0;i<size;i++)
		{
			ts.add(sc.nextLine());
		}
		for(String i:ts)
		{
			System.out.println(i);
		}
		

	

	}

}
