## Generic 개요
  * 타입을 parameter화 하여, 실행 시에 구체적으로 특정 타입으로 결정하는 것
  * 컴파일 시에 강한 타입 체크를 할 수 있고, 타입변환(Casting)을 사전에 제거함(타입변환이 자주 일어나면 application 기능이 떨어짐)
    - (ex) List<Integer>로 Integer형만 add 할 수 있도록 강제하며 각 요소를 받을 때 타입변환을 해줄 필요가 없음
  
## Generic 개념 및 선언
  * 개념 : 타입을 파라미터로 갖는 클래스 또는 인터페이스
  * 선언 : 클래스(or 인터페이스) 이름 뒤에 <타입파라미터>를 붙임. 타입파라미터로는 알파벳 대문자 하나를 사용(주로, T나 E)
    - (ex) public class Box<T> {}
  * 개발단계에서 T의 구체적 타입을 결정해주면 컴파일러가 제네릭 타입 T를 해당 타입으로 대체시킴.
    ### @ Generic 타입은 인스턴스가 생성될 때 결정되므로 static 멤버에서는 선언할 수 없음
  
## 멀티 타입 파라미터
  * Generic은 2개 이상의 타입 파라미터를 사용해서 선언할 수 있음.
   - (ex) public class Student<T,M> {}
  
## Generic 메서드
  * 매개변수나 리턴 타입으로 타입 파라미터를 갖는 메서드
  * 상속, 구현 관계를 이용하여 타입 파라미터를 제한할 수 있음.
  * 사용 : <T extends(or super) 클래스 or 인터페이스명>
  ```
  public static<T> Student<T> changing(T t) {}
 
  // extends => Number 클래스나 그 자손클래스만 T 타입으로 받겠다.
  // method 내에서 타입 파라미터를 변수로 사용할 때는 Number클래스의 멤버에만 접근할 수 있고 
  // 호출될때는 자손클래스에 오버라이딩된 메소드가 호출됨. => 다형성 원칙 동일하게 적용
  public static<T extends Number> Student<T> changing(T t) {}
  ```
 
## 와일드 카드 타입
  * 이미 선언되어 있는 generic 타입을 매개변수나 리턴 타입으로 사용할 때, 타입 파라미터를 제한할 목적으로 사용.
  ```
  // 제한 없음
  public static void registerCourse(Course<?> course) {}
  // 해당 클래스 또는 그 자손클래스만 허용
  public static void registerCourse(Course<? extends Student> course) {}
 // 해당 클래스 또는 그 상위클래스만 허용
 // "super" 는 와일드 카드 타입에만 있음
 public static void registerCourse(Course<? super Student> course) {}
  ```
  ### @ 와일드 카드 타입은 이미 선언이 되어있는 제네릭 타입을 매개변수, 리턴 타입으로 사용할 때, 타입 파라미터를 제한할 때 사용. <T extends(or super) A>는 제네릭 타입 및 메서드 선언 시 타입 파라미터 제한에 사용

## Generic 타입의 상속
  * Generic 타입 클래스나 인터페이스를 상속, 구현하는 클래스도 generic 타입이며 부모의 타입 파라미터를 가진다.
