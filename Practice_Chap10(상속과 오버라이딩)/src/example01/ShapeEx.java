package example01;

public class ShapeEx {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.draw();
		
		Circle c2 = new Circle(new Point(2, 2), 50);
		c2.color = "red";
		c2.draw();
	}

}
