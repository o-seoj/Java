package step4;

import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[30];
	
		for(int i=0; i<30; i++) arr[i] = i+1;
		int[] res = new int[2];
		
		for(int j=0; j<28; j++) {
			int n = sc.nextInt();
			arr[n-1] = 0;
		}
		for(int num : arr) {
			if(num!=0) System.out.println(num);
		}
	}
}
