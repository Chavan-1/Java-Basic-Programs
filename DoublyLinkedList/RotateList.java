package DoublyLinkedList;

public class RotateList {

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
	
	public void rotateList(int n) {
		Node current = head;
		
		if(n==0 || n >= size) {
			return;
		}else {
			for(int i=1; i<n; i++) {
				current = current.next;
			}
			tail.next = head;
			head = current.next;
			head.previous = null;
			tail = current;
			tail.next = null;
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
	
		RotateList list = new RotateList();

		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		System.out.println("Original List: ");  
		list.display();
		
		list.rotateList(3);
		System.out.println("Updated List: ");  
		list.display();
	}

}
