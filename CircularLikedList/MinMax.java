package CircularLikedList;

public class MinMax {

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
	
	public void minNode() {
		Node current = head;
		int min = head.data;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}else {
			 do{
				if(current.data < min) {
					min = current.data;
				}
				current = current.next;
			}while(current != head);
			System.out.println("Minimun value of a node in a list is: "+min);
		}
		
	}
	
	public void maxNode() {
		Node current = head;
		int max=head.data;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}else {
			do{
				if(current.data > max) {
					max = current.data;
				}
				current = current.next;
			}while(current != head);
			System.out.println("Maximun value of a node in a list is: "+max);
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
