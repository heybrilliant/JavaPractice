//�迭�� Ȱ��
//���ù��� ī�弯��

public class ch5_7 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i; // �迭�� 0~9�� ���ڷ� �ʱ�ȭ �Ѵ�
			System.out.print(numArr[i]);
		}
		System.out.println();
		for(int i = 0; i <100; i++) {
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for (int i = 0; i < numArr.length; i++) 
			System.out.print(numArr[i]);
	}
}
