package example03;

public class MainArgsEx {
	public static void main(String[] args) {
		// main() �Ű����� Ȱ���ϴ� ���
		// Run > Run Configuration > Arguments ��
		
		if (args.length < 1) {
			System.out.println("Main �޼����� args�� �����ϴ�");
		}
		else {
			for (int i = 0; i < args.length; i++) {
				System.out.println(i + " : " + args[i]);
			}
		}
	}

}
