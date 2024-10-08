package CircularLikedList;

public class CountNodes {
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
	
	public void display() {
		
		Node current = head;
		int count=0;
		if(head == null) {
			System.out.println("List is empty");
			return;
		} else {
			System.out.println("Nodes of the circular linked list: ");
			do {
				count++;
				System.out.print(current.data+" ");
				current = current.next;
			}while(current != head);
			System.out.println();
			System.out.print("No. of Nodes : "+count);
		}
	}
	
	public static void main(String[] args) {
	
		CountNodes list = new CountNodes();

		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		list.display();
	}

}
