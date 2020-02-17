import java.util.PriorityQueue;
import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		
		Stack<String> myStack = new Stack<>();
		PriorityQueue <String> myPq = new PriorityQueue<>();
		
		myStack.add("John");
		myStack.add("Sarah");
		myStack.add("Seth");
		myStack.add("Adam");
		
		while (!myStack.empty()) 
		{
			myPq.add(myStack.pop());
		}
		for (String s: myPq)
			System.out.println(s);

	}

}
