package step7;

import java.util.Scanner;

/*
문제
가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다. 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
예를 들어 흰색 도화지 위에 세 장의 검은색 색종이를 그림과 같은 모양으로 붙였다면 검은색 영역의 넓이는 260이 된다.

입력
첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다

출력
첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.
 */
public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] paper = new int[100][100];
		
		for(int i=0; i<n; i++) {
			int left = sc.nextInt();
			int h = sc.nextInt();
			for(int j=0; j<10;j++) {
				for(int k=0; k<10; k++) {
					paper[j+left][k+h] =1;
				}
			}
		}
		int sum=0;
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(paper[i][j]==1 ) {
					sum +=1;
				}
			}
		}
		System.out.print(sum);	
	}
}
