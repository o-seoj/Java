package step9;
/*
문제
어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.

입력
입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)
입력의 마지막엔 -1이 주어진다.

출력
테스트케이스 마다 한줄에 하나씩 출력해야 한다.
n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
이때, 약수들은 오름차순으로 나열해야 한다.
n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n== -1) break;
			ArrayList<Integer> arr = new ArrayList<Integer>();
			int sum=0;
			for(int i=1; i<n; i++) {
				if(n%i==0) {
					sum+=i;
					arr.add(i);
				}
			}
			if(sum==n) {
				System.out.print(n + " = "+arr.get(0));
				for(int i=1; i<arr.size(); i++) {
					System.out.print(" + "+arr.get(i));
				}
				System.out.println();
			}else {
				System.out.println(n+" is NOT perfect.");
			}
		}
	}
}
