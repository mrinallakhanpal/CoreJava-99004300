package comparable;

import java.util.*;
import java.io.*;
class Ranking implements Comparable<Ranking> {
	
	private String name;
	private int score;
	private int players;
	
	
	public int getPlayers() {
		return players;
	}


	public void setPlayers(int players) {
		this.players = players;
	}


	public Ranking(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}

	

	

	@Override
	public String toString() {
		return "Ranking [name=" + name + ", score=" + score + ", players=" + players + ", getPlayers()=" + getPlayers()
				+ ", getName()=" + getName() + ", getScore()=" + getScore() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Override
	public int compareTo(Ranking r) {
		// TODO Auto-generated method stub
		if(score == r.score)
			return 0;
		else if(score<r.score)
			return 1;
		else
			return -1;
	}

}

public class RankingMain {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Ranking> list = new ArrayList<Ranking>();
		System.out.println("enetr no of players");
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			System.out.println("Enter name of player"+i);
			String name = br.readLine();
			System.out.println("enter score of player"+i);
			int age = Integer.parseInt(br.readLine());
			list.add(new Ranking(name,age));
		}
		Collections.sort(list);
		for(Ranking r:list) {
			System.out.println(r.getName()+" "+r.getScore());
		}
	}
}
