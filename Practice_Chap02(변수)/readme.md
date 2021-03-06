# 개념 정리

## 기본형변수(Primitive Variables)
  - boolean(1byte), char(2), byte(1), short(2), int(4), long(8), float(4), double(8)
  - char는 c에서는 1byte이지만 java에서는 2byte(유니코드)
  - 정수형 default는 int, 실수형 default는 double
  - long은 접미사 l or L을, float는 접미사 f or F를 붙여줘야 인식함 -> 현재는 long 타입은 접미사 안붙여도 인식함. 원칙은 붙여야 함
  - 메모리 할당
    - 기본형 변수는 메모리 스택영역에 데이터 크기만큼 메모리 할당하고 해당 메모리에 값을 저장.

## 참조형변수(Reference Variables)
  - 기본형 변수 8종 외에는 모두 참조형 변수
  - 참조 => 메모리 주소를 저장한다(c++ pointer 개념, 자세한 설명은 아래 변수 메모리 할당에)
  - 변수 메모리 할당
    ```
    String str = new String("java");
    ```
    - 스택영역에 주소값을 저장하기 위한 "4byte"의 메모리가 변수로 할당
    - new로 생성하므로 heap 영역에 String class 크기만큼의 메모리가 할당되고 값을 저장
    - 해당 heap영역의 16진수 주소값을 스택영역 변수에 저장하게 됨. (0x000000 ~ 0xffffff)
    - 주소연결이 끊어진 힙객체는 GC에 의해 정리됨. (C# 이랑 동일하네)

## 오버플로우
  - 1 byte = 8 bit -> 2^8(256)
  - 맨 앞 1bit는 부호이므로 -2^7 ~ 2^7 - 1 (-128 ~ 127)의 범위
  - 127 + 1 = -128 => 128은 byte type이 가질수 없으므로 looping
  - 그럼 int는? 4 byte = 32 bit -> -2^31 ~ 2^31 - 1

## 형변환
  -> 실습코드 참고
