import java.util.Scanner;

class Innings {
	private String teamname;
	private String inningsname;
	private int runs;

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getInningsname() {
		return inningsname;
	}

	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public void displayInningsDetails() {
		System.out.println("Employee Details");
		System.out.println("Name: " + getTeamname());
		System.out.println("Scored: " + getRuns());
		if (getInningsname().equals("First")) {
			System.out.println("Need " + (getRuns() + 1) + " to win");
		} else {
			System.out.println("Match Ended.");
		}
	}
}

public class InningsMain {

	public static void main(String[] args) {
		 Innings s = new Innings();
		    Scanner input = new Scanner(System.in);
		     System.out.println("Enter the team name:");
		     String teamname = input.next();
		     System.out.println("Enter session:");
		     String inningsname = input.next();
		     System.out.println("Enter runs:");
		     int runs = input.nextInt();
		     s.setTeamname(teamname);
		     s.setInningsname(inningsname);
		     s.setRuns(runs);
		     s.displayInningsDetails();
		     input.close();

	}

}