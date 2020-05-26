import java.util.Stack;

/**
 * https://freestrokes.tistory.com/83?category=1045118 참고 Stack - 계산기, 뒤로가기 버튼
 * 구현 등
 * 
 * empty peek pop push search 배열로 구현 : 조회가 빠름 / 최대개수를 정해놓아야만 함 링크드 리스트로 구현 :
 * 삽입/삭제가 빠름 / 조회가 어려움
 */
public class StackExample{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        Stack<String> stack = new Stack<String>(); //Generics을 이용하여 Collection이 저장할 데이터 타입 지정
		for(int i=0;i<3;i++)
			stack.push("Hi-"+i); //stack에 데이터를 삽입하는 문장
		
		//stack = ["Hi-0", "Hi-1", "Hi-2"], top=2
		
		System.out.println(stack.pop()); //스택의 꼭대기 값을 반환하고 삭제한다.             Hi-2
		System.out.println(stack.peek()); //스택의 꼭대기 값을 반환한다.                  Hi-1
		System.out.println(stack.search("Hi-1")); //값이 존재하면 1, 아니면 -1을 출력한다.    1
		System.out.println(stack.isEmpty()); //스택이 비어있으면 true을 출력한다.         false
		System.out.println(stack);			//[Hi-0, Hi-1]
    }
//배열로 스택 구현
public class UserArrayStack {

    int top;
    int [] stack;
    int size;

    public UserArrayStack(int size) {
        this.size = size; //
        stack = new int[size];
        top = -1; // top 의 값 초기화
    }

    private void push(int item) {
        stack[++top] = item;
        System.out.println(stack[top] + " push!");
    }

    private void peek() {
        System.out.println(stack[top] + " peek!");
    }

    private void pop() {
        System.out.println(stack[top] + " pop!");
        stack[top--] = 0;
    }

    private int search(int item) {
        for (int i = 0; i <= top; i++) { // for 문은 top 만큼
            if (stack[i] == item)
                return (top - i) + 1; // top - 탐색한 배열의 인덱스, 배열 이므로 +1 추가
        }
        return -1;
    }

    private boolean empty() {
        return size == 0;
    }
}
//링크드리스트로 스택 구현
public class Node {

    private int data;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }

    protected void linkNode(Node node) {
        this.nextNode = node;
    }

    protected int getData() {
        return this.data;
    }

    protected Node getNextNode() {
        return this.nextNode;
    }
}

public class UserLinkedListStack {

    Node top;

    public UserLinkedListStack() {
        this.top = null;
    }

    private void push(int data) {
        Node node = new Node(data);
        node.linkNode(top);
        top = node;
    }

    public int peek() {
        return top.getData();
    }

    private void pop() {
        if (empty())
            throw new ArrayIndexOutOfBoundsException();
        else {
            top = top.getNextNode();
        }
    }

    private int search(int item) {
        Node searchNode = top;
        int index = 1;
        while(true) {
            if (searchNode.getData() == item) {
                return index;
            } else {
                searchNode = searchNode.getNextNode();
                index ++;
                if (searchNode == null)
                    break;
            }
        }

        return -1;
    }

    private boolean empty() {
        return top == null;
    }
}
}
