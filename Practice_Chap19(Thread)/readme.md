## Process
  * 실행 중인 하나의 프로그램. 프로그램의 인스턴스
  * 프로그램은 정적, 프로세스는 동적인 상태
  * 메모리에 적재되고 CPU 자원을 할당받아 프로그램이 실행되고 있는 상태

## Multi tasking
  * 두 가지 이상의 작업을 동시에 처리하는 것
  * OS를 통해 CPU가 작업하는데 필요한 자원(시간)을 프로세스 또는 스레드간에 나누는 행위
  * 구현 방법
    - 멀티 프로세스 : '독립적인 프로그램'을 여러 개 실행하고 작업을 처리하는 것
    - 멀티 쓰레드 : 하나의 프로세스 내에서 여러 작업을 처리하는 것 <-> 싱글쓰레드

## Main Thread
 * 자바 프로그램은 JVM의 Main Thread가 main()을 실행하면서 시작
 * Main Thread에서 별도 작업 Thread를 만들어서 병렬로 코드를 실행할 수 있음 -> 멀티쓰레드

## Process의 종료
  * 싱글스레드 : 메인 쓰레드가 종료되는 시점
  * 멀티스레드 : 마지막 쓰레드 실행이 종료되는 시점
    - 메인 스레드가 작업 스레드보다 먼저 종료되더라도 마지막 작업 스레드가 종료되어야 프로세스 종료

## 작업 스레드 생성 및 실행 => C#이랑 유사. 자세한건 실습 참고
  * Runnable 인터페이스 : Run() 추상 메서드 하나만 가짐. 작업 스레드가 실행할 코드를 Run메서드에 오버라이딩
  * Thread 클래스 : Runnable 인터페이스를 구현함.
  * 생성 방법
    1. Runnable 인터페이스를 구현한 객체를 Thraed 생성자 매개변수로 넘겨줌.
    2. Thread를 상속하는 클래스를 구현하여 생성
  * 실행 : Thread 객체 start()를 호출하면 작업 스레드 시작하며 run() 수행

## 동시성과 병렬성
  * 동시성(Concurrency)
    - 하나의 코어에서 CPU 스케줄러에 의해 멀티 쓰레드를 번갈아가며 실행하는 성질
  * 병렬성(Parallelism)
    - 멀티 코어에서 개별 쓰레드를 독립적으로 맡아 실행하는 성질

## 스레드 스케줄링(CPU 스케줄링)
  * 스레드의 개수가 코어의 개수보다 많은 경우, 하나의 코어에서 동시성을 위해 스레드를 실행할 순서를 결정
  * 특정 스레드를 실행하다가 대기상태롣 돌리고 다른 스레드를 수행하고를 반복(각 스레드를 번갈아가며 run() 메서드를 조금씩 수행)
  * 전환속도가 매우 빠르므로 사람은 동시에 진행하는 것 처럼 느끼는 것
  * 스케줄링 방식
    - 순환 할당 방식(Round-Robin)
      - 자바의 기본적 스케줄링 방식
      - 시간 할당량(time slice)를 정해서 하나의 스레드를 정해진 시간 만큼 CPU가 실행하는 방식
      - 코드로 제어할 수 없음
    - 우선순위 방식(Priority)
      - 1 ~ 10까지 우선순위를 사용자가 정할 수 있음(기본은 5)
      - 우선 순위가 높은 스레드가 실행 상태를 더 많이 가지도록 스케줄링하여 빨리 종료될 수 있게 함(100%는 아님)
      - 코드로 제어 가능(Thread.MAX_PRIORITY, Thread.NORM_PRIORITY, Thread.MIN_PRIORITY)

## 공유객체
  * 멀티 스레드가 하나의 객체를 공유하는 것
  * CPU 스케줄링에 따라, 스레드 간에 공유객체에 임의로 접근하게 되면서 값을 변경할 수 있으므로 데이터의 신뢰성이 없어짐. 원하는 결과를 얻지 못할 수 있음.
  * ![image](https://user-images.githubusercontent.com/102529294/172100001-9c83a824-34de-4eb0-94ea-9fc845df70b6.png)
    
  ### => 동기화를 통해 해결!
  ### JVM 은 상호배제를 위해 Monitor를 사용함.

## 동기화 메서드 / 동기화 블럭
  * 임계영역(Critical Section)
    - 둘 이상의 스레드가 동시에 접근하면 안되는 공유자원에 접근하는 코드의 범위
  * 동기화
    - 한 스레드가 다른 스레드의 간섭을 받지 않도록, 공유자원에 한번에 하나의 스레드만 접근할 수 있게 하는 방식
    - 임계영역에서 스레드가 순서를 갖춰 자원을 사용하도록 함
    - 데이터의 무결성 보장!
  * synchronized 키워드
    - "메서드나 블록"(공유자원에 접근하는 코드)이 하나의 스레드만 실행하도록 함. 공유자원에 lock을 걸어줌
    - 다른 스레드는 해당 메서드나 블록이 끝날 때까지 대기함
  * ![image](https://user-images.githubusercontent.com/102529294/172100127-cbea7c87-4f96-4178-93da-dcdd0acc8a30.png)
  
## Thread State
  * 일반적으로, 스레드 생성 후 start()가 호출되면 실행대기(Runnable) 상태가 되고 스케줄러에 따라 실행과 실행대기상태를 반복하다가 run() 종료와 함께 스레드 종료.
  * 한 번 실행되어 종료된 스레드는 재사용 할 수 없음.(이미 TERMINATED 상태가 되었기때문)
  * State 구분
    - 객체 생성(NEW) : 스레드 객체 생성. start() 전
    - 실행 대기(RUNNABLE) : start()호출 시에 변경되는 상태. 실행 상태로 언제든 갈 수 있는 상태
    - 일시 정지
      - BLOCKED : lcok이 걸린 객체를 기다리는 상태(synchronized메서드, 블록)
      - WAITING : 다른 스레드가 통지할 때까지 무한정으로 기다리는 상태(Object.wait(), notify(), notifyAll())
      - TIMED_WAITING : Thread.sleep() 주어진 시간동안 기다리는 상태
    - 종료(TERMINATED) : 실행을 마친 상태

## 스레드 상태 제어
  * Thread.sleep() : milli seconde 단위, 1/1000초
  * Thread.yield()
    - 실행중인 스레드가 Runnable 상태인 다른 스레드에게 실행 양보(스레드에서 무의미한 반복을 수행하는 등의 구간에서 사용하면 CPU의 자원 소모를 방지할 수 있음)
    - yield가 호출되었다고해서 즉시 양보가 일어나는 것은 아님. 스케줄러에 힌트만 제공하는 것.
    - 실행중인 스레드 상태는 Runnable로 변경됨 => 스케줄러에 의해 언제든 다시 호출됨(실행대기 상태이므로)
  * join()
    - 다른 스레드의 종료까지 TIMED_WAITING 상태로 기다림. 
    - 스레드에서 A 스레드를 실행시키고 자신은 TIMED_WAITING 상태가 되고 A 스레드 실행이 끝나면 RUNNABLE 상태가 되어 스케줄러에 의해 실행됨.
  * wait(), notify(), notifyAll()
    - 공유 객체를 사용하는 스레드간의 협업이 목적. (ex) 공유 객체를 사용하는 두 개의 스레드가 교대로 번갈아 가며 실행해야 하는 경우
    - "동기화 메서드 또는 블록(synchronized)에서만 호출 가능"한 Object의 메서드
    - wait() : 호출한 스레드는 BLOCKED 상태가 됨. 다른 스레드가 notify(), notifyAll()을 호출해야 RUNNABLE 상태가 됨.
    - notify() : 같은 object 내에 대기하고 있는 스레드가 있으면 그 중 하나를 깨움(랜덤). notifyAll()은 전부 깨우는 것
  * interrupt()
    - 일시 정지 상태에서 interrupt()가 호출되면 InterruptedException이 발생되며 스레드가 사용한 자원을 정리할 시간을 주고 빠져나오게 된다.
    - 실행대기 or 실행 상태에서는 InterruptedException이 발생하지 않음!! => interrupted boolean 값을 리턴하는 정적 메서드Thread.interrupted() or 인스턴스메서드 objThread.isinterrupted()를 사용하여 Interrupt() 호출 여부를 확인하고 빠져나오도록 구현

## Daemon Thread
  * 주 스레드의 작업에 보조적인 역할을 수행하는 스레드(종속적) (ex) 자바 GC, 메일 작성 시 자동 저장하는 기능 등
  * 주 스레드가 종료되면 데몬 스레드는 강제적으로 자동 종료
  * 설정 : 데몬 스레드 start() 호출 전에 setDaemon(true) 호출

## Thread Group
  * 연관있는 스레드를 묶어서 관리할 목적으로 사용 => 스레드 그룹에 속한 스레드 일괄 interrupt() 호출 가능
  * 계층적으로 하위 스레드 그룹을 가질 수 있음
  * 스레드는 반드시 하나의 스레드 그룹에 포함됨. 기본적으로 자신을 생성한 스레드와 같은 그룹.
  * JAVA 기본 스레드 그룹
    - system 그룹 : JVM 운영에 필요한 스레드 포함
    - system.main 그룹 : 메인 스레드 포함
  ```
  // Thread Group명 얻기
  String threadGroupName = Thread.currentThread.getThreadGroup().getName();
  
  // Thread Group 생성 -> Thread 객체 생성할 때 매개변수로 넘어주어 그룹 지정
  // parent 그룹 지정하지 않으면 현재 스레드가 속한 그룹의 하위그룹으로 생성
  ThreadGroup tg = new ThreadGroup(String name);
  ThreadGroup tg = new ThreadGroup(ThreadGroup parent, String name);
  ```
  
## Thread Pool
  * 스레드 폭증
    - 병렬 작업 처리가 많아지면 스레드 개수가 증가 -> 스레드 생성/스케줄링으로 인해 CPU, 메모리에 부하 -> 어플리케이션 성능 저하 
    - (ex) 웹 서버 접속량이 폭증(스레드 폭증)하여 서버가 다운되는 경우
  * 스레드 풀
    - 작업 처리에 사용되는 스레드를 "제한된 개수"만큼 미리 생성
    - 작업 Queue에 작업들을 쌓고 스레드가 작업을 하나씩 맡아서 처리. 끝나면 결과를 리턴(어플리케이션으로 전달). 큐에서 새로운 작업 꺼내서 처리
    
## Thread Pool 생성/종료
  * ExecutorService 인터페이스 / Executors 클래스
    - 스레드 풀을 생성, 사용하기 위해 자바에서 제공
    - Executors의 정적 메서드를 이용하여 ExecutorService 구현 객체 생성 -> ExecutorService 객체가 스레드 풀
      - Executors.newCachedThreadPool()
        - 초기 스레드 수: 0, 코어 스레드 수: 0, 최대 스레드 수: Integer.MAX_VALUE(OS 메모리 상황에 따라 달라짐)
        - 추가된 스레드가 60초 동안 아무 작업을 하지 않으면 해당 스레드를 종료하고 풀에서 제거 => 잘 사용하지 않음
      - Executors.newFixedThreadPool(int nThreads)
        - 초기 스레드 수: 0, 코어 스레드 수: nThreads, 최대 스레드 수: nThreads
        - 한번 생성된 스레드는 제거되지 않고 유지 => CPU, 메모리에 부하를 주지 않기 위한 스레드 풀의 목적에 부합
       
   ![image](https://user-images.githubusercontent.com/102529294/172180332-dae2debf-ca02-423f-89ef-5d3ff7706cd2.png)
   
  * 스레드 풀 종료
    - 스레드 풀의 스레드는 데몬 스레드가 아님 -> 메인 스레드가 종료되더라도 스레드 풀 스레드는 작업 처리를 위해 계속 실행 -> 어플리케이션 종료되지 않음
    - 스레드 풀 종료를 위해 모든 스레드를 종료시켜야 함
    - 종료 메서드
      - shutdown() : 처리 중인 작업, 큐에 대기중인 작업을 모두 처리한 후에 스레드 풀을 종료
      - shutdownNow() : 처리 중인 작업은 interrupt하여 중지하고 스레드 풀을 중료. 작업큐에 남은 미처리된 작업(Runnable 객체 목록) 리턴 
      - awaitTermination(long timeout, TimeUnit unit) : shutdown()을 호출한 후, 매개변수로 주어진 timeout 내에 모든 작업을 완료하면 True, 아니면 작업중인 스레드 interrupt하고 false 리턴

## Thread Pool 작업 생성/처리
  * 작업 생성
    - 하나의 작업은 Runnable / Callable 객체
    - Runnable은 리턴값 없음. Callable은 리턴값 있음(Generic 타입)
  * 작업 처리 요청
    - ExecutorService의 작업 큐에 Runnable / Callable 객체를 넣음
    - execute(Runnable command) : Runnable을 작업 큐에 저장. 작업 처리 결과를 받지 못함
      - 예외 발생 시 : 스레드 즉시 종료 후 풀에서 제거.
    - submit(Runnable or Callable<V> task) : Runnable, Callable 둘 다 사용 가능. Future 객체(지연완료 객체) 리턴(블로킹 방식으로 작업완료 통보 받음)
      - submit(Runnable task, V result) 오버로딩 메서드도 있음. 리턴값이 없는 Runnable 작업에서 결과를 외부 객체 result에 저장해줌.
      - 예외 발생 시 : 스레드 종료되지 않고 다음 작업에 재사용 => submit 사용이 나음. 스레드 다시 생성하기 위한 CPU, 메모리 작업이 필요 없기 때문

    ### Future 객체 : 지연완료 객체. submit()을 호출하면 즉시 Future 객체가 리턴되나 결과값은 없음. 작업의 결과가 나올때까지 기다렸다가 get()으로 결과값을 확인.
    ### 블로킹 : 스레드 작업 완료를 위해 기다리는 것


