package step08.baekjoon003;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[T];
		
		// Quarter(25), Dime(10), Nickel(5), Penny(1)
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			int Quarter = (arr[i]/25);
			int Dime = (arr[i]%25)/10;
			int Nickel = ((arr[i]%25)%10)/5;
			int Penny = ((arr[i]%25)%10)%5;
			
			System.out.println(Quarter+ " " + Dime + " " + Nickel + " " + Penny);
		}

	} 

}
