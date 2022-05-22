package stringBufferBuilder;

public class StringBuilderEx {

	// Builder는 싱글스레드, Buffer는 멀티스레드에서 사용한다는 차이만 있고 나머지는 동일함
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb.hashCode());
		
		sb.append(" study");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.insert(1, "나나");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
		sb.setCharAt(1, 'r');
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		System.out.println(sb.reverse());
		System.out.println(sb);
	}
}
