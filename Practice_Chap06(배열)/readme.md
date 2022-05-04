## 자바의 메모리 구조
  * Static 영역 (Class 영역)
    - 전역변수, static 멤버변수 및 메소드, class 정보(메소드, 멤버변수 이름만) 
    - 프로그램 시작과 함께 할당, 프로그램 종료 시 소멸
  * Stack 영역
    - main을 포함한 메서드 호출 시 지역변수, 매개변수 등을 저장.
    - LIFO(Last In First Out) 구조로, 실행순서대로 쌓인다고 생각
  * Heap 영역 (사용자 메모리 영역)
    - 객체, 배열 (new 동적 할당!)
    - 사용되지 않는 메모리는 JVM 내의 GC에 의해 해제됨

## Array
  * 배열의 원소에 대한 메모리는 heap에 연속적으로 할당됨
  ![image](https://user-images.githubusercontent.com/102529294/165903121-8b8641cf-b233-47fe-937d-dcea9606f58e.png)
  
  * 선언만으로는 변수만 생성됨(stack 영역). new를 해줘야 heap에 메모리가 할당되고 초기화도 가능.
  * 배열의 단점
    - 사이즈를 변경할 수 없다(정적이다) -> vector나 arraylist class 가 있음.
    - 메모리의 낭비
    - 같은 타입이어야 한다(이를 해결한게 struct 인데 자바는 제공 X)

## 2차원 배열 (그 이상도 가능)
  ```
  int[][] arr = new int[5][5]; 
  ```
  * arr도 주소값(stack 영역), arr[i]도 주소값이다!(heap영역) => arr[i]는 각 행의 첫번째, 즉 arr[i][0]의 주소값을 가지는 것
  
    ![image](https://user-images.githubusercontent.com/102529294/165930827-b893bd39-050c-4ed7-a013-bbef647e6c42.png)


## 배열 복사
  1. for 문 사용
  2. System.arraycopy() : 빠름
  3. Arrays 클래스(배열을 다루는 util 클래스)의 copyof(), copyofRange()

## 배열 for
  ``` 
  int vals[] = new int[5];
  for (int val : vals)
  {
      System.out.print(" " + i);
  }
  ```
