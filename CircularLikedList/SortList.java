package CircularLikedList;

import CircularLikedList.DeleteStart.Node;

public class SortList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
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
	
	public void sortList() {
		Node current = head, index=null;
		int temp;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}else {  
			do {
				index = current.next;
				while(index != head) {
					if(current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}while(current.next != head);
		}
	}
	
	public void display() {
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}else {  
			do {
				System.out.print(current.data+" ");
				current = current.next;
			}while(current != head);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		SortList list = new SortList();
		
		list.addNode(70);
		list.addNode(90);
		list.addNode(20);
		list.addNode(100);
		
		System.out.println("Original list: ");
		list.display();
		
		System.out.println("Sorted list: ");  
		list.sortList();
		list.display();

	}

}
