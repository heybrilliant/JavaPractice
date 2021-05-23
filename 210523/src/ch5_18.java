//2차원 배열 score의 모든 요소의 합을 구하고 출력하기 

public class ch5_18 {
	public static void main(String[] args) {
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 } };
		int sum = 0;

		for (int i = 0; i < score.length; i++) { // score.length = 4임
			for (int j = 0; j < score[i].length; j++) { // score[i].length = 3임
//				System.out.printf("score[%d][%d]= %d%n", i, j, score[i][j]);
				System.out.println("score"+"["+i+"]"+"["+j+"] ="+ score[i][j]);  //둘이 똑같은데 식이 더 번거로워져서 윗식으로 쓰는것같음
				// 둘 다 가변 배열일 때도 사용 
				
				sum += score[i][j];
			}
		}
		System.out.println("sum = "+sum);
	}

}
