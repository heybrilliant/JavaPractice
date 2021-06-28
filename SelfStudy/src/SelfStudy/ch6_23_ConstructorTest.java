package SelfStudy;

class Data1{
	int value;
}

class Data2{
	int value;
	Data2(int x) { // 매개변수가 있는 생성자 
		value = x;
	}
}

public class ch6_23_ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2(); // complie error 발생
// 		Data2 d2 = new Data2(x); 와 같이 정의된 생성자를 같이 호출해줘야 함
	}

}
