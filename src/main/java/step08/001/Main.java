package step08.baekjoon001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long num = sc.nextLong();
		Long bub = sc.nextLong();
		
		String num2 = String.valueOf(num);
		char[] num3 = num2.toCharArray();
		
		
		for(int i=1; i<=num3.length; i++) {
			Math.pow(num3[i-1], i);
		}

	}

}
