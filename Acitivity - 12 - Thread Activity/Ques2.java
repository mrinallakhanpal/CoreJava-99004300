package first;

import java.util.Arrays;
import java.util.Scanner;

class CalculateScores implements Runnable {
	int res[];
	String match;
	int minscore, maxscore;
	double mean;

	public String getMatch() {
		return match;
	}
	public void setMatch(String match) {
		this.match = match;
	}

	public CalculateScores(String matchType, String scoreString) {
		setMatch(matchType);
		String arr[] = scoreString.split(",");
		res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = Integer.parseInt(arr[i]);
		}
	}

	public void run() {
		Arrays.sort(res);
		setMinscore(res[0]);
		setMaxscore(res[res.length-1]);
		int sum = 0;
		for(int i=0;i<res.length;i++) {
			sum+=res[i];
		}
		setMean(sum/res.length);
	}

	public int getMinscore() {
		return minscore;
	}

	public void setMinscore(int minscore) {
		this.minscore = minscore;
	}

	public int getMaxscore() {
		return maxscore;
	}

	public void setMaxscore(int maxscore) {
		this.maxscore = maxscore;
	}

	public double getMean() {
		return mean;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

}

public class Ques2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the match");
		String match = sc.nextLine();
		System.out.println("ENter the scores");
		String scores = sc.nextLine();
		CalculateScores s = new CalculateScores(match, scores);
		Thread t = new Thread(s);
		t.start();
		t.join();
		System.out.println("ENter the match");
		match = sc.nextLine();
		System.out.println("ENter the scores");
		scores = sc.nextLine();
		CalculateScores s2 = new CalculateScores(match, scores);
		Thread t2 = new Thread(s2);
		t2.start();
		t2.join();
		System.out.println("ENter the match");
		match = sc.nextLine();
		System.out.println("ENter the scores");
		scores = sc.nextLine();
		CalculateScores s3 = new CalculateScores(match, scores);
		Thread t3 = new Thread(s3);
		t3.start();
		t3.join();
		System.out.println(s.getMatch()+" :");
		System.out.println("Mean :"+s.getMean());
		System.out.println("Min Score :"+s.getMinscore());
		System.out.println("Max Score :"+s.getMaxscore());

		System.out.println(s2.getMatch()+" :");
		System.out.println("Mean :"+s2.getMean());
		System.out.println("Min Score :"+s2.getMinscore());
		System.out.println("Max Score :"+s2.getMaxscore());
		
		System.out.println(s3.getMatch()+" :");
		System.out.println("Mean :"+s3.getMean());
		System.out.println("Min Score :"+s3.getMinscore());
		System.out.println("Max Score :"+s3.getMaxscore());
		sc.close();
	}

}