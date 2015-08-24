
/**
 * This class creates the nodes to be used by DoublyLinkedList
 * @author Jeremy Sawh
 * @version 2015-08-24
 *
 */

public class Node<E>{
	
	private E element; 
	private Node<E> next;
	private Node<E> previous;

	
	/**
	 * Sets the pointer to the next Node
	 * @param next of type Node is pointer to next Node
	 */
	
	
	public void setNext(Node<E> next){
		this.next = next;
		
	}
		
	
	/**
	 * Sets the pointer tot the prvious Node
	 * @param prev of type Node is ponter to previous Node 
	 */
	
	
	public void setPrevious(Node<E> prev){
		previous = prev;
	}
		
	
	/**
	 * Sets the element type
	 * @param item is element to be stored in Node
	 */
		
	
	public void setitem(E item){
		element = item;
	}
		
	
	/**
	 * @return the next node
	 */
	
	
	public Node<E> getNext(){
		return next;
	}
	
	
	/**
	 * @return the previous node
	 */
	
	
	public Node<E> getPrevious(){
		return previous;
	}
		
	
	/**
	 * @return the element sotred in class Node
	 */
	
	
	public E getitem(){
		return element;
	}
}
