package DoublyLinkedList;

public class ReverseList {
	
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
	
	public void reverse() {
		Node current = head, temp = null;
		if(head == null) {
			System.out.println("List is Empty");
		}else {
				while(current != null) {
					//Swap the previous and next pointers of each node to reverse the direction of the list  
					temp = current.next;
					current.next = current.previous;
					current.previous = temp;
					current = current.previous;
				}
				//Swap the head and tail pointers.  
				temp = head;
				head = tail;
				tail = temp;
		}
	}
	
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is Empty");
		}
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		ReverseList list = new ReverseList();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		System.out.println("Original List: ");  
		list.display();
		
		System.out.println("Reversed List: ");  
		list.reverse();
		list.display();
	}

}
