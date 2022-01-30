package Project2;

public class Node<T> {
	
	public T data;
	public Node<?> next;
	public Node<?> previous;
	
	public Node(T data) {
		
		this.data = data;
	}
	
	public T getData() {
		
		return data;
	}
	
	public void setData(T data) {
		
		this.data = data;
	}
	
	public Node<?> getNext() {
		
		return next;
	}
	
	public void setNext(Node<?> next) {
		
		this.next = next;
	}
	
	
	@Override
	public String toString() {
		return  "" + data;
	}
	

}
