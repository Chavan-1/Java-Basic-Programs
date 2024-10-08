package SinglyLinkedList;

public class CountNodes {

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
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
//	public int countNode() {
//		int count = 0;
//		Node current = head;
//		
//		if(current != null){
//			count++;
//			current = current.next;
//		}
//		return count;
//	}
	
	public void display() {
		Node current = head;
		int count = 0;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		System.out.println("Nodes of singly linked list: ");
		while(current != null) {
			System.out.print(current.data+" ");
			count++;
			current = current.next; 
		}
		System.out.println();
		System.out.println("Count of nodes present in the list: "+count);
	}
	
	public static void main(String[] args) {
		
		CountNodes cNode = new CountNodes();
		
		cNode.addNode(100);
		cNode.addNode(200);
		cNode.addNode(300);
		cNode.addNode(400);
		
		cNode.display();
		
		//System.out.println("Count of nodes present in the list: "+cNode.countNode());
	}

}
