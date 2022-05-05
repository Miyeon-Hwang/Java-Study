package example02;

class Block {
	
	static int staticNum = 0;
	int instanceNum = 0;
	
	// 1. 인스턴스 초기화블럭, 인스턴스가 생성될 때마다 호출(new). 메모리 힙영역에 올라감
	// 왜사용? 가독성! 복잡한 초기화 코드를 초기화블럭에 작성해주면 가독성 좋아짐.
	{
		System.out.println();
		staticNum++;
		instanceNum = staticNum;
		System.out.printf("인스턴스 초기화블럭 실행됨. static = %d, instance = %d\n", staticNum, instanceNum);
	}
	
	// 2. 정적초기화 블럭, 단 한번 수행됨. 메모리 클래스 영역에 올라감
	static {
		System.out.println("정적 초기화블럭 실행됨");
	}
	
	public Block() {
		System.out.println("생성자 호출");
	}
}

public class BlockEx {

	// 3. 초기화 순서
	// 클래스 변수 : 변수타입에 따른 기본값 > 명시적 초기화 > 클래스(정적) 초기화 블럭
	// 인스턴스 변수 : 변수타입에 따른 기본값 > 명시적 초기화 > 인스턴스 초기화 블럭 > 생성자
	public static void main(String[] args) {
		Block b1 = new Block();
		System.out.println("Block.staticNum : " + Block.staticNum + ", b1.instanceNum : " + b1.instanceNum);
		
		Block b2 = new Block();
		
		System.out.println("Block.staticNum : " + Block.staticNum + ", b1.instanceNum : " + b1.instanceNum);
		System.out.println("Block.staticNum : " + Block.staticNum + ", b2.instanceNum : " + b2.instanceNum);
	}

}
