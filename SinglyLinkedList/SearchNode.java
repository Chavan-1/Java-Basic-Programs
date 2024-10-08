package SinglyLinkedList;

import SinglyLinkedList.RemoveDuplicate.Node;

public class SearchNode {
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
	
	public void searchNode(int data) {
		Node current=head;
		int i=1;
		boolean flag = false;
		
		if(head == null) {
			System.out.println("List is empty");
		}else {
			while(current != null) {
				if(current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if(flag)  
            System.out.println("Element is present in the list at the position : " + i);  
       else  
            System.out.println("Element is not present in the list");  
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
		SearchNode sList = new SearchNode();  
		  
        //Add nodes to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
  
        //Search for node 2 in the list  
        sList.searchNode(2);  
        //Search for a node  in the list  
        sList.searchNode(7);  

	}

}
