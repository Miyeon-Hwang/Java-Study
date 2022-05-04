package example01;

// ����� ����
// �ڵ��� ���뼺 : ����� �ڵ�� ���󿡼� ����. �������� �κи� �ڼտ��� ������ �����ϰڴ�
public class Circle extends Shape{
	
	Point center; // ���� : ���� ��Ӹ� ����ϴ� �ڹٿ��� ���� ����� ��ü�ϱ� ���� ���!
	int radius;
	
	public Circle() {
		this(new Point(), 100);
	}
	
	public Circle(Point center, int radius) {
		System.out.println("Circle full constructor");
		this.center = center;
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("color : " + this.color);
		System.out.printf("center : x = %d, y = %d\n", this.center.x, this.center.y );
	}
}
