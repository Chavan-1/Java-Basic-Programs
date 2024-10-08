package SinglyLinkedList;

public class MinMax {
	
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
		if(head==null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
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
				if(current.data > min) {
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
				if(current.data < max) {
					max = current.data;
				}
				current = current.next;
			}
			System.out.println("Maximun value of a node in a list is: "+max);
		}
	}
	
	public void display() {
		Node current = head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}else {
			while(current != null) {
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		MinMax list = new MinMax();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		System.out.println("singly linked list: ");
		list.display();
		
        list.minNode();
        
        list.maxNode();

	}

}
