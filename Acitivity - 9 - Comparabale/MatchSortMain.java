package comparable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Date;

class Match1 implements Comparable<Match1> {
	private Date matchDate;
	private String teamOne;
	private String teamTwo;
	public Match1(Date matchDate, String teamOne, String teamTwo) {
		super();
		this.matchDate = matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	
	public int compareTo(Match1 o) {
		// TODO Auto-generated method stub
		return matchDate.compareTo(o.getMatchDate());
		
	}
	@Override
	public String toString() {
		return "matchDate=" + matchDate + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo;
	}
	
	
	
}
public class MatchSortMain {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Match1> ai = new  ArrayList<Match1>();
		System.out.println("Enter the number of matches");
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		for(int i = 0; i<n;i++) {
			System.out.println("Enter match date in (dd/mm/yyyy)");
			String date1 = br.readLine();
			Date d1=new SimpleDateFormat("dd/MM/yyyy").parse(date1);
			System.out.println("Enter Team 1");
			String team1 = br.readLine();
			System.out.println("Enter Team 2");
			String team2 = br.readLine();
			
			ai.add(new Match1(d1,team1,team2));
		}
		Collections.sort(ai);
		
		System.out.println("Match Details");
		for(Match1 k:ai)
		{
			System.out.println("Team "+count+" "+k.getTeamOne());
			count++;
			System.out.println("Team "+count+" "+k.getTeamTwo());
			System.out.println("Match held date on "+k.getMatchDate());
			count = 1;
		}
	}

}
