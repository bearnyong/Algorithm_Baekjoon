package step09.baekjoon006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
    	
        for(int j=2; j<=num; j++){
        	while(num%j==0) {
        		System.out.println(j);
        		num = num/j;
        	}
        	
        }

	}

}
