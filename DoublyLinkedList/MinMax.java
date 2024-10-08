package DoublyLinkedList;

public class MinMax {
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
	
	
	public void minNode() {
		Node current = head;
		int min;
		
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}else {
			min = head.data;
			while(current != null) {
				if(current.data < min) {
					min = current.data;
				}
				current = current.next;
			}
			System.out.println("Minimun value of a node in a list is: "+min);
		}
	}
	
	public void maxNode() {
		Node current = head;
		int max;
		
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}else {
			max = head.data;
			while(current!=null) {
				if(current.data > max) {
					max = current.data;
				}
				current = current.next;
			}
			System.out.println("Maximun value of a node in a list is: "+max);
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
		
		MinMax list = new MinMax();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		System.out.println("Original list");
		list.display();
		
		list.minNode();
		
		list.maxNode();

	}

}
