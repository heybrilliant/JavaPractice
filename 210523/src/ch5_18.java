//2���� �迭 score�� ��� ����� ���� ���ϰ� ����ϱ� 

public class ch5_18 {
	public static void main(String[] args) {
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 } };
		int sum = 0;

		for (int i = 0; i < score.length; i++) { // score.length = 4��
			for (int j = 0; j < score[i].length; j++) { // score[i].length = 3��
//				System.out.printf("score[%d][%d]= %d%n", i, j, score[i][j]);
				System.out.println("score"+"["+i+"]"+"["+j+"] ="+ score[i][j]);  //���� �Ȱ����� ���� �� ���ŷο����� �������� ���°Ͱ���
				// �� �� ���� �迭�� ���� ��� 
				
				sum += score[i][j];
			}
		}
		System.out.println("sum = "+sum);
	}

}
