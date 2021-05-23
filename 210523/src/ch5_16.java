//커맨드라인으로 입력받기 

public class ch5_16 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);
		for(int i=0; i<args.length;i++) {
			System.out.println("args["+ i +"] = \"" + args[i]+"\"");
			
			// 이대로 실행하면 매개변수의 개수:0 으로 출력
			// 커맨드라인 입력하는 법 : Run버튼 옆 작은 삼각형 누르면 아래 [Run Configuration]버튼 누르거나
			// 상단바 Run클릭 후 [Run Configuration]클릭 > Arguments 클릭 후 Program arguments에 입력하고 싶은 값을 입력 
			// 입력한 값은 문자열로 변환 후 넘겨짐 
		}
	}
}
