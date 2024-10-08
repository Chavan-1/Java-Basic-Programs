package Tree;

public class SearchNode {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.right = null;
			this.left = null;
		}
	}
	
	public Node root;
	public static boolean flag = false;
	public SearchNode() {
		root = null;
	}
	
	public void searchNode(Node temp, int value) {
		if(root == null) {
			System.out.println("Tree is empty");
		}else {
			if(temp.data == value) {
				flag = true;
				return;
			}
			
			if(flag == false && temp.left != null) {
				searchNode(temp.left, value);
			}
			
			if(flag == false && temp.right != null) {
				searchNode(temp.right, value);
			}
		}
	}
	
	public static void main(String[] args) {
		
		SearchNode bt = new SearchNode();
		
		bt.root = new Node(1);
		
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		
		bt.root.right.left = new Node(6);

		bt.searchNode(bt.root, 5);
		
		if(flag)
			System.out.println("Element is present");
		else
			System.out.println("Element not present");
	}

}
