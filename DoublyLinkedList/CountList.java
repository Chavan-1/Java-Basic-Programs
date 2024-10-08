package DoublyLinkedList;

public class CountList {

	class Node{
		int data;
		Node previous;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head, tail=null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=tail=newNode;
			head.previous = null;
			head.next = null;
		}else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	
	public void display() {
		Node current = head;
		int count=0;
		if(head == null) {
			System.out.println("List is Emppty");
		}
		while(current!=null) {
			count++;
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
		System.out.println("No. of Nodes: "+count);
	}
	
	public static void main(String[] args) {
		
		CountList list = new CountList();

		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		list.display();
	}

}
