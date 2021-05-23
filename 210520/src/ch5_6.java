//배열의 활용
//최대값과 최소값 구하기  : 배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다
public class ch5_6 {
	public static void main(String[] args) {
		int[] score = {79, 88, 30, 19, 49, 59, 100, 20};
		
		int max = score[0]; // 배열의 첫번째 값으로 최대값을 초기화한다 여기선 79가 들어감
		int min = score[0]; // 배열의 첫번째 값으로 최소값을 초기화한다
		
		for(int i =1; i < score.length; i++) { 
			if(score[i] > max) { //score[1]에 88이 대입되었으니 88>79(score[0])이 참이되니
				max = score[i];  // 따라서 max값에 다시 88이 저장되는거임 이렇게 수를 하나씩 비교해서 큰값으로 대입해서 최대값을 찾는 것!
			} else if(score[i] < min) { // 마찬가지로 min값을 하나하나 비교해서 최소값을 min변수에 초기화시켜 최소값을 찾음
				min = score[i];
			}
		} // end of for
		System.out.println("최대값은 : "+ max);
		System.out.println("최소값은 : "+ min);
	}
}
