package SelfStudy;


class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매시 제공하는 보너스포인트 
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); 
	}
	Product() {} // 기본 생성자 
}

class Tv extends Product {
	Tv() {super(100);} // 조상 클래스의 생성자 Product(int price)를 호출한다
	public String toString() {return "Tv";}
}

class Computer extends Product {
	Computer() {super(200);} // 조상 클래스의 생성자 Product(int price)를 호출한다
	public String toString() {return "Computer";}
}

class Audio extends Product {
	Audio() {super(50);} // 조상 클래스의 생성자 Product(int price)를 호출한다
	public String toString() {return "Audio";}
}

class Buyer {			// 고객, 물건을 사는 사람
	int money = 1000;   // 소유 금액
	int bonusPoint = 0; // 소유 보너스 포인트
	Product[] item = new Product[10]; 	// 구입한 제품을 저장하기 위한 배열
	int i = 0;			// Product 배열에 사용될 카운터
	
	void buy(Product p) {
		if(money <p.price) {
			System.out.println("잔액이 부족합니다. 물건을 구매할 수 없습니다.");
			return;
		}
		
		money -= p.price;			// 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다
		item[i++] = p;				// 제품을 Product[] item에 저장한다.
		System.out.println("선택한 " + p + "을/를 구매하셨습니다.");
		}
	void summary() { 		// 구매한 물품에 대한 정보를 요약해서 보여준다
		int sum = 0;		// 구입한 물품의 가격 합계
		String itemList = ""; // 구입한 물품 목록
	
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다. 
		
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i]+ ", "; 
		}
		System.out.println("구입하신 물품의 총 금액은 "+sum+"만원 입니다.");
		System.out.println("구매하신 제품은 "+itemList+"입니다.");
	}
}


public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}
}
