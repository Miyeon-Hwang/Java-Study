## StringBuffer / StringBuilder 클래스
  * String 클래스는 내부적으로 문자열 수정이 불가함. 새로운 String 객체를 생성하고 리턴하는 것
  ```
  String data = "abc";
  data += "def"; // 기존 "abc"를 사용하는게 아니라 "abcdef"로 새로운 인스턴스가 생성되는 것
  ```
  * Buffer : 데이터를 임시로 저장하기 위한 작은 공간. 입출력 속도가 굉장히 빨라진다는 장점
  * StringBuffer, StringBuilder 클래스는 버퍼를 이용. String과 달리 버퍼 내부에서 "하나의 인스턴스 문자열"의 추가, 수정, 삭제가 가능
  * StringBuffer는 멀티 스레드 환경, StringBuilder는 싱글 스레드 환경에서 사용


## wrapper(포장) 클래스
  * 8가지 기본타입의 값을 객체로 포장하는 클래스 => collection framework에서 사용하기 위한 용도
  * Boxing(기본형 -> 포장객체), Unboxing(포장객체 -> 기본형 타입 값) => 기본형에 대해서는 컴파일 시 자동으로 박싱, 언박싱 됨
  * parse + "타입명" 정적함수로 문자열을 해당 타입으로 파싱할 수 있음
  * (ex) Byte.parseByte("10") / Boolean.parseBoolean("true")


## Objects 클래스
  * Object 클래스를 위한 util 클래스(jdk 1.7부터)
  * 모두 정적메서드로 구성
  * compare, hash(매개변수로 받은 값을 조합하여 해시코드 생성해줌), deepEquals(deepCopy과 유사. 주소가 아닌 값을 비교) 등등   =>   실습 파일 및 java docs 참고


## Arrays 클래스
  * 배열을 조작하기 위한 util 클래스, 모두 정적메서드로 구성
  * binarySearch, copyOf, copyOfRange, deepEquals, fill, sort 등


## 정규표현식 / Pattern 클래스
![image](https://user-images.githubusercontent.com/102529294/169698656-540675bc-6eb3-473e-8a07-00af9debd1c0.png)
  * Pattern 클래스는 정규표현식으로 문자열을 검증할 때 사용.
  * (ex) Pattern.matches(regExp, str)

