package DoublyLinkedList;

public class DeleteStart {
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
	
	
	public void deleteFromStart() {
		
		Node current = head, temp = null;
		
		if(head == null) {
			return;
		}else {
			if(head != tail) {
				head = head.next;
				head.previous = null;
			}else {
				head = tail = null;
			}
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
		
		DeleteStart list = new DeleteStart();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		System.out.println("Original List: ");  
		list.display();
		
		while(list.head != null) {
			list.deleteFromStart();
			 System.out.println("Updated List: ");  
	         list.display();  
		}

	}

}
