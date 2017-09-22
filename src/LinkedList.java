/*
	<Ameen Almiftah>		<6/3/2011>
*/



public class LinkedList {
	private Node first = null;
	private Node current = null;
	private Node pre = null;
	
	public LinkedList(){
		
	}
	
    
	//to check if the linked list is empty
	
	public boolean isEmpty() {
		return (first == null);
	}
	
    
	// to look and check if the linked list contains data 
	
	public boolean contains(Comparable c) {
		current = first;
		pre = null;
		
		while((current != null) && (current.getItem().compareTo(c) < 0)){
			pre = current;
			current = current.getNext();
		}
		
		return (current != null) &&(current.getItem().compareTo(c) == 0);
	}
	
    
	//to get first node and remove it from the linked list

	public Comparable get() {
		Node temp = first;
		if(first.getNext() == null){
			first = null;
			return temp.getItem();			
		}else{
			first = first.getNext();
			return temp.getItem();
		}
	}
	
    
	// to add a new node
	
	public void add(Comparable c) {
		Node temp = new Node(c);
		if(pre == null)
			first = temp;
		else
			pre.setNext(temp);
			
		temp.setNext(current);
		current = temp;	
		
	}
	
    
	// to remove first node if not empty
	
	public void remove()throws RuntimeException{
		if(!isEmpty())
		first = first.getNext();
	}
	
    
	// to traverse the linked list
	
	public void traverse() {
		current = first;
		while(current != null){
			System.out.println(current.getItem());
			current = current.getNext();
		}
			
	}
	
}
