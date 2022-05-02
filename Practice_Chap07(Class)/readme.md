### 기본적인 내용은 알고있는 거랑 동일함
### 모든 class 는 object를 상속

## Class 메모리 구조
  * new 연산자로 생성하면 heap에 클래스 멤버들의 바이트 크기의 합만큼 메모리를 할당하고 자료형에 맞게 자동으로 초기화 해줌.
  * Instance 별로 연속적인 메모리를 가지게 됨
  * Class 배열의 메모리 구조는 2차원 배열과 유사함
```
 Class Time {
  int hour;
  int minute;
  int second;
 }
 
 Time t = new Time(); 
 ```
 ![image](https://user-images.githubusercontent.com/102529294/166187878-6f875ade-4279-4ded-bdde-cea64c46dc7f.png)

## 접근 한정자
  * private, protected(package내 자식class), default(package 내, 작성 안하면 default), public

## 변수의 범위
  * static 멤버변수(class 변수)
    - 클래스가 메모리에 올라갈 때 생성됨(인스턴스 생성하지 않아도 사용 가능). 프로그램이 종료될 때 소멸됨.
    - 메모리의 static 영역에 올라감. 해당 클래스의 모든 인스턴스들이 공유하는 변수(공유변수!!)
      => 해당 class의 instance가 생성될 때, heap 영역에 static 참조 변수에 대한 메모리도 할당되나 모든 instance의 해당 메모리는 static 변수에 대한 메모리가 할당된 static 메모리 영역의 주소를 가리킨다. 
      => "instance명.static변수명"으로도 접근은 가능하지만 잘못된 방법.
  * instance 멤버변수(필드)
    - new 연산자로 인스턴스 생성 시 생성됨.
  * 지역 변수
    - 메서드가 호출될 때 생성, 메서드 종료 시 소멸. 초기화가 반드시 필요함.

### Static Method에서 instance 멤버변수, instance method 사용할 수 없는 이유?
  -> static 메서드는 메모리의 static 영역에 올라가있고 인스턴스 생성없이 접근이 가능하지만 instance 멤버변수나 메서드는 new로 인스턴스가 생성된 이후에만 사용이가능하므로(instance method에서는 static 메서드 호출 가능하지)

## 매개변수
  * 기본형 매개변수 (call by value)
    - 매개변수를 넘겨주는 메서드의 지역변수로 복사가 이루어짐
      => 수정을 해도 호출한 메소드의 값에는 영향 X
  * 참조형 매개변수 (call by reference)
    - 메소드 호출 시에 매개변수로 주소값을 넘겨주는 형태(주소공유)
      => 호출된 메서드와 호출한 메서드에서 같은 주소값을 참조하므로 호출된 메서드에서 수정하면 영향 O

  
