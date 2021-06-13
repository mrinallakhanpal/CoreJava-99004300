package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Compare implements Comparator <Player>
{

	public int compare(Player o1, Player o2)
	{
		if(o1.skill.compareTo(o2.skill) == 0 && o1.name.compareTo(o2.name) == 0)  
			return 0;  
			
			else if(o1.skill.compareTo(o2.skill) > 0 && o1.name.compareTo(o2.name) > 0)  
			return 1;  
			
			else  
			return -1; 
		
	}

}
class Player {
    String name;
    String skill;

    public Player(String name, String skill) {
        super();
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "name=" + name + ", skill=" + skill;
    }
}
public class DisplayTeamMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Player> al=new ArrayList<Player>();
		
	System.out.println("Please provide the number of players to be registered");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the name of the player ");
		String name=sc.next();
		System.out.println("Enter the skill of the player ");
		System.out.println("1.BATTING");
		System.out.println("2.BOWLING");
		System.out.println("3.ALLROUNDER");
		String skill=sc.next();
		if(skill.equals("1"))
		{
			skill="Batting";
		}
		else if(skill.equals("2"))
		{
			skill="Bowling";
		}
		else if(skill.equals("3"))
		{
			skill="Allrounder";
		}
		
		
		al.add(new Player(name,skill));
	}
	Collections.sort(al,new Compare());  
	for(Player s:al)
	{
		System.out.println(s);
	}
	}
}