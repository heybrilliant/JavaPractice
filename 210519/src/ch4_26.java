//1���� n���� ���ϸ� �����հ谡 100�� �����ʴ� ���� ū���� �Ǵ��� �˾ƺ���
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
//		�Ǵ� 
		while(sum <= 100) {
			System.out.printf("%d-%d%n", i, sum);
			sum += ++i;
		}
	}

}
