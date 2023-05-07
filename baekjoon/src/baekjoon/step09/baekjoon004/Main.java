package baekjoon.step09.baekjoon004;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	      
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] prime = new int[num];
		
		for(int i=0; i<prime.length; i++) {
			prime[i] = sc.nextInt();
		}
	      
		int sum = 0;
	    for(int i=0; i<prime.length; i++) {
	    	if (prime[i] == 2) {
	    		sum += 1;
    			System.out.println(prime[i]+" !: " +sum);
	    	}
	    	for(int j=2; j<prime[i]; j++) {
	    		if(prime[i]%j == 0) {
	    			break;
	    		} else {
	    			sum += 1;
	    			System.out.println(prime[i]+" : " +sum);
	    			break;
	    		}
	    	}
	    }
	    
	    System.out.println(sum);
	    
	}

}
