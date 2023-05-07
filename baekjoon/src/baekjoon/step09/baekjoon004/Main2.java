package baekjoon.step09.baekjoon004;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
       
        int num2;
        int count = 0;
        
        for(int i=0; i<num1; i++){
        	num2 = sc.nextInt();
        	// 입력받은 num1개의 수를 반복문을 통해 num1번 입력받는다.
        	
            for(int j=2; j<=num2; j++){
            // j를 2부터 입력받은 num2가 될때까지 1씩 증가하며 반복한다.
            	
                if(j==num2) {	// 만약 j가 입력받은 num2와 같다면
                    count++;	// count가 1 증가한다. (아래 if문이 성립되지 않았기에 자기 자신의 숫자까지 옴)
                } 				// 같지 않다면 아래 if문으로 이동한다.
                
                if(num2%j==0){	// 만약 num을 j나눈 나머지가 0이 된다면
                    break;		// for문을 빠져나가 다시 num2를 입력 받는다. 
                } 				// 같지 않다면 다시 for문으로 돌아가 j값을 1증가시켜 과정을 반복한다.
  
            }
        }
        System.out.println(count);
	}

}
