package objectHashcode;

public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		if (obj instanceof Person) {
			Person person = (Person)obj;
			if (this.name.equals(person.name)) {
				return true;
			}
		}
		return false;
	}
	

}
