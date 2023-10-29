package step02.baekjoon006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m1 = sc.nextInt();
		
		int m2 = sc.nextInt();
		
		if((m1+m2)/60 == 0) {
			m1 += m2;
			System.out.println(h+" "+m1);
		} else {
			h += (m1+m2)/60;
			m1 = (m1+m2)%60;
			if(h>23) {
				h-=24;
			}
			System.out.println(h+" "+m1);
		}
		

	}

}
