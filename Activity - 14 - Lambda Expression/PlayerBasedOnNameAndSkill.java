package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import first.PlayerRanking.Player;

public class PlayerBasedOnNameAndSkill {

	static class Player {

		private String name;
		private String skill;

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
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Player> playerList = new ArrayList<Player>();

		System.out.println("Enter number of player you want to enter");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Enter name of player");
			String name = sc.next();

			System.out.println("Select one skill of player");
			System.out.println("1.All Rounder");
			System.out.println("2.Batsman");
			System.out.println("3.Bowler");

			String skill = "";

			int skillNum = sc.nextInt();

			switch (skillNum) {
			case 1:
				skill = "All Rounder";
				break;
			case 2:
				skill = "Batsman";
				break;
			case 3:
				skill = "Bowler";
				break;

			}

			Player player = new Player(name, skill);
			playerList.add(player);
		}

		Comparator<Player> comparator = (player1, player2) -> player1.getSkill().compareTo(player2.getSkill());
		Collections.sort(playerList, comparator);

		System.out.println("Player Details");
		for (Player player : playerList) {
			System.out.println("Player " + player.getName() + " Skill " + player.getSkill());
		}
	}
}
