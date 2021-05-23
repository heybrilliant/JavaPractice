
//메뉴를 보여주고 선택하게 하는 예제
import java.util.*;

public class sh4_32 {
	public static void main(String[] args) {
		int menu = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("(1)square");
			System.out.println("(2)square root");
			System.out.println("(3)log");
			System.out.println("원하는 메뉴 (1~3)를 선택하세요.(종료 :0)>");

			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);

			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("잘못 입력하셨습니다.(종료는 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 "+ menu +"번 입니다.");
		}

	}
}
