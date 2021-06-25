package SelfStudy;


// x의 1승부터 x의 n승까지의 합을 구하는 예제

public class ch6_18_PowerTest {
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += power(x, i);
		}
		System.out.println(result);
	}
	
	static long power (int x, int n) {
		if(n==1) {
			return x;
		}
		return x * power(x, n-1);
	}
}
	