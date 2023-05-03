package baekjoon.step08.baekjoon008;

/*int,long 자료형보다 큰 정수 값을 입력해야 하므로 무한대 정수 자료형 BigInteger 사용*/
import java.math.BigInteger;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger(); 
		BigInteger b = sc.nextBigInteger();
		
		/*BigInteger의 a+b 연산 방법. (README.md-풀이방법 참조)*/
		System.out.println(a.add(b)); 
	}

}
