package first;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Scanner;

public class ParkingMain {

	static class Parkingg {
		String VehicleNumber;
		String Entrytime;
		String Exittime;

	}

	public static void main(String[] args) throws InterruptedException, ParseException {

		long BillAmount;
		Scanner sc = new Scanner(System.in);
		LocalTime d = LocalTime.now();

		System.out.println("Enter the Vehicle Number :");
		String VechileNumber = sc.nextLine();

		System.out.println("Enter Entry time (hh:mm a): ");
		String Entrytime = sc.next();

		System.out.println("Enter Exit time (hh:mm a): ");
		String Exittime = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		Date d1 = sdf.parse(Entrytime);
		Date d2 = sdf.parse(Exittime);

		long diffMs = d2.getTime() - d1.getTime();

		long diffSec = diffMs / 1000;
		long min = diffSec / 60;
		long hr = min/60;
		long sec = diffSec % 60;

		System.out.println("Enter the Vehicle type :");
		System.out.println("4-wheeler");
		System.out.println("2-wheeler");
		String Usertype = sc.next().toLowerCase();
		if (Usertype.equals("4-wheeler")) {
			BillAmount = hr * 10;
			System.out.println("Your Bill Amount will be : " + BillAmount);
		} else {
			BillAmount = hr * 5;
			System.out.println("Your Bill Amount will be : " + BillAmount);
		}
		sc.close();

	}
}