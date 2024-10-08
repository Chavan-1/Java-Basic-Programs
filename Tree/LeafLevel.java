package Tree;

import Tree.ConvertBTtoBST.Node;

public class LeafLevel {

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
	public static int level = 0;
	public LeafLevel() {
		root = null;
	}
	
	public boolean isSameLevel(Node node, int currentLevel) {
		if(root == null) {
			System.out.println("List is empty");
			return true;
		}else {
			if(node == null) 
				return true;
			if(node.left == null && node.right == null) {
				if(level == 0) {
					level = currentLevel;
					return true;
				}
				else 
					return (level == currentLevel);
			}
		return (isSameLevel(node.left, currentLevel + 1) 
				&& 
				isSameLevel(node.right, currentLevel + 1));
		}
	}
	public static void main(String[] args) {
		
		LeafLevel bt = new LeafLevel();
		
		bt.root = new Node(1);
		
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		
		if(bt.isSameLevel(bt.root, 1))
			System.out.println("All leaves are at same level");
		else
			System.out.println("All leaves are not at same level");
	}

}
