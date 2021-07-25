package SelfStudy;

// 배열이나 예회처리가 필요한 초기화에서는 명시적 초기화만으로는 복잡한 초기화 작업을 할 수 없음
// 이런 경우 추가적으로 클래스 초기화 블럭을 사용하도록 함

class ch6_28_StaticBlockTest {
	static int[] arr = new int[10];
	
	static {
		for(int i = 0; i<arr.length;i++) {
			// 1과 10 사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10)+1;
		}
	}

	public static void main(String[] args) {
		for(int i=0; i<arr.length;i++) 
			System.out.println("arr["+i+"] : "+arr[i]);
	}
}
/*

public class ch6_28_StaticBlockTest {

		// TODO Auto-generated method stub

	
}
*/