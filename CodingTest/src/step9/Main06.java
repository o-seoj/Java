package step9;

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
				//약수이면서 소수 추가
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
