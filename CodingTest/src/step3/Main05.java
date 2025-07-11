package step3;

import java.util.Scanner;

//문제명 : 코딩은 체육과목입니다.
public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n/4;i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		
	}
}
