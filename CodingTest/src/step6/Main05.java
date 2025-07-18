package step6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/
public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next().toUpperCase();
		
		int[] arr = new int[26];
		// 입력 알파벳 카운트 배열
		for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i)-'A']++;
		}

		// 카운트 최대값 찾기
		int max =0;
		for(int i=0; i<26;i++) {
			max = Math.max(max, arr[i]);
		}
		
		// 최대값 알파벳 찾기
		char result = '?'; //최댓값 문자열 찾기(처음 찾은 문자를 최댓값)
		boolean check = false;
		for(int i=0; i<26;i++) {
			if(arr[i]==max)
				if(result=='?') {
					result = (char)(i+'A');
				} else{ //처음 찾은 최댓값 말고 또 찾으면 check를 true로 함으로써 중복된 값이 있다고 체크
					check = true;
				}
		}
		
		if(check) System.out.println('?');
		else System.out.println(result);
	}
}
