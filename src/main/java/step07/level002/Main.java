package step07.level002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[][] ar = new int[9][9];
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int x = 0;
		int y = 0;

		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				if(ar[i][j]>=max) {
					max = ar[i][j];
					x = i+1;
					y = j+1;
				}
			}
		}

		System.out.println(max);
		System.out.println(x + " " + y);

	}

}

