package Tree;

import java.util.Arrays;

import DoublyLinkedList.BinaryTreeToDLL.Node;

/*******
 * A tree is said to be the binary tree if each of the nodes has at most two children. 
 * Whereas, the binary search tree is the special case of the binary tree in which all 
 * the nodes to the left of root node should be less than root node and nodes to the 
 * right should be greater than root node.
 * 
 * This problem can be resolved by converting given binary tree to its corresponding array representation. 
 * Sort the array. 
 * Calculate the middle node from array elements as it will become the root node of the corresponding binary search tree.
 * *********/
public class ConvertBTtoBST {

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
	int[] treeArray;
	int index = 0;
	
	public ConvertBTtoBST() {
		root = null;
	}
	
	public Node convertBTBST(Node node) {
		
		int treeSize = calculateSize(node);
		treeArray = new int[treeSize];
		
		convertBTtoArray(node);
		Arrays.sort(treeArray);
		
		Node d = createBST(0, treeArray.length-1);
		
		return d;
	}
	
	public int calculateSize(Node node) {
		int size=0;
		if(node == null)
			return 0;
		else
			size = calculateSize(node.left) + calculateSize(node.right) + 1;
			return size;
	}
	
	public void convertBTtoArray(Node node) {
		if(node == null) {
			System.out.println("Tree is empty");
			return;
		}else {
			if(node.left != null) {
				convertBTtoArray(node.left);
			}
			treeArray[index] = node.data;
			index++;
			if(node.right != null) {
				convertBTtoArray(node.right);
			}
		}
	}
	
	public Node createBST(int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		
		Node node = new Node(treeArray[mid]);
		
		node.left = createBST(start, mid - 1);
		node.right = createBST(mid + 1, end);
		
		return node;
		
	}
	
	public void inOrderTraversal(Node node) {
		if(node == null) {
			System.out.println("Tree is empty");
			return;
		}else {
			if(node.left != null) {
				inOrderTraversal(node.left);
				System.out.print(node.data+" ");
			}
			if(node.right != null) {
				inOrderTraversal(node.right);
			}
		}
	}
	
	public static void main(String[] args) {
		
		ConvertBTtoBST bt = new ConvertBTtoBST();

		bt.root = new Node(1);
		
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		
		System.out.println("Inorder representation of binary tree: ");
		bt.inOrderTraversal(bt.root);
		
		Node bst = bt.convertBTBST(bt.root);
		
		System.out.println("\nInorder representation of binary search tree: ");
		bt.inOrderTraversal(bst);
	}

}
