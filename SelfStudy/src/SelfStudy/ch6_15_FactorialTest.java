package SelfStudy;

// 재귀호출 (recursive call)
// : 메소드 내부에서 메소드 자신을 다시 호출하는 것 
// 재귀메소드 : 재귀호출을 하는 메소드 

// void method() {
//	method(); // 재귀호출. 메소드 자신을 호출한다. 
// }

// 그러나 위의 코드처럼 오로지 재귀호출뿐이면 무한히 자기 자신을 호출하기 때문에 무한반복에 빠짐
// 무한반복문이 조건문과 함께 사용되는 것처러머 재귀호출도 조건문이 필수적으로 따라다닌다.

//void method(int n) {
//	if(n==0)
//		return; // n의 값이 0일때 메소드를 종료한다 
//	System.out.println(n);
//	
//	method(--n); // 재귀호출. method(int n)을 호출 
//}

// 대표적인 재귀호출의 예시
// f(n) = n * f(n-1), 단 f(n) = 1


public class ch6_15_FactorialTest {
	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}
	static int factorial(int n) {
		int result = 0;
		
		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n-1); // 다시 메소드 자신을 호출한다. 
		}
		return result;
	}
}
