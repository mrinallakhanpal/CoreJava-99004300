import java.util.Scanner;

public class Activity2 {
	public static void findCricketerId(int arr[],int size,int score) {
		int cricketer[] = new int[100];
		int j = 0;
		for (int i = 1; i < size; i = i + 2) {
			if (arr[i] > score) {
				cricketer[j] = arr[i - 1];
				j++;
			}
		}
		for (int i = 0; i < j; i++) {
			System.out.println(cricketer[i]);
		}
	}

	public static void main(String[] args) {
		int n, i, score;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if (n < 0) {
			System.out.print("Invalid array size");
			System.exit(0);
		} else {
			int a[] = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = in.nextInt();
				if (a[i] < 0) {
					System.out.print("Invalid input");
					System.exit(0);
				}
			}
			score = in.nextInt();
			if (score < 0) {
				System.out.print("Invalid score");
				System.exit(0);
			}
			findCricketerId(a,n,score);
			
		}
	}
}