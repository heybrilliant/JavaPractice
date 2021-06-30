package SelfStudy;

class ch6_27_BlockTest {
	static {
		System.out.println("static {  }"); // 클래스 초기화 블럭
	}
	{
		System.out.println("{  }"); // 인스턴스 초기화 블럭
	}
	public ch6_27_BlockTest() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		ch6_27_BlockTest bt = new ch6_27_BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		ch6_27_BlockTest bt2 = new ch6_27_BlockTest();
	}
}