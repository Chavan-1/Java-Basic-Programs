package CircularLikedList;

public class InsertMid {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
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
			newNode.next = head;
		}else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
		size++;
	}
	
	public void insertMid(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		}else {
			
			Node current, temp;
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
		
		InsertMid list = new InsertMid();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		System.out.println("Original list: "); 
		list.display();
		
		list.insertMid(9);
		 System.out.println("Updated List: ");  
		list.display();
	}
}
