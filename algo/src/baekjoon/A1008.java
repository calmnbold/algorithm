package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A1008 {
	 
	/*
	  public static void main(String args[]) {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  Double A = scan.nextDouble(); 
	  Double B = scan.nextDouble();
	  
	  scan.close();  //닫아주자 잊지말고
	  System.out.println(A/B);
	  
	  }
	*/
	
	/*
	  public static void main(String args[]) throws IOException{
	  
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String str = br.readLine();
	  
	  StringTokenizer st = new StringTokenizer(str," ");
	  
	  Double A = Double.parseDouble(st.nextToken()); 
	  Double B = Double.parseDouble(st.nextToken());
	  
	  System.out.println(A/B);
	  
	  }
	*/

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		double A = Double.parseDouble(str[0]);
		double B = Double.parseDouble(str[1]);
		
		System.out.println(A/B);
		
	}
}
