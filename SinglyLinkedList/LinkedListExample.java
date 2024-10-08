package SinglyLinkedList;
/*****
 * Linked List can be defined as a collection of objects called nodes that are randomly stored in the memory.
 * A node contains two fields, i.e. data stored at that particular address and the pointer which contains the address of the next node in the memory.
 * The last node of the list contains the pointer to the null.
 * *****/
public class LinkedListExample {

	static Node head;  // head of list  
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	/* This function prints contents of the linked list starting from head */  
	public static void display() {
		
		Node current = head;
		
		while(current != null) {
			System.out.print(current.data+"\n");
			current = current.next;
		}
	}
	
	/* method to create a simple linked list with 3 nodes*/  
	public static void main(String[] args) {
	
		  /* Start with the empty list. */  
		LinkedListExample list = new LinkedListExample();
		
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		list.head.next = second;		 // Link first node with the second node  
		second.next = third;			// Link first node with the second node  
		
		list.display();
	}

}
