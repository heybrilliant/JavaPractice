//1부터 몇까지 더하면 합이 100을 넘는지 알아내는 예제
public class ch4_30 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) { //무한반복문 =for(;;){}
			if(sum > 100)
				break; // 자신이 속한 반복문을 벗어난다.
			++i;
			sum += i;
		}
		System.out.println("i = "+i);
		System.out.println("sum = "+sum);
	}
}
