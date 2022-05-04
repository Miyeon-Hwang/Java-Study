package example01;

// 상속의 장점
// 코드의 재사용성 : 공통된 코드는 조상에서 관리. 개별적인 부분만 자손에서 별도로 관리하겠다
public class Circle extends Shape{
	
	Point center; // 포함 : 단일 상속만 허용하는 자바에서 다중 상속을 대체하기 위한 방법!
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
