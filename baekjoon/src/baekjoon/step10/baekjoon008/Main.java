package baekjoon.step10.baekjoon008;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] stick = new int[3];
	      
	    for(int i=0; i<stick.length; i++) {
	    	  stick[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(stick); // Arrays.sort()로 입력받은 stick 값 오름차순 정렬
	    
	    // 삼각형이 되기 위한 조건 : (a+b) > c
	    if((stick[0] + stick[1]) > stick[2]) {
	        System.out.println(stick[0] + stick[1] + stick[2]); 
	    } else {
	    	stick[2] = (stick[0] + stick[1])-1;
	    	System.out.println(stick[0] + stick[1] + stick[2]);
	    }
	    
	}

}
