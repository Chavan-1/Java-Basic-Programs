package CircularLikedList;

public class RemoveDuplicate {

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
	

	public void removeDuplicate() {
		Node current=head, index=null, temp=null;
		if(head == null) {
			System.out.println("List is empty");
		}else {
			
			// iterates through each node in the linked list
			 do{
				temp = current;				//Node temp will point to previous node to index.
				index = current.next;		 //Index will point to node next to current  
				
				//checks for duplicates in the part of the list after the current node.
				while(index != head) {
					if(current.data == index.data) {
						temp.next = index.next;
					}else{
						temp = index;
					}
					index = index.next;
				}
				current = current.next;
			}while(current != head);
		}
	}
	
	public void display() {
		
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		} else {
			do {
				System.out.print(current.data+" ");
				current = current.next;
			}while(current != head);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		RemoveDuplicate sList = new RemoveDuplicate();
		
		sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(2);  
        sList.addNode(2);  
        sList.addNode(4);  
        sList.addNode(1);  
  
        System.out.println("Originals list: ");  
        sList.display();  
  
        //Removes duplicate nodes  
        sList.removeDuplicate();  
  
        System.out.println("List after removing duplicates: ");  
        sList.display();  
	}
}
