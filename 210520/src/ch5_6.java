//�迭�� Ȱ��
//�ִ밪�� �ּҰ� ���ϱ�  : �迭�� ��� �߿��� ���� ū ���� ���� ���� ���� ã�´�
public class ch5_6 {
	public static void main(String[] args) {
		int[] score = {79, 88, 30, 19, 49, 59, 100, 20};
		
		int max = score[0]; // �迭�� ù��° ������ �ִ밪�� �ʱ�ȭ�Ѵ� ���⼱ 79�� ��
		int min = score[0]; // �迭�� ù��° ������ �ּҰ��� �ʱ�ȭ�Ѵ�
		
		for(int i =1; i < score.length; i++) { 
			if(score[i] > max) { //score[1]�� 88�� ���ԵǾ����� 88>79(score[0])�� ���̵Ǵ�
				max = score[i];  // ���� max���� �ٽ� 88�� ����Ǵ°��� �̷��� ���� �ϳ��� ���ؼ� ū������ �����ؼ� �ִ밪�� ã�� ��!
			} else if(score[i] < min) { // ���������� min���� �ϳ��ϳ� ���ؼ� �ּҰ��� min������ �ʱ�ȭ���� �ּҰ��� ã��
				min = score[i];
			}
		} // end of for
		System.out.println("�ִ밪�� : "+ max);
		System.out.println("�ּҰ��� : "+ min);
	}
}
