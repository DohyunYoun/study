import java.util.LinkedList;
import java.util.Queue;

/**
 * 큐 클래스로 구현된 스택과 달리 별도의 인터페이스 형태로 제공됨 1. Deque : LinkedList로 구현되었으며, 가장 자주 사용됨.
 * 2. BlockingDeque 3. BlockingQueue 4. TransferQueue 5. LinkedList를 형변환하여 객체생성
 * 가능
 * 
 * add remove element offer poll peek
 * 
 */
public class BasicQueue{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");

        //PriorityQueue
        //LinkedList
        //Deque
        Queue<String> queue = new LinkedList<String>();
		for(int i=0;i<3;i++)
			queue.add("데이터-"+i); //큐에 데이터를 삽입한다.
		
		//queue = ["데이터-0", "데이터-1", "데이터-2"], front=0, rear=2
		
		System.out.println(queue.peek()); //큐의 front가 가리키는 값을 반환한다.         데이터-0
		System.out.println(queue.poll()); //큐의 front가 가리키는 값을 반환하고 삭제한다.    데이터-0
		System.out.println(queue.isEmpty()); // false
		System.out.println(queue);			//[데이터-1, 데이터-2]
    }
}
