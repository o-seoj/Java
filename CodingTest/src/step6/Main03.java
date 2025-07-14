package step6;

import java.util.Scanner;

/*
문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
*/

public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count =0;
		for(int k=0; k<2*n;k++) {
			if(k<n) {
				count++;
			}
			else {
				count--;
			}
			for(int i=1; i<=n-count; i++) {
				System.out.print(" ");
			}
			for(int j=1; j<count*2;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
