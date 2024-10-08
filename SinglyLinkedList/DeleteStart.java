package SinglyLinkedList;

public class DeleteStart {
	
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
	
	public void deleteFromStart() {
		if(head == null) {
			System.out.println("List is empty");
		} else {
			
			//Checks whether the list contains only one node  
            //If not, the head will point to next node in the list and tail will point to the new head.  
			if(head != tail) {
				head = head.next;
			} 
			//If the list contains only one node  
            //then, it will remove it and both head and tail will point to null  
			else {
				head = tail = null;
			}
		}
	}
	
	public void display() {
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
		} 
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		DeleteStart dsList = new DeleteStart();
		
		dsList.addNode(0);
		dsList.addNode(1);
		dsList.addNode(2);
		dsList.addNode(3);
		dsList.addNode(4);
		
		System.out.println("Original List: ");
		dsList.display();
		
		while(dsList.head != null) {
			dsList.deleteFromStart();
			System.out.println("Updated List: ");
			dsList.display();
		}

	}

}
