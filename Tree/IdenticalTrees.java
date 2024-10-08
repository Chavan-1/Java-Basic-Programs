package Tree;

import Tree.ConvertBTtoBST.Node;

public class IdenticalTrees {
	
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
	public IdenticalTrees() {
		root = null;
	}
	
	public static boolean areIdenticalTrees(Node root1, Node root2) {
		if(root1 == null & root2 == null) 
			return true;
		
		if(root1 != null && root2 != null)
			return ((root1.data == root2.data) &&
					(areIdenticalTrees(root1.left, root2.left)) &&
					(areIdenticalTrees(root1.right, root2.right))
					);
		
		return false;
	}
	public static void main(String[] args) {
		
		IdenticalTrees bt = new IdenticalTrees();

		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		
		IdenticalTrees bt1 = new IdenticalTrees();

		bt1.root = new Node(1);
		bt1.root.left = new Node(2);
		bt1.root.right = new Node(3);
		bt1.root.left.left = new Node(4);
		bt1.root.left.right = new Node(5);
		bt1.root.right.left = new Node(6);
		bt1.root.right.right = new Node(7);
		
		if(areIdenticalTrees(bt.root, bt1.root))
			System.out.println("Boot the binary trees are identical");
		else
			System.out.println("Boot the binary trees are not identical");
			
	}

}
