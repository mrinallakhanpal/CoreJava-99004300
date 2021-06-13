package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Player implements Comparable<Player> {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "--" + name;
	}

}

class Team implements Comparable<Team> {
	private String name;
	private List<Player> playerList = new ArrayList<Player>();

	public Team(String name) {
		super();
		this.name = name;
	}

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(String name, List<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}

	public void setPlayerList(List playerList) {
		this.playerList = playerList;
	}

	public void addplayer(String name) {
		playerList.add(new Player(name));
	}

	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class DisplayTeamMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players..");
		int no = Integer.parseInt(br.readLine());

		Set<Team> stteam = new TreeSet<Team>();
		String teamname, playername;
		boolean b = false;
		for (int i = 0; i < no; i++) {
			String str = br.readLine();
			String[] pro = str.split("\\|");
			teamname = pro[0];
			playername = pro[1];
			b = false;
			for (Team t : stteam) {

				if (t.getName().equals(teamname)) {
					t.addplayer(playername);
					b = true;
				}
			}
			if (b == false) {

				Team t = new Team(teamname);
				t.addplayer(playername);
				stteam.add(t);
			}

		}
		System.out.println("Team and Details");
		for (Team t : stteam) {
			System.out.println(t.getName());
			List<Player> li = t.getPlayerList();
			for (Player p : li) {
				System.out.println("--" + p.getName());
			}
		}

	}

}
