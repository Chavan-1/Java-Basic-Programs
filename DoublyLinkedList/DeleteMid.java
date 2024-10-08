package DoublyLinkedList;

import DoublyLinkedList.DeleteEnd.Node;

public class DeleteMid {
	class Node{
		int data;
		Node previous;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head, tail = null;
	public int size;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
		size++;
	}
	
	public void deleteFromMid() {
		
		if(head == null) {
			return;
		}else {
			Node current = head;
			
			int mid = (size%2==0) ? (size/2) : ((size+1)/2);
			for(int i=0; i<mid; i++) {
				current = current.next;
			}
			
			if(current == head) {	//If middle node is head of the list  
				head = current.next;
			}else if(current == tail) {
				tail = tail.previous;
			}else{
				current.previous.next = current.next;
				current.next.previous = current.previous;
			}
			current = null;
		}
		size--;
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
		}
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		DeleteMid list = new DeleteMid();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		System.out.println("Original List: ");  
		list.display();
		
		while(list.head != null) {
			list.deleteFromMid();
			System.out.println("Updated List: ");  
		    list.display();  
		}

	}

}
