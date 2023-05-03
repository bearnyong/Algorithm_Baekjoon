package baekjoon.step08.baekjoon004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 3;
		int sum = 1;
		
		for(int i=1; i<n; i++) {
			sum *= 2;
			num = (num+sum);
		}
		System.out.println(num*num);
	}

}
