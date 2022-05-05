### 기본적인 내용은 알고있는 거랑 동일함
### 모든 class 는 object를 상속


# Class 메모리 구조
  * new 연산자로 생성하면 heap에 클래스 멤버들의 바이트 크기의 합만큼 메모리를 할당하고 자료형에 맞게 자동으로 초기화 해줌.
  * Instance 별로 연속적인 메모리를 가지게 됨
```
 Class Time {
  int hour;
  int minute;
  int second;
 }
 
 Time t = new Time(); 
 ```
 ![image](https://user-images.githubusercontent.com/102529294/166187878-6f875ade-4279-4ded-bdde-cea64c46dc7f.png)
   * Class 배열의 메모리 구조는 2차원 배열과 유사함
     ```
     Time[] times = new Time[10];
     ```
     - 위 코드에서는 stack 영역에 times 변수 메모리(주소저장) 할당, heap 영역에 10개의 Time 객체의 주소를 각각 저장할 배열(4byte * 10) 메모리 공간 할당만 됨.
     - new 연산자로 Time 객체를 생성하고 그 주소를 연결해주는 것.

# 접근 한정자
  * private, protected(package내 자식class), default(package 내, 작성 안하면 default), public

# 변수의 범위
  * static 멤버변수(class 변수)
    - 클래스가 메모리에 올라갈 때 생성됨(인스턴스 생성하지 않아도 사용 가능). 프로그램이 종료될 때 소멸됨.
    - 메모리의 static 영역에 올라감. 해당 클래스의 모든 인스턴스들이 공유하는 변수(공유변수!!)
      => 해당 class의 instance가 생성될 때, heap 영역에 static 참조 변수에 대한 메모리도 할당되나 모든 instance의 해당 메모리는 static 변수에 대한 메모리가 할당된 static 메모리 영역의 주소를 가리킨다. 
      => "instance명.static변수명"으로도 접근은 가능하지만 잘못된 방법.
  * instance 멤버변수(필드)
    - new 연산자로 인스턴스 생성 시 생성됨.
  * 지역 변수
    - 메서드가 호출될 때 생성, 메서드 종료 시 소멸. 초기화가 반드시 필요함.

### @ Static Method에서 instance 멤버변수, instance method 사용할 수 없는 이유?
  -> static 메서드는 메모리의 static 영역에 올라가있고 인스턴스 생성없이 접근이 가능하지만 instance 멤버변수나 메서드는 new로 인스턴스가 생성된 이후에만 사용이가능하므로(instance method에서는 static 메서드 호출 가능하지)

# 매개변수
  * 기본형 매개변수 (call by value)
    - 매개변수를 넘겨주는 메서드의 지역변수로 복사가 이루어짐
      => 수정을 해도 호출한 메소드의 값에는 영향 X
  * 참조형 매개변수 (call by reference)
    - 메소드 호출 시에 매개변수로 주소값을 넘겨주는 형태(주소공유)
      => 호출된 메서드와 호출한 메서드에서 같은 주소값을 참조하므로 호출된 메서드에서 수정하면 영향 O
  * return도 위와 동일함!! (참조형 변수가 return 되면 주소값을 return하는 거니까)


# 메서드 오버로딩
  * 매개변수의 수, 타입(순서 포함)이 달라야함. return 타입은 상관없음

# final 
  * class에 붙으면 더이상 확장되지 않는다 -> 상속 불가
  * class의 멤버 변수에 붙으면 초기값을 딱 한 번 지정할 수 있다
    - 멤버 변수 선언시 초기화
    - 생성자에서 멤버 변수 초기화
  * 메서드에 붙으면 override 불가
  * static final 필드
    - 메모리 클래스 영역(static 영역)에서 클래스 별로 관리가 되는 불변의 필드. 공용 데이터


# Constructor
  * 모든 클래스는 하나 이상의 생성자가 있어야 함(메소드 오버로딩) -> 생성자가 없으면 컴파일러가 자동으로 빈생성자를 생성해 줌(생성자가 있으면 컴파일러는 빈생성자 생성하지 않음)
  * 주의할 점!!
    - constructor가 인스턴스를 생성하는 것은 아님. new 연산자가 heap에 인스턴스를 만들고 constuctor가 호출되어 수행코드를 실행.
    - new 연산자의 결과로 인스턴스의 주소가 반환됨.


# this(), this
  * this() 
    - 생성자 내에서 다른 생성자 호출
    - 생성자의 첫 문장에서만 사용할 수 있음.
  * this
    - 인스턴스 자신을 가리키는 참조변수. 모든 인스턴스 메서드에 숨겨진 지역변수로 존재하며 인스턴스의 주소가 저장되어있음
    - new 연산자가 heap에 인스턴스를 할당할 때 활성화 됨!
    - 변수의 모호성을 해결하기 위해 사용 -> 멤버변수와 지역변수(매개변수 포함)간의 구별


# 초기화 블럭(Initialization Block)
  * class의 멤버변수 초기화 방법에는 명시적 초기화(선언시 초기화), constructor, 초기화 블럭 3가지가 있음
  * 초기화 블럭 - 클래스(static) 초기화 블럭, 인스턴스 초기화 블럭, 생성자보다 먼저 실행되며 복잡한 초기화에 사용

  ```
  public class Student {
  
    static {
     // 클래스 초기화 블럭
     // 생성자 이전에 static 변수들의 복잡한 초기화에 사용
     // 클래스가 로딩될 때, 딱 한번 실행됨
    }
   
    {
     // 인스턴스 초기화 블럭
     // 생성자에서 공통적으로 수행되는 복잡한 실행코드를 작성
     // 인스턴스가 생성될 떄마다(new 할 떄마다) 생성자보다 먼저 실행
    }
  }
  ```
  ![image](https://user-images.githubusercontent.com/102529294/166225757-20c42967-45ad-434f-bf70-b614211e4936.png)

# 싱글톤 (Singleton)
  * 하나의 어플리케이션에서 단 하나의 인스터스만 생성하겠다
  * 왜?? 
    - 어플리케이션에서 하나의 객체로 공유되어야하는 정보가 있음.
    - ex) 사용자 환경설정이나 OS에서 시간, 날짜에 대한 정보 -> 여러개의 인스턴스를 만들 필요가 없음.
  ```
  public class User {
    // 1. 외부에서 접근 못하도록 private으로 선언. static으로 공유할 하나의 인스턴스 선언
    // 메모리 static 영역에 singleton 참조변수가 할당되고 new로 할당된 heap의 User 객체에 대한 메모리 주소를 참조함.
    private static User singletone = new User();
    
    // 2. 외부에서 new 연산자로 인스턴스 생성하지 못하게 private 생성자로 막기
    private User() { }
    
    // 3. private 정적 멤버의 주소를 넘겨주기 위한 정적 메서드 제공
    // static 영역의 singleton 참조 변수가 가리키고 있는 heap 영역의 주소를 넘겨주는 것
    public static User getInstance() {
      return User.singleton;
    }
  }
  ```
  
  
  
