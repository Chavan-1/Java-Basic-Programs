package DoublyLinkedList;

import DoublyLinkedList.InsertStart.Node;

public class InsertEnd {
	class Node{
		int data;
		Node previous;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head, tail = null;
	
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
	}
	
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}else {
			tail.next = newNode;
			tail = newNode;
			tail.next = null;
		}
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
		
		InsertEnd list = new InsertEnd();
		
		list.addAtEnd(1);
		list.display();
		
		list.addAtEnd(2);
		list.display();
		
		list.addAtEnd(3);
		list.display();
		
		list.addAtEnd(4);
		list.display();			

	}

}
