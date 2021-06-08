package arraylist;

import java.util.*;

public class demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String>list = new ArrayList<String>();
		System.out.println("Enter the player Details");
		System.out.println("Enater player name");
		String name = sc.nextLine();
		list.add(name);
		System.out.println("Enter age");
		String age = sc.nextLine();
		list.add(age);
		System.out.println("Enter Country");
		String coun = sc.nextLine();
		list.add(coun);
		System.out.println("Enater player name");
		for(String i:list) {
			System.out.println(i);
		}
		System.out.println("Enter Skill");
		String ski = sc.nextLine();
		System.out.println("Enter the position to add the skill");
		int pos = sc.nextInt();
		list.set(pos,ski);
		System.out.println("Enater player name");
		for(String i:list) {
			System.out.println(i);
		}
		System.out.println("Enter the position of the detail to be removed ");
		int rem = sc.nextInt();
		list.remove(rem);
		System.out.println("Enater player name");
		for(String i:list) {
			System.out.println(i);
		}
	}
}
