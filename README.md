# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 1단계 - 문자열 덧셈 계산기
1. 문자열 또는 NULL 값을 입력할 경우 0반환
2. 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환
    - 숫자가 아닌 경우 "숫자가 아닙니다." 예외 발생 
3. 숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.(예 : "1,2")
4. 구분자를 컴마(,)이외에 (: |) 을 사용할 수 있다.
5. "//" 와 "\n" 문자 사이에 커스텀 구분자를 지정할 수 있다.
6. 음수를 전달할 경우 "음수는 입력 불가능합니다." 예외 발생

## 2단계 - 로또 (자동)
1. 로또 번호 생성
    - 생성 횟수 6개를 넘길경우, "로또는 6개의 번호를 초과할 수 없다." 예외 발생
    - 중복되는 번호가 있을 경우, "로또 번호는 중복이 불가합니다." 예외발생
    - 범위 1 ~ 45 벗어날경우, "로또 번호의 범위를 초과하였습니다." 예외 발생

2. 구입금액 입력
    - 1000의 배수가 아닌 경우 "로또는 1000원 단위로 구매 가능합니다." 예외 발생
    - "금액은 숫자만 입력해주세요."
    - "금액을 다시 입력해주세요."
    
3. 지난 주 당첨 번호를 입력
    - 로또 번호 생성 제약 조건 포함
    - 콤마 구분 (,)
    
4. 당첨 통계 
    - 3개 일치 (5000월) 포함 갯수 출력
    - 4개 일치 (50000원) 포함 갯수 출력
    - 5개 일치 (1500000원) 포함 갯수 출력
    - 6개 일치 (2000000원) 포함 갯수 출력
    - 총 수익률 = (포함갯수 * 상금/구입금액) 
        ㄴ 소수점 두자리까지 표현 
      
## 3단계 - 로또 (2등)

1. 2등을 위해 추가 번호를 하나 더 추첨한다.
   - 보너스 볼을 추가
   - 당첨번호와 중복되는 번호 있을시, "당첨번호와 중복이 불가합니다."예외발생
   

## 4단계 - 로또(수동)

1. 사용자가 수동으로 추첨번호를 입력
   - 수동으로 구매할 로또 수만큼 입력 가능
      - 구입금액 수를 초과할 경우, "수동으로 구매 가능한 로또 수를 초과하였습니다."
      - 숫자만 입력 가능합니다. 
   