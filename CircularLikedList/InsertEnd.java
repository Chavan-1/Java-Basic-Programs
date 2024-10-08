package CircularLikedList;

import CircularLikedList.CreateList.Node;

public class InsertEnd {

	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addAtEnd(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	public void display() {
		
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		} else {
			System.out.println("Nodes of the circular linked list: ");
			do {
				System.out.print(current.data+" ");
				current = current.next;
			}while(current != head);
			System.out.println();
		}
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
