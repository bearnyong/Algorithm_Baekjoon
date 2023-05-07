package baekjoon.step10.baekjoon008;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
	     
		  int[] stick = new int[3];
	      
	      for(int i=0; i<stick.length; i++) {
	    	  stick[i] = sc.nextInt();
			}
	    
	      if((stick[0] + stick[1]) > stick[2]) { //조건 만족하면 바로 출력
	         System.out.println(stick[0] + stick[1] + stick[2]); 
	      } else { //아닐 경우 막대의 길이 줄여서 출력 a+b의 합보다 1작으면 가능
	         System.out.println((stick[0] + stick[1])+(stick[2]-1));
	      }
	
	}
}
