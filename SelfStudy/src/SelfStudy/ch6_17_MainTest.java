package SelfStudy;

public class ch6_17_MainTest {

	public static void main(String[] args) {
		main(null); // 재귀호출. 자기자신을 다시 호출한다.
	}

}


// main 메소드 역시 자기자신을 호출하는 것이 가능하며 
// 아무런 조건도 없이 계속해서 자기 자신을 호출하기 때문에 무한 호출에 빠지게 된다 -> stackoverflow error 발생 (비정상적 종료 발생)