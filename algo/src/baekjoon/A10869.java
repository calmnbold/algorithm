package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A10869 {
	
	// 문제: 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
	// 입력: 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
	// 출력: 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

	/*
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int one = A+B;
		int two = A-B;
		int three = A*B;
		int four = A/B;
		int five = A%B;
		
		scan.close();
				
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		
	}
	*/
	/*
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		scan.close();
		
		StringBuilder sb = new StringBuilder();
		sb.append(A+B);
		sb.append('\n');
		sb.append(A-B);
		sb.append('\n');
		sb.append(A*B);
		sb.append('\n');
		sb.append(A/B);
		sb.append('\n');
		sb.append(A%B);
		sb.append('\n');
		
		System.out.println(sb);
		
	}
	*/
	/*
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
	}
	*/
public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
	}
}
