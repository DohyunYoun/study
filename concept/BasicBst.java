//cf) 이진탐색
// 탐색의 계산복잡성 : O(log n) && 입력/삭제 불가능
// cf)연결리스트
// 탐색의 계산복잡성 : O(n) && 입력삭제 : O(1)


/* 이진탐색(Binary Search) + 연결리스트(Linked List)
 * 탐색능력                + 자료입력과 삭제
 * 
 * 1. 노드는 왼쪽 자식노드보다 크다.
 * 2. 노드는 오른쪽 자식노드보다 작다.
 * 3. 중복된 노드가 없다.
 * 4. 모든 노드는 위의 조건을 만족한다.
 * 
 * - 중위순회 (왼쪽 노드 -> 노드 -> 오른쪽 노드)
 * - 전위순회 (노드 -> 왼쪽노드 -> 오른쪽 노드)
 * - 후위순회 (왼쪽 노드 -> 오른쪽 노드 -> 노드)
 * 
 * - 검색
 * - 삽입
 * - 삭제
 * - 생성
 * - 삭제
 * - 비어있는지 확인
 * - 트리순회
 */
public class BasicBst{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
}
