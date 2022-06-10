package daemonThreadExample;

public class DaemonEx {
	public static void main(String[] args) throws Exception {
		
		AutoSaveThread ast = new AutoSaveThread();
		
		// ������ start() ȣ������ ���� ������� �������־�� ��
		ast.setDaemon(true);
		ast.start();
		//ast.setDaemon(true); // IllegalThreadStateException �߻�
		
		Thread.sleep(5000);
		
		// daemon �����尡 ���� ������(���� ������)�� ����Ǹ� daemon �����嵵 ���� => ������ ����!
		System.out.println("���� ������ ����");
	}
}
