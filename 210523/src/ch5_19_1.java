
public class ch5_19_1 {

	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100}
				,{20, 20, 20}
				,{30, 30, 30}
				,{40, 40, 40}
				,{50, 50, 50}
		};
		//���� ���� 
		int KorTotal = 0; 
		int EngTotal = 0;
		int MaTotal = 0;
		
		System.out.println("��ȣ   ����   ����   ����   ����   ���");
		System.out.println("=======================");
		
		for(int i = 0; i < score.length; i++) {
		int sum = 0;
		float avg = 0.0f;	
		
		KorTotal += (score[i][0]); 
		EngTotal += (score[i][1]); //�̰Ŵ� �ʱ�ȭ �ѹ� ������� ����������
		MaTotal += (score[i][2]);
		System.out.printf("%3d",i+1);
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			
			}
			avg = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f%n",sum,avg);
		}
		System.out.println("=======================");
		System.out.println("����: " + KorTotal +" "+ EngTotal +" "+ MaTotal );
	}

}
