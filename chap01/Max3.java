package chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값: ");
		int a = scan.nextInt();
		System.out.print("b의 값: ");
		int b = scan.nextInt();
		System.out.print("c의 값: ");
		int c = scan.nextInt();
		
		//최댓값 구하기
		int max = a;
		if(b>max) max = b;
		//else if(c>max) max = c; // b > max가 true가 나오면, 여기까지 안내려가고 바로 if문 종료됨
		if(c>max) max = c;
		
		System.out.println("최대값은 "+max+"입니다.");
	}
}
	