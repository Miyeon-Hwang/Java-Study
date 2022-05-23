package classExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

interface I {
	
	public void method1();
}

class Person implements I{
	int age;
	String name;
	static int a;
	
	public Person() { }
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void method1() {
		System.out.println("method1 호출됨");
	}
	
	public int method2(int a) {
		System.out.println(a);
		return a;
	}
}

public class ClassEx {

	public static void main(String[] args) {
		
		// 객체로부터 클래스 정보를 얻는 방법
		// Object 클래스의 getClass()
		Person person = new Person();
		Class class1 = person.getClass();
		
		System.out.println(class1);
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());
		
		
		System.out.println("========================");
		// 문자열로부터 클래스 정보를 얻는방법 + 동적 객체 생성 + Reflection
		// Class 클래스의 forName()
		try 
		{
			Class class2 = Class.forName("classExample.Person");
			//I i1 = (I)class2.newInstance(); // 이 메소드로 동적 객체 생성은 현재는 deprecated
			I i1 = (I)class2.getDeclaredConstructor().newInstance(); // 생성자를 통해서 동적 객체 얻도록
			i1.method1();
			
			
			System.out.println("생성자 정보-------------");
			Constructor[] cs = class2.getConstructors();
			for (Constructor c : cs) {
				System.out.print(c.getName() + " : ");
				
				for (Class p : c.getParameterTypes()) {
					System.out.print(p.getSimpleName() + " ");
				}
				System.out.println();
			}
			
			
			System.out.println("필드정보------------------");
			for (Field f : class2.getDeclaredFields()) {
				System.out.print(f.getType() + " : ");
				System.out.println(f.getName());
			}
			
			
			System.out.println("메서드 정보-------------------");
			for (Method m : class2.getMethods()) {
				System.out.print(m.getName() + "(), 리턴타입 : ");
				System.out.println(m.getReturnType().getSimpleName());
				System.out.println("파라미터 개수 : " + m.getParameterCount());
			}
			Method m1 = class2.getMethod("method1");
			m1.invoke(new Person());
			Method m2 = class2.getMethod("method2", int.class);
			m2.invoke(new Person(), 4);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println();
		System.out.println("==========================================");
		// 개인적으로 확인한 내용 추가
		// 클래스명.class : Object 클래스의 static 메소드, Class 클래스 객체를 리턴해줌, 기본형에 대해서도 동작함
		Class c = int.class;
		System.out.println(c.getName());
		System.out.println(c.isPrimitive());
		
		System.out.println(Integer.class.getSimpleName());
		System.out.println(Integer.class.isPrimitive());
		
		System.out.println(Person.class);
	}
}
