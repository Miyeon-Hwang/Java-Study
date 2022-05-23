## StringBuffer / StringBuilder 클래스
  * String 클래스는 내부적으로 문자열 수정이 불가함. 새로운 String 객체를 생성하고 리턴하는 것
  ```
  String data = "abc";
  data += "def"; // 기존 "abc"를 사용하는게 아니라 "abcdef"로 새로운 인스턴스가 생성되는 것
  ```
  * Buffer : 데이터를 임시로 저장하기 위한 작은 공간. 입출력 속도가 굉장히 빨라진다는 장점
  * StringBuffer, StringBuilder 클래스는 버퍼를 이용. String과 달리 버퍼 내부에서 "하나의 인스턴스 문자열"의 추가, 수정, 삭제가 가능
  * StringBuffer는 멀티 스레드 환경, StringBuilder는 싱글 스레드 환경에서 사용


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


## Format 클래스
  * DecimalFormat 클래스(숫자형식) : 0은 자리수(값이 없어도 0을 표시), #도 자리수지만 빈 값은 표시하지 않음
  * SimpleDataFormat 클래스(날짜형식) -> 실습 참고


## StringTokenizer 클래스
  * String.split()과 유사하지만 제시한 구분자 사이에 데이터가 없으면 공백을 리턴
  * StringTokenizer는 구분자 사이에 데이터가 없으면 무시. 다음 단어 리턴
  * countTokens(), hasMoreTokens(), nextToken() 등의 메소드가 있음
  * 속도면에서 빠름


## 날짜 관련 클래스
  * Date 클래스 : TimeStamp 용도로 많이 사용
  * Calendar 클래스 : 달력을 표현한 추상클래스. 싱글톤 객체를 받아와서 사용함 => Calendar.getInstance()


## wrapper(포장) 클래스
  * 8가지 기본타입의 값을 객체로 포장하는 클래스 => collection framework에서 사용하기 위한 용도
  * Boxing(기본형 -> 포장객체), Unboxing(포장객체 -> 기본형 타입 값) => 기본형에 대해서는 컴파일 시 자동으로 박싱, 언박싱 됨
  * parse + "타입명" 정적함수로 문자열을 해당 타입으로 파싱할 수 있음
  * (ex) Byte.parseByte("10") / Boolean.parseBoolean("true")


## System 클래스
  * 프로그램 종료, 입출력, 메모리정리(GC), 시스템속성 읽기, 환경변수 읽기 등
  * System.exit() : 강제적으로 JVM을 종료하고자 할때 사용
  * System.gc() : JVM에게 가능한 빨리 GC를 실행해달라고 요청
  * System.currentTimeMillis(), System.nanoTime() : 프로그램 성능 테스트 용도로 사용
  * System.getProperty() : JVM이 시작할 때 자동으로 설정되는 시스템 속성 값을 가져옴. key-value로 받아옴
    * (ex) System.getProperty("os.name")


## Class 클래스
  * 클래스와 인터페이스의 메타데이터(클래스 이름, 생성자 정보, 필드/메서드 정보 등) 관리
  * 문자열로 된 클래스명으로부터 동적 객체 생성하는 클래스
  * Object.getClass() : 객체로부터 클래스를 얻을 때
  * Class.forName("java.lang.String") : 문자열로부터 클래스를 얻을 때
  * 동적 객체 생성 : 프로그램 실행 중에 클래스를 결정하는 것. Class.newInstance() 사용
    ### 리플렉션!!!
      * 클래스의 생성자, 필드, 메서드 정보 알아내는 것 => 실습 참고
