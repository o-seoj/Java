package step9;
/*
문제
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

출력
N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);

		for(int i=1; i<=n; i++) {
			int count = 0;
			//약수이면서 소수 구하기
			if(n%i==0) {
				for(int j =1; j<=i; j++) {
					if(i%j==0) {
						count++;
					}
				}
				//약수이면서 소수이면 소인수 분해
				if(count==2) {
					while(true) {
						if(n%i!=0) break;
						if(n%i==0) {
							System.out.println(i);
							n = n/i;
						}
					}
				}
			}
		}
	}
	
}
