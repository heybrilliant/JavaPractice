package SelfStudy;

	// 문서의 이름을 지정하면 그 이름의 문서가 생성되지만
	// 문서의 이름을 지정하지 않으면 프로그램이 일정한 규칙을 적용해서 자동으로 이름을 결정하는 코드

class Document {
	static int count = 0;
	String name; // 문서명 (Document name)
	
	Document() { // 문서 생성시 문서명을 지정하지 않았을때
		this("제목없음" + ++count);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서"+ this.name +"가 생성되었습니다.");
	}
}

public class ch6_30_DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt"); // 문서명 지정
		Document d3 = new Document();
		Document d4 = new Document();
	}
}
