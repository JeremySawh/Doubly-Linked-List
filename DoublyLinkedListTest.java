/**
 * Test code for Doubly Linked List
 * @author Jeremy Sawh
 * @version 2015-08-24
 *
 */
public class DoublyLinkedListTest {
	private static DoublyLinkedList<Integer> dlist;
	private static DoublyLinkedList<String> stringdlist;
	
	public static void main(String[] args){
		
		//Intalize list
		dlist = new DoublyLinkedList<Integer>();
		stringdlist = new DoublyLinkedList<String>();
		
		//Test Sorted Inserting with strings
		System.out.println("Inserting A C E B D F");
		stringdlist.sortedAdd("A");
		stringdlist.sortedAdd("C");
		stringdlist.sortedAdd("E");
		stringdlist.sortedAdd("B");
		stringdlist.sortedAdd("D");
		stringdlist.sortedAdd("F");

		System.out.println("Printing String Sorted Doubly Linked List");
		System.out.println(stringdlist.toString());

		//Testing sorted remove on integer Doubly Linked list
		System.out.println("\n\nRemoving value D from String Doubly Linked List");
		stringdlist.sortedRemove("D");
		System.out.println("Printing Sorted Doubly Linked List\n" + stringdlist.toString() + "\n");
		
		//Test Sorted Inserting with integers
		System.out.println("Inserting 1 5 7 9 3 2");
		dlist.sortedAdd(1);
		dlist.sortedAdd(5);
		dlist.sortedAdd(7);
		dlist.sortedAdd(9);
		dlist.sortedAdd(3);
		dlist.sortedAdd(2);
	
		System.out.println("Printing Integer Sorted Doubly Linked List");
		System.out.println(dlist.toString());
		
		// Test sorted remove on integer doubly linked list
		System.out.println("\n\nRemoving value 3 from  Doubly Linked List");
		dlist.sortedRemove(3);
		System.out.println("Printing Sorted Doubly Linked List\n" + dlist.toString());
		
		System.out.println("\n\nRemoving value 2 from  Doubly Linked List");
		dlist.sortedRemove(2);
		System.out.println("Printing Sorted Doubly Linked List\n"+ dlist.toString());

		System.out.println("\n\nRemoving value 4 from  Doubly Linked List");
		dlist.sortedRemove(4);		
		System.out.println("Printing Sorted Doubly Linked List\n" + dlist.toString());

		
	}

}
