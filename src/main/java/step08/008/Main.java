package step08.baekjoon008;

/*int,long �ڷ������� ū ���� ���� �Է��ؾ� �ϹǷ� ���Ѵ� ���� �ڷ��� BigInteger ���*/
import java.math.BigInteger;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger(); 
		BigInteger b = sc.nextBigInteger();
		
		/*BigInteger�� a+b ���� ���. (README.md-Ǯ�̹�� ����)*/
		System.out.println(a.add(b)); 
	}

}
