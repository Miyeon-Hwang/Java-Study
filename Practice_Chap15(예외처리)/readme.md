### 알고있는 내용과 동일

## Exception
  * java.lang.Exception class 최고 조상
  * 컴파일에러(일반예외)
  * 런타임에러 : java.lang.RuntimeException 상속하는 exception
  * try-catch-finally 로 예외 처리
  
## throws/throw
* throws
  ```
  public void method() throws Exception { }
  ```
  * method()를 호출한 곳에서 예외처리 하도록 예외 떠넘기기
* throw 
   ``` 
   throw new Exception("exception message!"); 
   ```
  * 강제로 예외 발생 시키기
* throws, throw는 완전 다른 개념임을 알자

## 사용자 정의 예외 클래스
  * 클래스명에 Exception 붙이고(관례) 일반예외, 런타임예외 선택해서 상속(보통 일반예외)
  * 생성자 선언 : Exception 생성자는 message를 매개변수로 받으므로 예외 메세지 작성해서 조상생성자 호출
  
