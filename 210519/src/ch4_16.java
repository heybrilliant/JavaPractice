//ch4 예제16번 p162 별10개씩 5줄찍기 
public class ch4_16 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) { 
			for(int j=1;j<=10;j++) { //*10번찍는 반복문
				System.out.print("*"); //println으로 입력하면 별 한개씩 모두 개행됨
			}
			System.out.println(); //* 10개 찍고 줄바꿈 
		}

	}

}
