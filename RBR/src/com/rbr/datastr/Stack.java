package com.rbr.datastr;

public class Stack {
	
	int max=10;
	int[] stack = new int[max];
	static int top=-1;
	
	void push(int item){
		
		if(top==max){
			System.out.println("Stack Overflow");
		}
		else
			stack[++top] = item;
		
	}
	
	int pop(){
		
		if(top == -1){
			System.out.println("stack underflow");
			return -1;
		}
		else
			return stack[top--];
		
	}
	
	void printStack(){
		
		for(int i=top; i>=0; i--){
			System.out.println(stack[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(1);
		stack.push(4);
		stack.push(10);
		
		stack.printStack();
		System.out.println("after popping");
		stack.pop();
		stack.printStack();
		
	}
	
	
}
