package baekjoon.step10.baekjoon008;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
	     
		  int[] stick = new int[3];
	      
	      for(int i=0; i<stick.length; i++) {
	    	  stick[i] = sc.nextInt();
			}
	    
	      if((stick[0] + stick[1]) > stick[2]) { //���� �����ϸ� �ٷ� ���
	         System.out.println(stick[0] + stick[1] + stick[2]); 
	      } else { //�ƴ� ��� ������ ���� �ٿ��� ��� a+b�� �պ��� 1������ ����
	         System.out.println((stick[0] + stick[1])+(stick[2]-1));
	      }
	
	}
}
