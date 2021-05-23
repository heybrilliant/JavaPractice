//화면에 입력된 숫자만큼 증가하는 별 찍기
import java.util.*;

public class ch4_17 {
	public static void main(String[] args) {
		int num = 0; 
		System.out.println("*을 출력할 라인의 수를 입력하세요. >");
		
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine(); //화면에 입력받은 내용을 temp에 저장
		num = Integer.parseInt(temp); // 입력받은 문자열(temp)를 숫자integer형으로 변환
		
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
