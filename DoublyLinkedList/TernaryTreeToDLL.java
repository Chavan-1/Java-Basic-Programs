package DoublyLinkedList;

public class TernaryTreeToDLL {

	public static class Node{
		int data;
		Node left;
		Node middle;
		Node right;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Node root;
	Node head, tail = null;
	
	public void convertTtToDLL(Node node) {
		if(node == null) {
			return;
		}
		
		Node left = node.left;
		Node middle = node.middle;
		Node right = node.right;
		
		if(head == null) {
			head = tail = node;
			head.left = null;
			head.middle = null;
			head.right = null;
		}else {
			tail.right = node;
			node.left = tail;
			node.middle = null;
			tail = node;
			tail.right = null;
		}
		
		convertTtToDLL(left);
		convertTtToDLL(middle);
		convertTtToDLL(right);
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.right;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		TernaryTreeToDLL tree = new TernaryTreeToDLL();
		
		tree.root = new Node(5);
		
		tree.root.left = new Node(10);
		tree.root.middle = new Node(12);
		tree.root.right = new Node(15);
		
		tree.root.left.left = new Node(20);
		tree.root.left.middle = new Node(40);
		tree.root.left.right = new Node(50);
		
		tree.root.middle.left = new Node(25);
		tree.root.middle.middle = new Node(36);
		tree.root.middle.right = new Node(48);
		
		tree.root.right.left = new Node(30);
		tree.root.right.middle = new Node(45);
		tree.root.right.right = new Node(60);
		
		tree.convertTtToDLL(tree.root);

		tree.display();
	}

}
