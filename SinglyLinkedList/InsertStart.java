package SinglyLinkedList;

public class InsertStart {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void insertStart(int data) {
		Node newNode = new Node(data);
		Node current, temp;
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			temp = head;
			head = newNode;
			head.next = temp;
			
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
		}else {
			while(current != null) {
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		InsertStart list = new InsertStart();
		
		list.addNode(1);
		list.addNode(3);
		list.addNode(9);
		list.addNode(8);
		list.addNode(5);
		
		System.out.println("Original list: ");
		list.display();
		
		System.out.println("Updated list: ");
		list.insertStart(10);
		list.display();
		
	}

}
