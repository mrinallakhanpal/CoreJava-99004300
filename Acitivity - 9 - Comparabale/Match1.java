package comparable;
import java.util.Date;

public class Match1	 implements Comparable<Match1> {
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