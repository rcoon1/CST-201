package Project2;

public class SLLDriver {
	
	public static void main(String[] args) {
		SinglyLinkedList<String> myList = new SinglyLinkedList<String>();
		SinglyLinkedList<String> secondList = new SinglyLinkedList<String>();
		
		
		//Check if list is empty
		System.out.println("Is myList empty? " + myList.isEmpty());
		System.out.println("Is secondList empty? " + secondList.isEmpty());
		
		//inserting new data into myList
		myList.insert("this ");
		myList.insert("is ");
		myList.insert("a ");
		myList.insert("test ");
		
		//create and insert data into a secondList to merge
		secondList.insert("Ryan ");
		secondList.insert("CST ");
		
		//testing isEmpty after insertion
		System.out.println("Is myList empty now? " + myList.isEmpty());
		System.out.println("Is secondList empty now? " + secondList.isEmpty());

		//reverse order of the list
		myList.reverse();
		
		//check size of list
		System.out.println("Size of myList is " + myList.size());
		
		//print whats after the head
		System.out.println("Head node.next " + myList.frontNode().next);
		//print whats after the tail
		System.out.println("Tail node.next " + myList.tailNode().next);
		//print whats before the tail
		System.out.println("Tail node.previous " + myList.tailNode().previous);
		//print front of list
		System.out.println("Head " + myList.front());
		//print end of list
		System.out.println("Tail " + myList.back());
		
		//remove head and replace it with next node
		myList.pop_front();
		System.out.println("New head after pop_front " + myList.front());
		//check the size after removing original head
		System.out.println("New size after pop_front " + myList.size());
		//remove tail via pop_back
		myList.pop_back();
		System.out.println("New tail after pop_back " + myList.back());
		//check list size after removing tail
		System.out.println("New list size after pop_back " + myList.size());
		
		//merge both lists
		myList.merge(secondList);
		System.out.println(myList.front() + myList.frontNode().next + myList.tailNode().previous + myList.back());
		//System.out.println(myList.back());

		System.out.println(myList.size());

	}
	

}
