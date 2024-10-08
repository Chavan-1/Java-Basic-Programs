package Tree;

import java.util.LinkedList;
import java.util.Queue;

import Tree.ConvertBTtoBST.Node;

/*****
 * The width of the binary tree is the number of nodes present in any level. So, the level which has the maximum number of nodes will be the maximum width of the binary tree. 
 * To solve this problem, traverse the tree level-wise and count the nodes in each level.
 * *******/
public class FindMaximumWidthOfBinaryTree {

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
	
	public FindMaximumWidthOfBinaryTree() {
		root = null;
	}
	
	
	public int findMaxWidth() {
		
		int maxWidth=0, nodesInLevel=0;
		
		Queue<Node> queue = new LinkedList<Node>();
		
		if(root == null) {
			System.out.println("Tree is empty");
			return 0;
		} else {
			
			queue.add(root);
			
			while(queue.size() != 0) {
				
				nodesInLevel = queue.size();
				
				maxWidth = Math.max(maxWidth, nodesInLevel);
				
				while(nodesInLevel > 0) {
					
					Node current = queue.remove();
					
					if(current.left != null) 
						queue.add(current.left);
					if(current.right != null)
						queue.add(current.right);
					nodesInLevel--;
				}
			}
		}	
		return maxWidth;
	}
	
	public static void main(String[] args) {
		
		FindMaximumWidthOfBinaryTree bt = new FindMaximumWidthOfBinaryTree();
		
		bt.root = new Node(1);
		
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		
		System.out.println("Maximum width of the binary tree: "+ bt.findMaxWidth());
		

	}

}
