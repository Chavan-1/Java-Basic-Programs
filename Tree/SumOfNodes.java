package Tree;

import Tree.MaxDistance.Node;

public class SumOfNodes {

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
	
	public SumOfNodes() {
		root = null;
	}
	
	public int calculateSumOfNodes(Node temp) {
		int sum, sumRight, sumLeft;
		sum = sumRight = sumLeft = 0;
		
		if(root == null) {
			System.out.println("Tree is empty");
			return 0;
		}else {
			if(temp.left != null) {
				sumLeft = calculateSumOfNodes(temp.left);
			}
			if(temp.right != null) {
				sumRight = calculateSumOfNodes(temp.right);
			}
			
			sum = temp.data + sumLeft + sumRight;
			
			return sum;
		}
	}
	
	public static void main(String[] args) {
		
		SumOfNodes bt = new SumOfNodes();

		bt.root = new Node(5);
		
		bt.root.left = new Node(2);
		bt.root.right = new Node(9);
		
		bt.root.left.left = new Node(1);
		bt.root.left.right = new Node(8);
		
		bt.root.right.right = new Node(6);
		
		System.out.println("Sum of all nodes of binary tree: "+bt.calculateSumOfNodes(bt.root));
	}

}
