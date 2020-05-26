## Kotlin(functional programming)
영속형 구조 차용

인자 안에 T.() 의 의미는 확장함수이다.
확장함수는 바로 호출가능(a.name 이 아니라 그냥 name으로 호출)


let - safe call
run - T만 가지고 계산할때 / 블록안에서만 변수를 사용하고 싶을때
apply - 다른애들은 반활할 수 있지만, 버튼세팅등 자기자신밖에반환 못함. / 빌더랑 유사(마지막에 build 를 하면 결과가 나옴.)
with - non-nullable 수신객체이고 결과가 필요하지 않은 경우에만 with사용

