package test1;
/*
 * 날짜 : 2025/07/09 
 * 이름 : 오서정
 * 내용 : 자바 반복문 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		int n = 5;
		
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++) { //i*2+1
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
