package Top100Questions;

import java.util.Stack;

public class MinStack {
	/*
	 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 

Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
	 */
	
    /** initialize your data structure here. */
	int min = Integer.MAX_VALUE;
	Stack<Integer> stack = new Stack<>();
	
	public MinStack() {
		
	}

private int top() {
	return stack.peek();
	
}

private void pop() {
	if(stack.pop()==min) {
		min = stack.pop();
	}
	
}
private int getMin() {
	return min;
	
}

private void push(int i) {
	if(i<= min) {
		stack.push(min);
		min = i;
	}
	stack.push(i);
	
}
	
//	int min = Integer.MAX_VALUE;
//	Stack<Integer> stack = new Stack<>();
//	
//    public MinStack() {
//    
//        
//    }
//    
//    public void push(int x) {
//    	if(x<min) {
//    		stack.push(min);
//    		min = x;
//    	}
//    	stack.push(x);
//        
//    }
//    
//    public void pop() {
//    	if(stack.pop()==min) {
//    		min = stack.pop();
//    	}
//        
//    }
//    
//    public int top() {
//    	return stack.peek();
//        
//    }
//    
//    public int getMin() {
//    	return min;
//        
//    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin();
		minStack.pop();
		minStack.top();      
		minStack.getMin();   

	}


















}
