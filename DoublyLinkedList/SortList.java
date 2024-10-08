package DoublyLinkedList;

public class SortList {
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
	
	public void sortList() {
		Node current = null, index=null;
		int temp;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}else {
			for(current = head; current.next != null; current = current.next) {
				for(index = current.next; index != null; index = index.next) {
					if(current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
				}
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
