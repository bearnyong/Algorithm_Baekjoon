package baekjoon.step02.baekjoon005;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int clo1 = sc.nextInt();
		int clo2 = sc.nextInt();
		
		if(clo2>=45) {
			System.out.print(clo1+" "+(clo2-45));
		} else if((clo1>0)&&(clo2<45)) {
			System.out.println((clo1-1)+" "+(clo2+15));
		} else if((clo1==0)&&(clo2<45)) {
			clo1=23;
			System.out.println((clo1)+" "+(clo2+15));
		}

	}

}
