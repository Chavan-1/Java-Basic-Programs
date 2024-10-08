package CircularLikedList;

public class DeleteEnd {
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
	
	public void deleteEnd() {
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}else {
			if(head!=tail) {
				Node current = head;
				while(current.next != tail) {
					current = current.next;
				}
				tail = current;
				tail.next = head;
			}else {
				head=tail=null;
			}
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
		
		DeleteEnd list = new DeleteEnd();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		System.out.println("Original list");
		list.display();
		
		while(list.head != null) {
			list.deleteEnd();
			System.out.println("Updated list");
			list.display();
		}
	}

}
