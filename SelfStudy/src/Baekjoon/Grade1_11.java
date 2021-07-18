package Baekjoon;

import java.util.Scanner;

//단계1.입출력과 사칙연산
//문제11: 홈페이지 참조
//백준 입력시 class이름은 Main

public class Grade1_11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		sc.close();
		
		System.out.println( a * (b.charAt(2) - '0')); // 아스키코드
		System.out.println( a * (b.charAt(1) - '0'));
		System.out.println( a * (b.charAt(0) - '0'));
		System.out.println( a * Integer.parseInt(b)); // b가 String 타입이므로 Int로 변환
	}
}
