package SinglyLinkedList;

public class ReverseList {

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
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void reverse(Node current) {
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		} else {
			if(current.next == null) {
				System.out.print(current.data+" ");
				return;
			}
			reverse(current.next);
			System.out.print(current.data+" ");
		}
		
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.print("List is empty");
			return;
		}
		while(current != null){
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		ReverseList rList = new ReverseList();

		rList.addNode(1);  
        rList.addNode(2);  
        rList.addNode(3);  
        rList.addNode(4); 
        
        System.out.println("Original List: ");  
        rList.display();  
  
        System.out.println("Reversed List: ");  
        //Print reversed list  
        rList.reverse(rList.head); 
	}

}
