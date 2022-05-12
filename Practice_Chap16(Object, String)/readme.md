## java.lang package
  * java project에서 자주 사용되는 클래스가 포함
    - Object, String, Math, System 등등
  * java.lang package는 default로 import 되어있음

## Object 클래스
  * 클래스의 최고 조상. 가장 베이스가 되는.
  * 11개의 메서드가 있음. 중요한거 몇개만 확인
  ### 1. equals()
   - 주소비교하여 boolean값 리턴("=="도 주소비교. Object.equals()는 같음)
   - 객체의 논리적 동등
     - 주소가 달라도 저장값이 같으면 같은 객체로 보고자하면 사용자 정의 클래스에서 오버라이딩으로 구현
     - (ex) String 객체는 문자열 값을 비교해서 같으면 true 리턴하도록 오버라이딩 되어있음(주소는 다름)
  ### 2. hashcode()
   - 메모리주소값을 기준으로 갖는 유일한 10진수 생성하여 리턴 -> 기본적으로는 인스턴스마다 다 다름
   - equals()와 동일하게 사용자 정의 클래스에서 주소가 아니라 저장값이 같으면 동일한 hashcode를 생성하도록 오버라이딩해야하는 경우가 있음
     - hashcode를 사용한 collection framework(HashSet, HashMap, HashTable 등등)에서 해싱 기법을 사용할 때, 1차로 hashcode가 같은지 확인, 2차로 equals() true인지 확인하여 같은 객체로 인식함.
     - (ex) String 객체는 문자열 값을 기준으로 hashcode를 리턴하도록 오버라이딩 되어있음
  ### 3. clone()
   - protected method임. 얕은 복사 객체 리턴
   - 오버라이딩 시, java.lang.Clonable 인터페이스를 구현 필수!(아니면 에러남). 깊은복사로 구현하려면 참조변수를 복사하는 코드를 추가해줘야.


## String 클래스
  * equals()
  ![image](https://user-images.githubusercontent.com/102529294/168051296-3d291180-65fc-4677-80ea-33ab9d81be50.png)
  * 그 외 자주사용하는 메서드 및 인코딩, 디코딩 관련 내용은 실습파일 확인
  
