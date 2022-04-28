#### 기본적으로는 다른 언어와 비슷!!

## 알아야 할 내용만 정리
### Operation Default Type
  1. 연산시에 int보다 작은 타입은 int로 변환 후 연산을 함 : char, byte, short 
  2. 정수형, 실수형 연산 시에는 표현 범위가 넓은 쪽으로 형변환 
      * (ex) byte + float => float + float = float / int + double => double + double = double

### 비트 연산자, shift 연산자 (이참에 제대로 공부해두자)
  1. 비트 연산자 : &, |, ^  (특히 ^ 는 배타적 논리합(exclusive or)로 서로 다르면 1 return)
  2. shift 연산자 : <<(left shift, 2^n 곱), >>(right shift, 2^n 나누기)
    
