package Project2;

public class SLLDriver {
	
	public static void main(String[] args) {
	    SinglyLinkedList<String> myList = new SinglyLinkedList<String>();
	    SinglyLinkedList<String> secondList = new SinglyLinkedList<String>();
		
		
		//Check if list is empty
		System.out.println("Is myList empty? " + myList.isEmpty());
		System.out.println("Is secondList empty? " + secondList.isEmpty());
		System.out.println("Initializing insert... ");
		
		//inserting new data into myList
		myList.insert("This ");
		myList.insert("is ");
		myList.insert("Ryan's ");
		myList.insert("list ");
		
		//create and insert data into a secondList to merge
		secondList.insert("For ");
		secondList.insert("CST ");
		secondList.insert("201 ");
		secondList.insert("Project 2 ");
		
		//testing isEmpty after insertion
		System.out.println("Is myList empty now? " + myList.isEmpty());
		System.out.println("Is secondList empty now? " + secondList.isEmpty());

		//reverse order of the list
		System.out.println("myList contains: " + myList.headNode() + myList.headNode().next + myList.tailNode().previous + myList.tailNode());
		System.out.println("myList reversed: ");
		myList.reverse();
		
		//check size of list
		System.out.println("Size of myList is " + myList.size() + " strings");
		
		//print whats after the head
		System.out.println("Head node.next is: " + myList.headNode().next);
		//print whats after the tail
		System.out.println("Tail node.next is: " + myList.tailNode().next);
		//print whats before the tail
		System.out.println("Tail node.previous is: " + myList.tailNode().previous);
		//print front of list
		System.out.println("Head node is: " + myList.front());
		//print end of list
		System.out.println("Tail node is: " + myList.back());
		
		//remove head and replace it with next node
		myList.pop_front();
		System.out.println("New head after pop_front is: " + myList.front());
		//check the size after removing original head
		System.out.println("New size after pop_front is " + myList.size() + " strings");
		//remove tail via pop_back
		myList.pop_back();
		System.out.println("New tail after pop_back is: " + myList.back());
		//check list size after removing tail
		System.out.println("New list size after pop_back is " + myList.size() + " strings");
		
		//merge both lists
		myList.merge(secondList);
		System.out.println("List after merging the two lists: " + myList.front() + myList.headNode().next + myList.tailNode().previous + myList.back());
		System.out.println("New tail node after merging the lists is: " + myList.back());

		System.out.println("List size after pop_front and back, then merging is: " + myList.size());

	}
	

}
