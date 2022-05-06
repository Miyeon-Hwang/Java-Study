package abstractClass;

// 추상 클래스
public abstract class ContentSender {
	
	private String title;
	private String name;
	
	public ContentSender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 추상 메서드
	public abstract void sendMessage(String recipient, String content);
	
	public void commonMethod( ) {
		System.out.println("test~~~~~~~~~~~~~~~~~~~~~");
	}
}
