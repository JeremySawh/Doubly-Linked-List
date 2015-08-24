/**
 * Circular Doubly Linked list Implementation with Dummy Node
 * @author JeremySawh
 * @version 2015-07-08 3:25
 *
 */
public class DoublyLinkedList<T extends Comparable<T>>{
	
	private int numElements;  
	private Node<T> head;
	private Node<T> dummy;
	
		
	/**
	 * Constructor for Class DoublyLinked List
	 * Intalizes all instance variables
	 * Creates Dummy node
	 */
	
	
	public DoublyLinkedList(){
		dummy = new Node<T>();
		dummy.setNext(dummy);
		dummy.setPrevious(dummy);
		dummy.setitem(null);
		head = dummy.getNext();
	}

	
	/**
	 * @return Integer Value containing List size
	 */
	
	
	public int size(){
		return numElements;
	}
	

	/**
	 * Gets an element at a specified index
	 * @param index loaction of element
	 * @return element at that index specified
	 */
	
	
	public T get(int index){
		Node<T> temp = head;
		for(int i = 0; i<= index; i++){
			temp = temp.getNext();	
		}
		return temp.getitem();
	}
	
	
	/**
	 * Inserts an item into its proper sorted position in sorted list
	 * @param item
	 */
	
	
	public void sortedAdd (T item){
		Node<T> cur = dummy.getNext();
		while(cur != dummy && item.compareTo(cur.getitem()) > 0){//
			cur = cur.getNext();
		}

		Node<T> temp = new Node<T>();
		temp.setNext(cur);
		temp.setPrevious(cur.getPrevious());
		cur.getPrevious().setNext(temp);
		cur.setPrevious(temp);
		temp.setitem(item);
		numElements++;
	}


	/**
	 * Deletes item from a sorted list if found
	 * @param item
	 */
	
	
	public void sortedRemove (T item){
		
		for(Node<T> cur = dummy.getNext(); cur !=dummy; cur = cur.getNext()){
			if(item.equals(cur.getitem())){
				cur.getPrevious().setNext(cur.getNext());
				cur.getNext().setPrevious(cur.getPrevious());
				numElements -- ;
				return;
				}
		}//System.out.println("Item not found");
	}
	
	
	
	/**
	 * Traverses DoublyLinked List and returns string of items
	 * @return String representation of the Doubly Linked list
	 */
	
	
	public String toString(){
		Node<T> temp = dummy.getNext();
		String s = "";
		for(int i=0; i<numElements; i++){
			s = s + temp.getitem() + " ";
			temp = temp.getNext();
		}
		return s;
		
	}
}
