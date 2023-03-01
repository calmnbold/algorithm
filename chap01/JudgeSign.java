package chap01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("정수를 입력하세요.:");
			int n = scan.nextInt();
			if(n>0) {//양수
				System.out.println("이 수는 양수입니다.");
			}else {
				System.out.println((n<0)?"이 수는 음수입니다.":"이 수는 0입니다."); //3삼항 연산자
			}
				
				//}else if(n<0) {// 음수
			//	System.out.println("이 수는 음수입니다.");
			//}else {
			//	System.out.println("이 수는 0입니다.");
			//}
			
		}while(true);
	}
}
