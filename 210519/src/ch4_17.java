//ȭ�鿡 �Էµ� ���ڸ�ŭ �����ϴ� �� ���
import java.util.*;

public class ch4_17 {
	public static void main(String[] args) {
		int num = 0; 
		System.out.println("*�� ����� ������ ���� �Է��ϼ���. >");
		
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine(); //ȭ�鿡 �Է¹��� ������ temp�� ����
		num = Integer.parseInt(temp); // �Է¹��� ���ڿ�(temp)�� ����integer������ ��ȯ
		
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
