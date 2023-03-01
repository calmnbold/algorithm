package chap01;

import java.util.Scanner;

public class SumFor2 {

	public static void main(String[] args) {
		// n이 양수값만 받도록 하기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1~n까지의 합을 구합니다.");
		int n = 0;
		do {
			System.out.print("n값: ");
			 n = scan.nextInt();
		}while(n<=0);
		
		int sum = 0;
		int i = 1;
		while(i<=n) {
			sum = sum+i;
			i++;
		}
		System.out.println("1~n까지의 합: "+sum);
	}
		
}


