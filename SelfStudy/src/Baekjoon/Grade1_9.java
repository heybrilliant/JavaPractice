package Baekjoon;

import java.util.Scanner;

//단계1.입출력과 사칙연산
//문제9: 두 자연수 A와 B가 주어진다. 
//이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

public class Grade1_9 { // 백준 입력시 class이름은 Main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
	}
}
