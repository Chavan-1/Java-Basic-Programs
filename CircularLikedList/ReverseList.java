package CircularLikedList;

public class ReverseList {

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
	
	public void reverse(Node current) {
		
		if(current.next == head) {
			System.out.print(current.data+" ");
			return;
		}
		reverse(current.next);
		System.out.print(current.data+" ");
	}
	
	public void display() {
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}else {
			System.out.println("Original list");
			do {
				System.out.print(current.data+" ");
				current = current.next;
			}while(current != head);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		ReverseList list = new ReverseList();

		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		list.display();
		
		System.out.println("Reversed list");
		list.reverse(list.head);
		
		
	}

}
