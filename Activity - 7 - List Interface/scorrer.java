package arraylist;

import java.util.*;

public class scorrer {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String>list = new ArrayList<String>();
		ArrayList <String>list1 = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		for(int i=0;i<5;i++) {
			list.add(sc.nextLine());
		}
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++) {
			list1.add(sc.nextLine());
		}
        list.retainAll(list1); 
        for(String j:list) {
			System.out.println(j);
		}
	}
}
