package first;

import java.util.Arrays;
import java.util.Scanner;

class SortScore extends Thread {
	int res[];
	String match;

	public SortScore(String matchType, String scoreString) {
		match = matchType;
		String arr[] = scoreString.split(",");
		res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = Integer.parseInt(arr[i]);
		}
	}

	public void run() {
		Arrays.sort(res);
	}

	public void getScore() {
		System.out.println("Match : " + match);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}

public class Ques1 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the match");
		String match = sc.nextLine();
		System.out.println("ENter the scores");
		String scores = sc.nextLine();
		SortScore s = new SortScore(match, scores);
		s.start();
		s.join();
		System.out.println("ENter the match");
		match = sc.nextLine();
		System.out.println("ENter the scores");
		scores = sc.nextLine();
		SortScore s2 = new SortScore(match, scores);
		s2.start();
		s2.join();
		System.out.println("ENter the match");
		match = sc.nextLine();
		System.out.println("ENter the scores");
		scores = sc.nextLine();
		SortScore s3 = new SortScore(match, scores);
		s3.start();
		s3.join();
		s.getScore();
		s2.getScore();
		s3.getScore();
		sc.close();
	}

}