import java.util.HashMap;
import java.util.Scanner;

class Bowler {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Bowler(String name) {
		setName(name);
	}
}

class Wicket {
	String playerName;
	Bowler bowler;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Bowler getBowler() {
		return bowler;
	}

	public void setBowler(Bowler bowler) {
		this.bowler = bowler;
	}

	Wicket(String description, Bowler ob) {
		setPlayerName(description);
		setBowler(ob);
	}

}

public class Ques1 {

	public static void main(String[] args) {
		HashMap<String, Wicket> h = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		String bowler = sc.nextLine();
		Bowler b = new Bowler(bowler);
		System.out.println("Enter wickets - seperated by \"|\" symbol.");
		String inp = sc.nextLine();
		Wicket w = new Wicket(inp, b);
		h.put(bowler, w);
		System.out.println("Do you want to add another player (yes/no)");
		String bool = sc.nextLine().toUpperCase();
		if (bool.equals("YES")) {
			while (bool.equals("YES")) {
				System.out.println("Enter the player name");
				bowler = sc.nextLine();
				b = new Bowler(bowler);
				System.out.println("Enter wickets - seperated by \"|\" symbol.");
				inp = sc.nextLine();
				w = new Wicket(inp, b);
				h.put(bowler, w);
				System.out.println("Do you want to add another player (yes/no)");
				bool = sc.nextLine().toUpperCase();
			}
		}

		System.out.println("Enter the player name to search");
		String search = sc.nextLine();
		if (h.containsKey(search)) {
			System.out.println("Player name : " + search);
			String data[]=  h.get(search).getPlayerName().split("\\|");
			System.out.println("Wicket : ");
			for(int i=0;i<data.length;i++) {
				System.out.println(data[i]);
			}
		}
		System.out.println("Do you want to search another player (yes/no)");
		inp = sc.nextLine().toUpperCase();
		if (inp.equals("YES")) {
			while (inp.equals("YES")) {
				System.out.println("Enter the player name to search");
				search = sc.nextLine();
				if (h.containsKey(search)) {
					System.out.println("Player name : " + search);
					String data[]=  h.get(search).getPlayerName().split("\\|");
					System.out.println("Wicket : ");
					for(int i=0;i<data.length;i++) {
						System.out.println(data[i]);
					}
				} else {
					System.out.println("No player found with the name " + search);
				}
				System.out.println("Do you want to search another  player (yes/no)");
				inp = sc.nextLine().toUpperCase();
			}
		}

	}

}