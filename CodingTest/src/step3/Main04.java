package step3;

import java.util.Scanner;
// 문제명 : 영수증
public class Main04 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int sum =0;
	long x = sc.nextLong();
	int n = sc.nextInt();
	for(int i=0; i<n; i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		sum += a*b;
	}
	if(x==sum) System.out.println("Yes");
	else System.out.println("No");
  }
}
