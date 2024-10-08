package Tree;

import java.util.LinkedList;
import java.util.Queue;

import DoublyLinkedList.BinaryTreeToDLL;
import DoublyLinkedList.BinaryTreeToDLL.Node;

/*****
 * we need to calculate the difference between the sum of nodes present at odd levels and sum of nodes present at even levels. 
 * Suppose, if a tree contains 5 levels, then
 * Difference = (L1 + L3 + L5) - (L2 + L4) 
 * OddLevelSum = 1 + 4 + 5 + 6 = 16   
 * EvenLevelSum = 2 + 3 = 5  
 * Difference = |16 - 5| = 11  
 * *****/
public class DiffOddEven {

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
	
	public DiffOddEven() {
		root = null;
	}
	
	public int difference() {
		
		int oddLevel=0, evenLevel=0, diffOddEven=0;
		int nodesInLevel=0;
		int currentLevel=0;
		
		Queue<Node> queue = new LinkedList<Node>();
		
		if(root == null) {
			System.out.println("List is empty");
			return 0;
		}else {
			queue.add(root);
			currentLevel++;
			
			while(queue.size() != 0) {
				nodesInLevel = queue.size();
				
				while(nodesInLevel > 0) {
					Node current = queue.remove();
					
					if(currentLevel%2==0) {
						evenLevel += current.data;
					}else {
						oddLevel += current.data;
					}
					
					if(current.left != null) {
						queue.add(current.left);
					}
					if(current.right != null) {
						queue.add(current.right);
					}
					nodesInLevel--;
				}
				currentLevel++;
			}
			diffOddEven = Math.abs(oddLevel - evenLevel);
		}
		
		return diffOddEven;
		
	}
	public static void main(String[] args) {
		
		DiffOddEven bt = new DiffOddEven();
		
		bt.root = new Node(1);
		
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		
		bt.root.right.left = new Node(6);
		
		System.out.println("Difference between sum of odd level and even level nodes: "+bt.difference());
	}

}
