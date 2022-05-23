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
		System.out.println("method1 ȣ���");
	}
	
	public int method2(int a) {
		System.out.println(a);
		return a;
	}
}

public class ClassEx {

	public static void main(String[] args) {
		
		// ��ü�κ��� Ŭ���� ������ ��� ���
		// Object Ŭ������ getClass()
		Person person = new Person();
		Class class1 = person.getClass();
		
		System.out.println(class1);
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());
		
		
		System.out.println("========================");
		// ���ڿ��κ��� Ŭ���� ������ ��¹�� + ���� ��ü ���� + Reflection
		// Class Ŭ������ forName()
		try 
		{
			Class class2 = Class.forName("classExample.Person");
			//I i1 = (I)class2.newInstance(); // �� �޼ҵ�� ���� ��ü ������ ����� deprecated
			I i1 = (I)class2.getDeclaredConstructor().newInstance(); // �����ڸ� ���ؼ� ���� ��ü �򵵷�
			i1.method1();
			
			
			System.out.println("������ ����-------------");
			Constructor[] cs = class2.getConstructors();
			for (Constructor c : cs) {
				System.out.print(c.getName() + " : ");
				
				for (Class p : c.getParameterTypes()) {
					System.out.print(p.getSimpleName() + " ");
				}
				System.out.println();
			}
			
			
			System.out.println("�ʵ�����------------------");
			for (Field f : class2.getDeclaredFields()) {
				System.out.print(f.getType() + " : ");
				System.out.println(f.getName());
			}
			
			
			System.out.println("�޼��� ����-------------------");
			for (Method m : class2.getMethods()) {
				System.out.print(m.getName() + "(), ����Ÿ�� : ");
				System.out.println(m.getReturnType().getSimpleName());
				System.out.println("�Ķ���� ���� : " + m.getParameterCount());
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
		// ���������� Ȯ���� ���� �߰�
		// Ŭ������.class : Object Ŭ������ static �޼ҵ�, Class Ŭ���� ��ü�� ��������, �⺻���� ���ؼ��� ������
		Class c = int.class;
		System.out.println(c.getName());
		System.out.println(c.isPrimitive());
		
		System.out.println(Integer.class.getSimpleName());
		System.out.println(Integer.class.isPrimitive());
		
		System.out.println(Person.class);
	}
}
