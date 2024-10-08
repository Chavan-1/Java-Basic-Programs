package DoublyLinkedList;
/********
 * The binary tree is a tree data structure in which each node has at most two children node.
 * This can be achieved by traversing the tree in the in-order manner 
 * that is, left the child -> root ->right node. Traverse left sub-tree 
 * and convert it into the doubly linked list by adding nodes to the end of the list. 
 * In this way, leftmost node will become head of the list. 
 * Then, convert the right sub-tree into the doubly linked list.
 * *******/
public class BinaryTreeToDLL {

	public static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public Node root;
	Node head, tail=null;
	
	public void convertBtToDLL(Node node) {
		if(node == null) {
			return;
		}
		convertBtToDLL(node.left);	 //Convert left subtree to doubly linked list    
		
		if(head == null) {
			head = tail = node;
		} else {
			tail.right = node;	//node will be added after tail such that tail's right will point to node    
			node.left = tail;	//node's left will point to tail    
			tail = node;		 //node will become new tail    
		}
		convertBtToDLL(node.right);		 //Convert right subtree to doubly linked list   
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		while(current!=null) {
			System.out.print(current.data + " ");
			current = current.right;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		BinaryTreeToDLL bt = new BinaryTreeToDLL();
		
		bt.root = new Node(1);
		
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		
		
		
		bt.convertBtToDLL(bt.root);
		
		bt.display();
	}

}
