import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rounds = sc.nextInt();
		int score1 = 100;
		int score2 = 100;
		for (int i=0;i<rounds;i++) {
			int point1 = sc.nextInt();
			int point2 = sc.nextInt();
			
			if (point1 > point2) {
				score2 -=  point1;
			} else if (point1 < point2) {
				score1 -= point2;
			}
		}
		
		System.out.println(score1);
		System.out.println(score2);
	}

}
