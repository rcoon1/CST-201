package Project2;

public class SinglyLinkedList<T> {
	
	private Node<?> head;
	private Node<?> tail;
	private int listSize;
	
	public SinglyLinkedList() {
		
	}
	
	public SinglyLinkedList(Node<?> head, Node<?> tail) {
		this.head = head;
		this.tail = tail;
	}
	
	public SinglyLinkedList(SinglyLinkedList<?> singlyLinkedList) {
		head = singlyLinkedList.head;
		tail = singlyLinkedList.tail;
	}
	
	@SuppressWarnings("unchecked")
	public T front() {
		if (head != null) {
			return (T) this.head.getData();
		}
		return null;
	}
	@SuppressWarnings("unchecked")
	public T back() {
		if (tail != null) {
			return (T) this.tail.getData();
		}
		return null;
	}
	public Node<?> headNode() {
		return this.head;
	}
	public Node<?> tailNode() {
		return this.tail;
	}
	//time complexity is this operation runs in a constant time, therefore adding n elements requires O(n) time.
	public void insert(T data) {
		Node<?> newNode = new Node<Object>(data);
		if (head == null) {
			head = newNode;
			listSize++;
			return;
		}
		if (tail == null) {
			tail = newNode;
			head.next = newNode;
			tail.previous = head;
			listSize++;
			return;
		}
		tail.next = newNode;
		newNode.previous = tail;
		tail = newNode;
		listSize++;
	}
	
	public void pop_front() {
		this.head = this.head.next;
		listSize++;
	}
	
	public void pop_back() {
		this.tail = this.tail.previous;
		listSize--;
	}
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}
	//it is O(1) because the list is linked, it keeps references to both head and tail.
	public int size() {
		return listSize;
	}
	public void reverse() {
		Node<?> currentNode = tail;
		if (tail == null) {
			currentNode = head;
		}
		while (currentNode != null) {
			System.out.println(currentNode);
			currentNode = currentNode.previous;
		}
	}
	
	public void merge(SinglyLinkedList<?> secondList) {
		if (this.tail == null) {
			this.tail = secondList.head;
		}
		this.tail = secondList.tail;
	}

}
