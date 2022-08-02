### 파이썬 데이터 타입 및 자료구조 알고있는 내용과 동일함!!

### @ 배열의 문제점
  - 배열의 크기를 미리 결정해주어야 함(정적)
  - 불특정 다수를 저장하기에는 문제가 있음.
  - 객체를 삭제하면 해당 인덱스가 비게 되고 빈 곳을 찾아서 새로운 객체를 넣어줘야 함.

## Collection Framework
  * 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 제공되는 컬렉션 라이브러리
  * 객체가 아닌 객체의 주소가 저장되는 것!(2차원 배열과 동일)
  * java.util 패키지에 포함
  * 인터페이스를 통해서 정형화된 방법으로 다양한 컬렉션 클래스 이용

---
## List 컬렉션
  - 배열과 유사하게 인덱스로 관리. 순서 유지, 중복 가능
  - 구현 클래스 : ArrayList, Vector, LinkedList, Stack(Vector의 자손)
  
  ### ArrayList<E>
  * 초기용량 : 10 (따로 지정가능하나 10 이하로 주면 기본적으로 10)
  * 용량을 초과하여 추가되면 자동으로 늘어난다(기본적으로 10개씩 증가)
  * 단점
    * 용량 증가가 내부적으로 보면 배열복사임. 큰 용량의 배열을 생성하고 복사를 하는 것
    * 인덱스 중간에 객체가 추가, 제거가 되면 배열복사가 일어남(한 칸씩 밀리거나 땡겨지거나)
  * 장점
    * 배열 구조이므로 인덱스로 데이터에 접근하는 방식이라 access time이 짧음
    * 순차적인 데이터 추가, 제거에서는 배열복사가 일어나지 않으므로 빠름! (끝부터 추가, 삭제)
    
  ### Vector<E>
  * ArrayList와 동일한 특성(배열 기반). ArrayList의 구버전
  * 기본적으로 스레드 동기화가 되어있음 -> 멀티 스레드 환경에서 vector에 동시에 접근해도 thread-safe함
  
  ### LinkedList<E>
  * 더블 링크드 리스트로 구현되어 있음. (종류 : 싱글 링크드 리스트, 더블 링크드 리스트, 원형 링크드 리스트)
  * 빈번한 객체의 삭제, 삽입이 일어나는 경우 좋은 성능!
  * 데이터에 대한 접근성은 떨어짐(링크를 따라가며 찾아야하므로...)
  * List, Queue, Deque 를 모두 구현함
  
  ### Stack<E>
  * 후입선출(LIFO) (ex) 수식계산, undo/redo, 웹브라우져 뒤로/앞으로 등
  * Vector 클래스를 상속함
  * 용어 : push, pop
  
---
## Set 컬렉션
  - 집합, 순서 없음, 중복 안됨
  - 구현 클래스 : HashSet, TreeSet, LinkedHashSet
  
  ### HashSet<E>
  * 객체들을 순서없이 저장, 동일한 객체는 중복 저장하지 않음
  * Hash 기능과 Set 컬렉션이 합쳐진 것 => 삽입, 삭제, 색인이 매우 빠름
  * 동일한 객체 판단?
    - hashCode() 메소드 비교 -> 같으면 equals() 메소드 확인
  
  ### TreeSet<E>
  * 중복되지 않으면서 **특정 규칙에 의해 정렬**된 형태 (이진트리 기반) => 정렬된 형태로 있다보니 특정 구간의 집합요소들을 탐색할 때 매우 유용
    - 기본 정렬 방식은 부모값과 비교해서 낮은 것은 왼쪽 자식 노드에, 높은 것은 오른쪽 자식 노드에 저장
  * 엄밀히 말하면, Set Interface를 상속받은 SortedSet Interface를 구현
  * subSet() 메소드로 특정 구간의 Set 객체를 받아올 수 있음.
  
  ### LinkedHashSet<E>
  * Set 이지만 저장 순서를 보장함.
  
---
## Queue
  * 선입선출(FIFO) (ex) 작업큐, 메시지큐, 최근사용문서, 인쇄대기목록 등
  * 용어 : 저장은 offer, 꺼내는 건 poll, 꺼내지않고 보기만하는 용도로 peek
  * 구현 인터페이스 : Deque, BlockingDeque, BlockingQueue, TransferQueue
  * Queue/Deque 구현 클래스 : ArrayDeque, PriorityQueue, LinkedList 등
  
  ### Deque<E> 인터페이스
  * Double ended Queue, 양쪽에서 삽입삭제가 가능한 자료구조
  
  ### LinkedList<E> - 많이 사용됨! (실습 참고)
  * List, Queue, Deque 를 모두 구현함

---
## Map
- key-value 쌍(엔트리)으로 관리, 순서 없음, key 중복 안됨
- 구현 클래스 : HashMap, Hashtable, TreeMap 등
- 엄밀히 Map은 컬렉션이 아님(Collection Interface를 구현하지 않음)! 아래는 공식문서 내용
  > Why doesn't Map extend Collection?
  
  >  This was by design. We feel that mappings are not collections and collections are not mappings. Thus, it makes little sense for Map to extend the Collection interface (or vice versa). </br>
  >  If a Map is a Collection, what are the elements? The only reasonable answer is "Key-value pairs", but this provides a very limited (and not particularly useful) Map abstraction. You can't ask what value a given key maps to, nor can you delete the entry for a given key without knowing what value it maps to. </br>
  >  Collection could be made to extend Map, but this raises the question: what are the keys? There's no really satisfactory answer, and forcing one leads to an unnatural interface. </br>
  >  Maps can be viewed as Collections (of keys, values, or pairs), and this fact is reflected in the three "Collection view operations" on Maps (keySet, entrySet, and values). While it is, in principle, possible to view a List as a Map mapping indices to elements, this has the nasty property that deleting an element from the List changes the Key associated with every element before the deleted element. That's why we don't have a map view operation on Lists.

#### @ HashMap<K,V>, Hashtable<K,V> 차이?
* Hashtable 은 컬렉션 프레임워크 이전에 존재하던 클래스. 현재는 호환을 위해 남아있는 정도. HashMap 사용 권장 (Vector, ArrayList도 같은 경우)
* 내부 동작 면에서 차이는 Hashtable은 thread-safe, null 값을 키로 가질수 없음. HashMap은 반대

