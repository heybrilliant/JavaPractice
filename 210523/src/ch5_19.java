//�л� 5���� ������ ���л��� ������ ���, ���� ������ ���
public class ch5_19 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100}
				,{20, 20, 20}
				,{30, 30, 30}
				,{40, 40, 40}
				,{50, 50, 50}
		};
		//���� ���� 
		
		System.out.println("��ȣ   ����   ����   ����   ����   ���");
		System.out.println("=======================");
		
		int KorTotal = 0; 
		int EngTotal = 0;
		int MaTotal = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d  ",i+1);
			
			KorTotal += (score[i][0]); 
			EngTotal += (score[i][1]); //�̰Ŵ� �ʱ�ȭ �ѹ� ������� ����������
			MaTotal += (score[i][2]);
			
			// i�� 0�̸�
			for(int j = 0; j < score[i].length; j++) { // �� ������ݺ��Ť������迭���ؾȰ��Ű�����  �׷��� j�� 0~2
				// j�� ���� score 
				int sum = 0; 
				float avr = 0f;//������ ���̶� �ڼ��� �� ����� ���� float������ ����
				
				sum += score[i][j];  
				avr = sum / (float)score[i].length; //��� = ������ ������ ������ ����
				
				System.out.printf("%d  ", score[i][j] );	
				System.out.printf("%d  %f", sum, avr);
			}
			System.out.println(); //j�� �������� ����������� �׷��� j for�� �ۿ��� �������ִ� �޼ҵ� ����
		}
		System.out.println("=======================");
		System.out.println("����: " + KorTotal +" "+ EngTotal +" "+ MaTotal );		
	}
}
