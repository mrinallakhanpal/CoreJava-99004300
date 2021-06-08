package arraylist;

import java.util.*;

public class count {
	public static void main(String args[]) {
		int c1=0,c2=0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println("enter scores");
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		for(int j=0;j<n;j++) {
			if(list.get(j)>=50 && list.get(j)<100) {
				c1++;		
			}
			if(list.get(j)>=100) {
				c2++;
			}
		}
		System.out.println(c1);
		System.out.println(c2);
	}
}
