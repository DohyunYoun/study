AndroidStudy.md
<!-- [3. ViewGroup] - 윤도현
5. 리사이클러뷰와 리스트뷰의 차이에 대해 설명하시오.
    1. ViewHolder 패턴에 대해서 설명
19. ConstraintLayout을 사용해야 하는 이유가 무엇인가요?
34. Constraint Layout에 대해서 설명, 기존에 비해 어떤점에서 더좋은가요 -->


## ViewGroup
### 1. RecylcerView와  ListView의 차이에 대해 설명하시오 [ListView vs RecyclerView](https://woovictory.github.io/2019/01/03/Android-Diff-of-ListView-and-RecyclerView/)
   1. ListView(1.0~)
   2. RecyclerView(5.0~)

   * 차이점
   ![](https://woovictory.github.io/img/android_diff_listview_recyclerview.png)
  
      **ViewHolder패턴을 사용한 ListView와 RecyclerView의 성능차이는 없다.

      **Adapter 클래스를 직접 구현하기 때문에 뷰 커스텀 작업이 유연하다.
     
      **ListView는 머리글, 바닥글을 기본적으로 셋팅할수있고 Recyclerview는 구현해야한다. 

### 2. ViewHolder 패턴에 대해 설명하시오
 [ViewHolder란?](https://developside.tistory.com/88)
- ListView / RecyclerView 는 inflate를 최소화 하기 위해서 뷰를 재활용 하는데, 이 때 각 뷰의 내용을 업데이트 하려면 findViewById 를 매번 호출 해야한다. 이로 인해 성능저하가 일어남에 따라 ItemView의 각 요소를 바로 엑세스 할 수 있도록 저장해두고 사용하기 위한  **각 뷰를 보관하는 Holder 객체**이다

※ inflate? : xml 로 쓰여있는 View의 정의를 실제 View 객체로 만드는 것을 말함.
- ViewHolder Pattern
![](https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile30.uf.tistory.com%2Fimage%2F995D8D445BA04C8E07D0DC)
getTag(), setTag()로 뷰를 재사용하여, 데이터의 값(position)을 변경한다.

### 3. ConstraintLayout을 사용해야 하는 이유가 무엇인가요?
   1. ConstraintLayout이란
   
         : ConstraintLayout은 복잡한 레이아웃을 단순한 계층 구조를 이용하여 표현할 수 있는 ViewGroup이다.
         형제 View들과 관계를 정의해서 레이아웃을 구성한다는 점이 RelativeLayout과 비슷하지만,
         보다 유연하고 다양한 기능을 제공한다. (ex. 두 View를 위 아래로 컨테이너 중앙에 배치하기등)
[참고](https://beomseok95.tistory.com/305#ConstraintLayout%EC%9D%B4%EB%9E%80_)
   2. 기존에 비해 어떤점이 더 좋은지
   
         : RelativeLayout의 "상대적 위치 관계에 따른 배치" 특성에 LinearLayout의 "가중치(weight)가 가진 장점"을 적용하고, 체인(chain) 사용으로 다른 레이아웃 없이 "요소들을 그룹화"할 수 있다.

         : 뷰 계층을 간단하게 구성하여 유지보수가 용이하며 성능면에서 우수하다.

