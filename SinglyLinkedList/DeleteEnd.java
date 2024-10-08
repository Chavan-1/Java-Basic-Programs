package SinglyLinkedList;

public class DeleteEnd {
	class Node {
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
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void deleteFromEnd() {
		
		if(head == null) {
			System.out.println("List is empty");
		}else{
			if(head != tail) {
				Node current = head;
				
				//Loop through the list till the second last element such that current.next is pointing to tail  
				while(current.next != tail) {
					current = current.next;
				}
				tail = current;
				tail.next = null;
			}else {
				head = tail = null;
			}
		}
	}
	
	public void display() {
		Node current=head;
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
		
		DeleteEnd dmList = new DeleteEnd();

		dmList.addNode(1);
		dmList.addNode(2);
		dmList.addNode(3);
		dmList.addNode(4);
		dmList.addNode(5);
		
		System.out.println("Original List: ");
		dmList.display();
		
		while(dmList.head != null) {  
            dmList.deleteFromEnd();  
            //Printing updated list  
            System.out.println("Updated List: ");  
            dmList.display();  
        }  
	}

}
