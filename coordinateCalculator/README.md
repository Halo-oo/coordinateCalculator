# 좌표 계산기
입력한 좌표값의 case에 따라  
1️⃣ 두 점 사이의 거리,   
2️⃣ 삼각형 넓이,   
3️⃣ 사각형의 넓이를 계산하여 출력한다.


### 📌 case. 공통사항
- 쉼표(,)로 x값과 y값을 구분한다.
- 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
- x, y 좌표 모두 최대 24까지만 입력할 수 있다.
- 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
- 정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.

## case_1. 📈 두 점 ↔️ 사이 거리
좌표값을 두 개 입력한 경우,   
두 점을 있는 직선으로 가정하여 두 점 사이 거리를 계산해서 출력한다.

(입력값)   
좌표를 입력하세요.
(10,10)-(14,15)

(출력값)   
두 점 사이 거리는 6.403124

## case_2. 🔺 삼각형 넓이
좌표값을 세 개 입력한 경우,   
세 점을 연결하는 삼각형으로 가정하여 삼각형의 넓이를 계산하여 출력한다.

(입력값)   
좌표를 입력하세요.
(10,10)-(14,15)-(20,8)

(출력값)   
삼각형 넓이는 29.0

## case_3. 🟨 사각형 넓이
좌표값을 네 개 입력한 경우,   
네 점을 연결하는 사각형으로 가정하여 삼각형의 넓이를 계산하여 출력한다.
- 네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용하도록 검사한다.


(입력값)   
좌표를 입력하세요.
(10,10)-(22,10)-(22,18)-(10,18)

(출력값)   
삼각형 넓이는 96


## ✳️ 프로그래밍 요구사항# 좌표 계산기
입력한 좌표값의 case에 따라  
1️⃣ 두 점 사이의 거리,   
2️⃣ 삼각형 넓이,   
3️⃣ 사각형의 넓이를 계산하여 출력한다.


### 📌 case. 공통사항
- 쉼표(,)로 x값과 y값을 구분한다.
- 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
- x, y 좌표 모두 최대 24까지만 입력할 수 있다.
- 입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
- 정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.

## case_1. 📈 두 점 ↔️ 사이 거리
좌표값을 두 개 입력한 경우,   
두 점을 있는 직선으로 가정하여 두 점 사이 거리를 계산해서 출력한다.

(입력값)   
좌표를 입력하세요.
(10,10)-(14,15)

(출력값)   
두 점 사이 거리는 6.403124

## case_2. 🔺 삼각형 넓이
좌표값을 세 개 입력한 경우,   
세 점을 연결하는 삼각형으로 가정하여 삼각형의 넓이를 계산하여 출력한다.

(입력값)   
좌표를 입력하세요.
(10,10)-(14,15)-(20,8)

(출력값)   
삼각형 넓이는 29.0

## case_3. 🟨 사각형 넓이
좌표값을 네 개 입력한 경우,   
네 점을 연결하는 사각형으로 가정하여 삼각형의 넓이를 계산하여 출력한다.
- 네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용하도록 검사한다.


(입력값)   
좌표를 입력하세요.
(10,10)-(22,10)-(22,18)-(10,18)

(출력값)   
삼각형 넓이는 96


## ✳️ 프로그래밍 요구사항
- 자바 코드 컨벤션을 지키면서 프로그래밍 한다.
    - 기본적으로 Google Java Style Guide을 원칙으로 한다.
    - 들여쓰기는 '4 space'
- indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다.
    - ex) if문 안에 if문 택
    - hint) depth를 줄이기 좋은 방법은 함수로 분리하면 된다.
- 함수가 한 가지 일만 하도록 최대한 작게 만든다.
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- else 예약어를 사용하지 않는다. ❌
    - switch/case 또한 허용하지 않는다.
    - hint) if 조건절에서 값을 return 한다.
- 3항 연산자를 사용하지 않는다. ❌
- 로직에 단위 테스트를 구현한다.
    - 필수가 아닌 선택사항.
    - UI(System out, System in) 로직은 제외해도 된다.



- 자바 코드 컨벤션을 지키면서 프로그래밍 한다.
    - 기본적으로 Google Java Style Guide을 원칙으로 한다.
    - 들여쓰기는 '4 space'
- indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다.
    - ex) if문 안에 if문 택
    - hint) depth를 줄이기 좋은 방법은 함수로 분리하면 된다.
- 함수가 한 가지 일만 하도록 최대한 작게 만든다.
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- else 예약어를 사용하지 않는다. ❌
    - switch/case 또한 허용하지 않는다.
    - hint) if 조건절에서 값을 return 한다.
- 3항 연산자를 사용하지 않는다. ❌
- 로직에 단위 테스트를 구현한다.
    - 필수가 아닌 선택사항.
    - UI(System out, System in) 로직은 제외해도 된다. 


