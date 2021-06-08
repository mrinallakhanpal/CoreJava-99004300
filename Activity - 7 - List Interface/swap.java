package arraylist;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String>list = new ArrayList<String>();
		System.out.println("Enter no of teams");
		int n= sc.nextInt();
		System.out.println("Enter teams");
		for(int i=0;i<=n;i++) {
			list.add(sc.nextLine());
		}
		System.out.println("Enter swap positions");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		Collections.swap(list,s1,s2);
		for(String j:list) {
			System.out.println(j);
		}
	}
}
