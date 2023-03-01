package chap01;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		int n = scan.nextInt();
		
		int sum = 0;
		int i = 1; //int i=0;
		while(i<=n) {//i<n
			sum += i; //i++;
			i++; //sum += i;
			
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		System.out.println(i); //i=n+1 //i = n
		
	}
}
