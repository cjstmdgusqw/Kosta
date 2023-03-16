import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        while(stack.empty() == false) {
        	System.out.println(stack.pop());
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
        while(queue.isEmpty() == false) {
        	System.out.println(queue.poll());
        }
	}
}
