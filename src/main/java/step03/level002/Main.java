package step03.level002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num3 = sc.nextInt();
		int result = 0;

		for(int i=1; i<=num3; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			result = num1+num2;
			System.out.println(result);
		}


	}

}
