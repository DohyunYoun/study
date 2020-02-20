/**
 * Linked List
 * 추가/삭제 : O(1)
 * 검색 : O(n)
 * 정렬 : O(nlogn)
 * 
 * 단점 : 특정 위치의 데이터를 검색하는데 O(n) 시간이 소요된다.(cf. 배열, 트리구조)
 * 1. Singly Linked List(단일 연결 리스트)
 *      : 데이터/포인터 공간이 있으며, 포인터는 다음 노드를 가리키다.
 *      - 큐 구현에 사용됨
 *      - head노드를 잃어버릴 경우 데이터 전체를 사용하지 못함.
 *      - FAT 파일시스템
 * 2. Doubly Linked List(이중 연결 리스트)
 *      : 포인터/데이터/포인터 공간이 있으며, 포인터는 각각 이전/다음 노드를 가리킨다.
 *      - 삭제 간편
 *      - 데이터 손상에 강하나, 삽입/정렬의 경우 작업량이 더 많아짐
 * 3. Circular Linked List(원형 연결 리스트)
 *      : 단일연결리스트에 마지막 노드와 처음노드를 연결시킨 구조이다.
 *      - 스트림 버퍼 구현에 사용됨
 */
public class LinkedList{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
    //중간에 노드 삽입
    //끝에 노드 삽입
    //중간 노드 삭제
    //끝 노드 삭제
    //노드 탐색
    //출력
}
