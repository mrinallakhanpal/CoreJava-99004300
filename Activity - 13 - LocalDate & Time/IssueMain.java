package first;

import java.time.LocalDate;
import java.util.Scanner;

class Issue {
	String BookName;
	String Usertype;
}

public class IssueMain {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		LocalDate ld = LocalDate.now();
		System.out.println("Enter the Book Name :");
		String BookName = sc.nextLine();
		System.out.println("Enter the User type :");
		System.out.println("Student");
		System.out.println("Faculty");
		String Usertype = sc.next().toUpperCase();
		LocalDate d = LocalDate.now();
		if (Usertype.equals("STUDENT")) {
			d = d.plusDays(15);
			System.out.println("Your return date will be : " + d);
		} else {
			d = d.plusDays(90);
			System.out.println("Your return date will be : " + d);
		}
		sc.close();
	}

}