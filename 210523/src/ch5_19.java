//학생 5명의 점수로 각학생의 총점과 평균, 과목별 총점을 계산
public class ch5_19 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100}
				,{20, 20, 20}
				,{30, 30, 30}
				,{40, 40, 40}
				,{50, 50, 50}
		};
		//과목별 총점 
		
		System.out.println("번호   국어   영어   수학   총점   평균");
		System.out.println("=======================");
		
		int KorTotal = 0; 
		int EngTotal = 0;
		int MaTotal = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d  ",i+1);
			
			KorTotal += (score[i][0]); 
			EngTotal += (score[i][1]); //이거는 초기화 한번 해줘야지 쓸수ㅇㅆ아
			MaTotal += (score[i][2]);
			
			// i기 0이면
			for(int j = 0; j < score[i].length; j++) { // 가 몇까지반복돼ㅋㅋㅋ배열이해안간거같은디  그래서 j는 0~2
				// j는 뭐야 score 
				int sum = 0; 
				float avr = 0f;//나누기 값이라 자세한 값 출력을 위해 float변수로 설정
				
				sum += score[i][j];  
				avr = sum / (float)score[i].length; //평균 = 총점을 과목의 갯수로 나눔
				
				System.out.printf("%d  ", score[i][j] );	
				System.out.printf("%d  %f", sum, avr);
			}
			System.out.println(); //j가 끝났을때 개행해줘야함 그래서 j for문 밖에서 개행해주는 메소드 실행
		}
		System.out.println("=======================");
		System.out.println("총점: " + KorTotal +" "+ EngTotal +" "+ MaTotal );		
	}
}
