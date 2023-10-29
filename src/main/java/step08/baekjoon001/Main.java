package step08.baekjoon001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int bub = sc.nextInt();
		
		String num2 = String.valueOf(num); //������ ���� �ڸ��� ��� ���
		char[] num3 = num2.toCharArray();  //������ ���� �ڸ��� ��� ���
		
		
		for(int i=1; i<=num3.length; i++) {
			Math.pow(num3[i-1], i);
		}

	}

}
