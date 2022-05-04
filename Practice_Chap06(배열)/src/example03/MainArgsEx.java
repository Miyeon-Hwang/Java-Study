package example03;

public class MainArgsEx {
	public static void main(String[] args) {
		// main() 매개변수 활용하는 방법
		// Run > Run Configuration > Arguments 탭
		
		if (args.length < 1) {
			System.out.println("Main 메서드의 args가 없습니다");
		}
		else {
			for (int i = 0; i < args.length; i++) {
				System.out.println(i + " : " + args[i]);
			}
		}
	}

}
