# 숫자 야구 게임

## 진행 방법

* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 미션(요구사항)

### 미션1 : 기능

#### 1. 야구게임

      1~9의 숫자로 이루어진 서로 다른 3자리 숫자를 맞추는 게임

#### 2. 게임 룰

     1. 상대방(컴퓨터)의 서로 다른 3자리 수 설정
     2. 유저는 3자리 숫자 제시
     3. 제시한 수의 확인결과 출력
        - 스트라이크 : 제시한 숫자가 존재 + 자리수가 같을때
        - 볼 : 제시한 숫자가 존재하나 자리수가 다를때
        - 낫싱 : 제시한 숫자가 전부 존재하지 않을때
     4. 정답인 경우 재시작 여부 확인

### 미션2 : 프로그래밍

1. 제약사항 체크
    - [x] 실행 시작점은 src/main/java의 baseball.Application의 main()이다
    - [x] JDK8 실행가능
    - [x] nextstep.utils의 Randoms.pickNumberInRange(), Console.readLine() API 활용
    - [x] 구현 완료시 src/test/java 폴더의 baseball.ApplicationTest에 있는 2개의 testcase 성공
    - [x] [자바 코드 컨벤션](https://naver.github.io/hackday-conventions-java/) 지키면서 프로그래밍
    - [x] indent depth 2가 넘지 않도록 구현
    - [x] stream api 사용금지
    - [x] else 사용금지
    - [x] 함수(메소드)는 라인 수 10 이하로 구현
2. 단위테스트
    - [ ] 도메인 로직에 단위테스트 구현 (UI로직은 제외)
    - [x] 핵심로직과 UI로직 분리
    - [ ] MVC패턴 기반 구현 후 View, Controller를 제외한 Model에 대한 단위테스트 추가

### 미션3 : 과제

#### 1. project fork

- [x] github에서 next-step/java-baseball-precourse fork

#### 2. 구현할 기능 목록 정리

##### 2.1 컴퓨터 숫자 초기화

- [x] 랜덤함수 API 사용하여 1~9 숫자로 이루어진 3자리 숫자 생성 
- [x] validation 통과할때까지 숫자생성 반복

##### 2.2. 숫자예측

- [x] 컴퓨터 숫자 초기화
- [x] API 사용하여 입력받은 숫자 validation 통과할때까지 반복 입력받기 (숫자만, 3자리, 중복)

##### 2.3 두 수를 비교하여 스트라이크, 볼, 낫싱 계산

- [x] 스트라이크 계산
- [x] 볼 계산
- [x] 낫싱 계산

##### 2.4 결과출력

- [x] 숫자 예측결과 콘솔출력

##### 2.5 3스트라이크인 경우 7번 진행, 아닌 경우 [2.2](https://github.com/gbnam/java-baseball-precourse#22-%EC%88%AB%EC%9E%90%EC%98%88%EC%B8%A1) 로 돌아가서 반복

- [x] 기능 반복 로직 구성

##### 2.6 종료 or 재시작([2.1부터 다시시작](https://github.com/gbnam/java-baseball-precourse#21-%EC%BB%B4%ED%93%A8%ED%84%B0-%EC%88%AB%EC%9E%90-%EC%B4%88%EA%B8%B0%ED%99%94)) 선택

- [x] 컴퓨터 숫자 재생성
- [ ] 재시작 여부 선택 콘솔 출력
- [ ] 재시작 or 종료 선택

3. 위 기능 단위로 commit
    - 커밋시 참고 : [the AngularJS commit conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153/)
    - 과제제출 : [제출방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
        - [ ] PR 제출
        - [ ] 메일발송
