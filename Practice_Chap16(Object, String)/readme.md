## java.lang package
  * java project에서 자주 사용되는 클래스가 포함
    - Object, String, Math, System 등등
  * java.lang package는 default로 import 되어있음

## Object 클래스
  * 클래스의 최고 조상. 가장 베이스가 되는.
  * 11개의 메서드가 있음. 중요한거 몇개만 확인
  ### 1. equals()
   - 주소비교하여 boolean값 리턴("=="와 같음)
   - 객체의 논리적 동등
     - 주소가 달라도 저장값이 같으면 같은 객체로 보고자하면 사용자 정의 클래스에서 오버라이딩으로 구현
     - (ex) String 객체는 문자열 값을 비교해서 같으면 true 리턴하도록 오버라이딩 되어있음(주소는 다름)
  ### 2. hashcode()
   - 메모리주소값을 기준으로 갖는 유일한 10진수 생성하여 리턴 -> 기본적으로는 인스턴스마다 다 다름
   - equals()와 동일하게 사용자 정의 클래스에서 주소가 아니라 저장값이 같으면 동일한 hashcode를 생성하도록 오버라이딩해야하는 경우가 있음
     - hashcode를 사용한 collection framework(HashSet, HashMap, HashTable 등등)에서 해싱 기법을 사용할 때, 1차로 hashcode가 같은지 확인, 2차로 equals() true인지 확인하여 같은 객체로 인식함.
     - (ex) String 객체는 문자열 값을 기준으로 hashcode를 리턴하도록 오버라이딩 되어있음
  ### 3. ~~
