package DoublyLinkedList;

import SinglyLinkedList.RemoveDuplicate;

public class RemoveDuplicates {
	class Node{
		int data;
		Node previous;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head, tail = null;
	
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
	
	public void removeDuplicate() {
		
		Node current, index, temp;
		
		if(head == null) {
			return;
		}else {
			for(current = head; current != null; current = current.next) {
				for(index = current.next; index != null; index = index.next) {
					if(current.data == index.data) {
						temp = index;
						index.previous.next = index.next; //index's previous node will point to node next to index thus, removes the duplicate node  
						if(index.next != null) {
							index.next.previous = index.previous;
						}
						temp = null;
					}
				}
			}
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
		}
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		RemoveDuplicates sList = new RemoveDuplicates();
		
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
