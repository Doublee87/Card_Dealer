/*
	<Ameen Almiftah>		<6/3/2011>
*/



public class Node {
	private Comparable item;
	private Node next;
	
	
	// default constructor
	
	public Node() {
    	next = null;
    }
    
   
	// constructor with parameter needed for node 
	
	public Node(Comparable c){
    	item = c;
    	next = null;
    }
    
    
	// constructor used for the data of the node and next node address
	
    public Node(Comparable c, Node n){
    	item = c;
    	next = n;
    }
    
    
	// setter for current node
	
    public void setItem(Comparable c) {
    	item = c;
	}

    
	// setter for next node address
	
	public void setNext(Node n) {
    	next = n;
    }

    
	// getter for node
	
	public Comparable getItem() {
    	return item;
    }

    
	// getter for next node
	
    public Node getNext() {
    	return next;
    }
} 
