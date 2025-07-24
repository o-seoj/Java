package step9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(true) {
			int n = sc.nextInt();
			if(n== -1) break;
			int sum=0;
			for(int i=1; i<n; i++) {
				if(n%i==0) {
					sum+=i;
					arr.add(i);
				}
				
			}
			if(sum==n) {
				System.out.print(n + " = ");
				for(int i=0; i<arr.size(); i++) {
					System.out.print(arr.get(i));
				}
				System.out.println();
			}else {
				System.out.println(n+" is NOT perfect.");
			}
		}
	}
}
