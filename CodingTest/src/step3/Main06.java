package step3;

import java.io.*;

//문제명 : 빠른 A+B
public class Main06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String line = br.readLine();
			String[] parts = line.split(" ");
			
			 // 정수로 변환
	        int a = Integer.parseInt(parts[0]);
	        int b = Integer.parseInt(parts[1]);
	   
	        bw.write((a + b) + "\n");  //BufferedWriter로 출력
		}
        bw.flush();  // 모든 출력 한꺼번에, 이거 없으면 출력 안 됨!
        bw.close();  // 자원 정리 (선택)
        br.close();
	}
}
