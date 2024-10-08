package DoublyLinkedList;

import DoublyLinkedList.DoublyLinkedList.Node;

public class SearchList {
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
	
	public void searchNode(int value) {
		int i=1;
		boolean flag = false;
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		while(current != null) {
			if(current.data == value) {
				flag = true;
				break;
			}
			current = current.next;
			i++;
		}
		if(flag) {
			System.out.println("Node is present in the list at the position: "+i );
		}else {
			System.out.println("Node is not present in the list");
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
		
		SearchList list = new SearchList();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		list.display();
		
		list.searchNode(4);

		list.searchNode(9);
	}

}
