package MazeSolver;

import java.util.LinkedList;

public class MyStack<T> {

	SinglyLinkedList<T> data;
	private Object tail;
	private int listSize;
	
	MyStack() {
		
	}
	
	void pop() {
		this.tail = this.tail.previous;
		listSize--;
	}