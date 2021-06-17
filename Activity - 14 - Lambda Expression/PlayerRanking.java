package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PlayerRanking {

	static class Player {
		private String name;
		private int score;

		public Player(String name, int score) {
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

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Player> playerList = new ArrayList<Player>();

		System.out.println("Enter number of player you want to enter");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println("Enter name of player");
			String name = sc.next();
			System.out.println("Enter score of player");
			int score = sc.nextInt();
			Player player = new Player(name, score);
			playerList.add(player);

		}

		Comparator<Player> comparator = (player1, player2) -> player1.getScore() - player2.getScore();
		Collections.sort(playerList, comparator.reversed());

		int index = 1;
		for (Player player : playerList) {
			System.out.println((index++) + " " + player.getName() + " " + player.getScore());
		}
	}
}
