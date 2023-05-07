package baekjoon.step08.baekjoon001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int bub = sc.nextInt();
		
		String num2 = String.valueOf(num); //숫자의 개별 자릿수 얻는 방법
		char[] num3 = num2.toCharArray();  //숫자의 개별 자릿수 얻는 방법
		
		
		for(int i=1; i<=num3.length; i++) {
			Math.pow(num3[i-1], i);
		}

	}

}
