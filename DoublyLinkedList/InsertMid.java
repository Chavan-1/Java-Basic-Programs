package DoublyLinkedList;

import DoublyLinkedList.InsertEnd.Node;

public class InsertMid {
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
	
	public void insertMid(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}else {
			Node current = head, temp = null;
			int mid = (size%2==0) ? (size/2) : ((size+1)/2);
			for(int i=0; i<mid; i++) {
				current = current.next;
			}
			
			temp = current.next;
			temp.previous = current;
			
			current.next = newNode;
			newNode.previous = current;
			newNode.next = temp;
			temp.previous = newNode;
			
		}
		size++;
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
		
		InsertMid list = new InsertMid();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		System.out.println("Original list: "); 
		list.display();
		
		list.insertMid(9);
		 System.out.println("Updated List: ");  
		list.display();
	}

}
