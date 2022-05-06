package vector;

public class Board {
	
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public void show() {
		System.out.println("제목 : " + this.subject + ", 내용 : " + this.content + ", 저자 : " + this.writer );
	}
	


}
