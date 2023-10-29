package step09.baekjoon004;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
       
        int num2;
        int count = 0;
        
        for(int i=0; i<num1; i++){
        	num2 = sc.nextInt();
        	// �Է¹��� num1���� ���� �ݺ����� ���� num1�� �Է¹޴´�.
        	
            for(int j=2; j<=num2; j++){
            // j�� 2���� �Է¹��� num2�� �ɶ����� 1�� �����ϸ� �ݺ��Ѵ�.
            	
                if(j==num2) {	// ���� j�� �Է¹��� num2�� ���ٸ�
                    count++;	// count�� 1 �����Ѵ�. (�Ʒ� if���� �������� �ʾұ⿡ �ڱ� �ڽ��� ���ڱ��� ��)
                } 				// ���� �ʴٸ� �Ʒ� if������ �̵��Ѵ�.
                
                if(num2%j==0){	// ���� num�� j���� �������� 0�� �ȴٸ�
                    break;		// for���� �������� �ٽ� num2�� �Է� �޴´�. 
                } 				// ���� �ʴٸ� �ٽ� for������ ���ư� j���� 1�������� ������ �ݺ��Ѵ�.
  
            }
        }
        System.out.println(count);
	}

}
