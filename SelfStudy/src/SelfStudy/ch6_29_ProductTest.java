package SelfStudy;

class Product1{
	static int count = 0; // 생성된 인스턴스의 수를 저장하기 위한 변수 
	int serialNo; // 인스턴스 고유의 번호
	
	{
		++count;
		serialNo = count; 
		// Product 인스턴스가 생성될 때마다 count의 값을 하나씩 증가시켜서 serialNo에 저장
	}
	public Product1() {} // 기본생성자, 생략가능
}



public class ch6_29_ProductTest {
	public static void main(String[] args) {
		
		Product1 p1 = new Product1();
		Product1 p2 = new Product1();
		Product1 p3 = new Product1();
		
		System.out.println("p1의 제품번호는 "+p1.serialNo);
		System.out.println("p2의 제품번호는 "+p2.serialNo);
		System.out.println("p3의 제품번호는 "+p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 "+Product1.count+"개 입니다.");
	}

}
