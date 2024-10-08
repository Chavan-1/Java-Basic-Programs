package SinglyLinkedList;

public class DeleteMid {

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
	public int size;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	void deleteFromMid() {
		Node temp, current;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}else {
			
			//Store the mid position of the list  
			int count = (size%2==0)? (size/2) : ((size+1)/2);
			
			//Checks whether the head is equal to the tail or not, if yes then the list has only one node. 
			if(head != tail) {
				temp = head;		//Initially, temp will point to head  
				current = null;
				
				//Current will point to node previous to temp  
				 //If temp is pointing to node 2 then current will point to node 1.  
				for(int i=0; i<count-1; i++) {
					current = temp;
					temp = temp.next;
				}
				
				if(current != null) {
					
					//temp is the middle that needs to be removed.  
					 //So, current node will point to node next to temp by skipping temp.
					current.next = temp.next;
					temp = null;
				}else {
					
					 //If current points to NULL then, head and tail will point to node next to temp.  
					head = tail = temp.next;
					temp = null;	//Delete temp  
				}
			} 
			//If the list contains only one element  
			 //then it will remove it and both head and tail will point to NULL  
			else {
				head = tail = null;
			}
		}
		size--;
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
		
		DeleteMid dmList = new DeleteMid();

		dmList.addNode(1);
		dmList.addNode(2);
		dmList.addNode(3);
		dmList.addNode(4);
		dmList.addNode(5);
		
		System.out.println("Original List: ");
		dmList.display();
		
		while(dmList.head != null) {
			dmList.deleteFromMid();
			System.out.println("Updated List: ");
			dmList.display();
		}
	}

}
