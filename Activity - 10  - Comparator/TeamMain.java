package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class TeamComparator implements Comparator<Team> {

	@Override
	public int compare(Team o1, Team o2) {
		if(o1.numberOfMatches==(o2.numberOfMatches) )  
			return 0;  
			
			else if(o1.numberOfMatches>(o2.numberOfMatches) )  
			return 1;  
			
			else  
			return -1; 
	}

}
class Team {
	String Name;
	long numberOfMatches;
	
	public Team(String name, long numberOfMatches) {
		super();
		Name = name;
		this.numberOfMatches = numberOfMatches;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	@Override
	public String toString() {
		return  Name + "- " + numberOfMatches;
	}
	
	

}
public class DisplayTeamMain {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String name;
		long numberOfMatches;
		ArrayList<Team> al=new ArrayList<Team>();
		System.out.println("Enter number of teams:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter team" +" " + (i+1) +" " + "detail");
			System.out.println("Enter Name");
			name= sc.next();
			System.out.println("Enter number of matches");
			numberOfMatches=sc.nextLong();
			al.add(new Team(name, numberOfMatches));
			
		}
		Collections.sort(al,new TeamComparator());
		System.out.println("Team list after sort by number of matches \n" ); 
		for(Object s:al)
		{
			System.out.println(s);
		}
		
		
}
}
