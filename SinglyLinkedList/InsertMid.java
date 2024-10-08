package SinglyLinkedList;

public class InsertMid {

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
	public int size;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void insertMid(int data) {
		Node newNode = new Node(data);
		Node current, temp;
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			int count = (size%2==0) ? (size/2) : ((size+1)/2);
			temp = head;
			current = null;
			
			for(int i=0; i<count-1; i++) {
				current = temp;
				temp = temp.next;
			}
			current.next = newNode;
			newNode.next = temp;
		}
		size++;
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
		InsertMid list = new InsertMid();
		
		list.addNode(1);
		list.addNode(3);
		list.addNode(9);
		list.addNode(8);
		list.addNode(5);
		
		System.out.println("Original list: ");
		list.display();
		
		System.out.println("Updated list: ");
		list.insertMid(10);
		list.display();
		
	}

}
