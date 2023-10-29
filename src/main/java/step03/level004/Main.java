package step03.level004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int won = sc.nextInt();
		int su = sc.nextInt();

		int result = 0;

		for(int i=1; i<=su; i++) {
			int pri = sc.nextInt();
			int ro = sc.nextInt();

			result += pri*ro;
		}
		if(won==result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}

}
