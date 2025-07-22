package step8;

import java.util.Scanner;

/*
문제
B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

입력
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

출력
첫째 줄에 B진법 수 N을 10진법으로 출력한다.
*/
public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		int result =0;
		for(int i=0; i<s.length(); i++) {
			int c = s.charAt(i);
			if(c-'A'<0) {
				c = c-'0';
				result += c*Math.pow(n, s.length() - 1 - i);
			}else if(c-'A'>=0){
				result += ((c-'A')+10)*Math.pow(n, s.length() - 1 - i);
			}
			
		}
		System.out.println(result);
		
	}
}
