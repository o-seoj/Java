package step10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
문제
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

입력
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

출력
직사각형의 네 번째 점의 좌표를 출력한다.
*/
public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrX = new int[3];
		int[] arrY = new int[3];
		
		for(int i=0; i<3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arrX[i] =x;
			arrY[i] =y;
		}
		System.out.print(arrX[0]==arrX[1]?arrX[2]:(arrX[0]==arrX[2]?arrX[1]:arrX[0]));
		System.out.print(" ");
		System.out.print(arrY[0]==arrY[1]?arrY[2]:(arrY[0]==arrY[2]?arrY[1]:arrY[0]));

	}
}
