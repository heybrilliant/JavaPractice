package SelfStudy;

class Car{
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto 자동, manual 수동
	int door;			// 문의 개수 

	Car() {}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}	

public class ch6_24_CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();  	// 생성자 Car()를 사용하면 인스턴스 생성 후
		c1.color = "white";		// 인스턴스 변수들을 따로 초기화 해주어야함
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white","auto",4); // 매개변수가 있는 생성자 -> 인스턴스를 생성하는 동시에 원하는 값으로 초기화를 할 수 있게 됨
		// 매개변수를 갖는 생성자를 사용하는 것이 코드를 보다 간결하고 직관적으로 만듬
		
		System.out.println("c1의 color = "+ c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = "+ c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
		
	}
}
