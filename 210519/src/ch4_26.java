//1부터 n까지 더하면 누적합계가 100을 넘지않는 제일 큰수가 되는지 알아보기
public class ch4_26 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
//		
//		while((sum += ++i) <= 100) {
//			System.out.printf("%d - %d%n" , i,sum);
//		}
//		System.out.println();
//		
//		또는 
		while(sum <= 100) {
			System.out.printf("%d-%d%n", i, sum);
			sum += ++i;
		}
	}

}
