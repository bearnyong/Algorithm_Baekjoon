package step10.baekjoon008;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] stick = new int[3];
	      
	    for(int i=0; i<stick.length; i++) {
	    	  stick[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(stick); // Arrays.sort()�� �Է¹��� stick �� �������� ����
	    
	    // �ﰢ���� �Ǳ� ���� ���� : (a+b) > c
	    if((stick[0] + stick[1]) > stick[2]) {
	        System.out.println(stick[0] + stick[1] + stick[2]); 
	    } else {
	    	stick[2] = (stick[0] + stick[1])-1;
	    	System.out.println(stick[0] + stick[1] + stick[2]);
	    }
	    
	}

}
