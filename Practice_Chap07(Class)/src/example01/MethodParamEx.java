package example01;

class A {
	int data;
}

public class MethodParamEx {
	public static void main(String[] args) {
		A a = new A();
		a.data = 1;
		System.out.println("�޼��� ȣ�� �� Ŭ���� ��ü�� �ּ� : " + a);
		System.out.println("�޼��� ȣ�� �� ��ü �� data�� �� : " + a.data);
		primitiveParamTest(a.data);
		System.out.println("primitiveParamTest ȣ�� �� data �� : " + a.data); // �޼��� ������ data ���� �ٲ㵵 �Լ� �ۿ����� �������
		System.out.println();
		
		referenceParamTest(a);
		System.out.println("�޼��� ȣ�� �� Ŭ���� ��ü�� �ּ� : " + a);
		System.out.println("referenceParamTest ȣ�� �� data�� �� : " + a.data); // �Ű������� �ּҸ� �Ѱ��� ���̱� ������ �޼��� ���ο����� ������ ������ ��ħ
	}
	
	// 1. Call by Value
	// �Լ��� ���������� ���� �����ϰ� ���� �����ϴ� ����
	public static void primitiveParamTest(int data) {
		System.out.println("���޹��� param data�� �� : " + data);
		data = 5;
		System.out.println("���޹��� param data ���� ���� �� : " + data);
	}
	
	// 2. Call by Reference
	// �迭, Ŭ���� ��ü ���� �������� ���¸� �Ű������� ���� �� �ּҷ� ����.
	public static void referenceParamTest(A a) {
		System.out.println("���޹��� param class ��ü�� �ּ� �� : " + a);
		System.out.println("���޹��� param class ��ü �� data �� : " + a.data);
		a.data = 5;
		System.out.println("���޹��� param class ��ü ���� ���� �ּ� �� : " + a);
		System.out.println("���޹��� param class ��ü ���� �� data �� : " + a.data);
	}
}
