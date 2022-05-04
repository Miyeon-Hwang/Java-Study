package example01;

public class Point {
	int x;
	int y;
	
	 public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		System.out.println("Point full constructor");
		this.x = x;
		this.y = y;
	}

}
