package com.rbr.datastr;

public class CircularQueue {
	
	int n = 10;
	int[] arr = new int[n];
	int front=0;
	int rear=0;
	
	void enqueue(int item){
		rear = (rear+1)%n;
		if(rear == front){
			System.out.println("overflow");
			if(rear==n){
				rear = n-1;
			}
			else{
				rear = rear-1;
			}
		}
		else{
			arr[rear] = item;
		}
		
	}
	
	int dequeue(){
		int item;
		if(front == rear){
			System.out.println("underflow/queue is empty");
			return -1;
		}
		else{
			item = front;
			front++;
			return item;
		}
	}
	
	void printQueue(){
		for(int i=front+1; i<=rear; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.dequeue();
		q.enqueue(30);
		q.printQueue();
		/*System.out.println();
		System.out.println("**after deleting");
		
		q.dequeue();
		q.dequeue();
		q.printQueue();*/
		
	}
	
	
}
