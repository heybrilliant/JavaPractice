//1���� ����� ���ϸ� ���� 100�� �Ѵ��� �˾Ƴ��� ����
public class ch4_30 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) { //���ѹݺ��� =for(;;){}
			if(sum > 100)
				break; // �ڽ��� ���� �ݺ����� �����.
			++i;
			sum += i;
		}
		System.out.println("i = "+i);
		System.out.println("sum = "+sum);
	}
}
