import java.util.HashMap;
import java.util.Scanner;

class Player {
	String bowlername;
	int wicketCount;

	public String getBowlername() {
		return bowlername;
	}

	public void setBowlername(String bowlername) {
		this.bowlername = bowlername;
	}

	public int getWicketCount() {
		return wicketCount;
	}

	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	}

	Player(String name, int complaintCount) {
		setBowlername(name);
		setWicketCount(complaintCount);
	}
}

public class Ques2 {

	public static void main(String[] args) {
		HashMap<String, Player> h = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		String bowler = sc.nextLine();
		System.out.println("Enter wickets - seperated by \"|\" symbol.");
		String inp = sc.nextLine();
		String arr[] = inp.split("\\|");
		Player p = new Player(bowler, arr.length);
		h.put(bowler, p);
		System.out.println("Do you want to add another player (yes/no)");
		String bool = sc.nextLine().toUpperCase();
		if (bool.equals("YES")) {
			while (bool.equals("YES")) {
				System.out.println("Enter the player name");
				bowler = sc.nextLine();
				System.out.println("Enter wickets - seperated by \"|\" symbol.");
				inp = sc.nextLine();
				String arr1[] = inp.split("\\|");
				p = new Player(bowler, arr1.length);
				h.put(bowler, p);
				System.out.println("Do you want to add another player (yes/no)");
				bool = sc.nextLine().toUpperCase();
			}
		}
		for(String i : h.keySet()) {
			System.out.println(i+" value : "+h.get(i).getWicketCount());
		}
	
		System.out.println("Enter the player name to search");
		String search = sc.nextLine();
		if (h.containsKey(search)) {
			System.out.println("Player name : " + h.get(search).getBowlername());
			System.out.println("Wicket : " + h.get(search).getWicketCount());
		}
		System.out.println("Do you want to search another player (yes/no)");
		inp = sc.nextLine().toUpperCase();
		if (inp.equals("YES")) {
			while (inp.equals("YES")) {
				System.out.println("Enter the player name to search");
				search = sc.nextLine();
				if (h.containsKey(search)) {
					System.out.println("Player name : " + h.get(search).getBowlername());
					System.out.println("Wicket : " + h.get(search).getWicketCount());
				}
				else {
					System.out.println("No player found with the name "+search);
				}
				System.out.println("Do you want to search another  player (yes/no)");
				inp = sc.nextLine().toUpperCase();
			}
		}

	}
}