package Tree;
/*****
 * we need to create a binary search tree, delete a node from the tree, 
 * and display the nodes of the tree by traversing the tree using in-order traversal. 
 * In in-order traversal, for a given node, first, we traverse the left child then 
 * root then right child (Left -> Root -> Right).
 * 
 * In Binary Search Tree, all nodes which are present to the left of root will be less 
 * than root node and nodes which are present to the right will be greater than the root node.
 * ****/
public class BinarySearchTree {

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
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void insert(int data) {
		
		Node newNode = new Node(data);
		
		if(root == null) {
			root = newNode;
			return;
		}else {
			Node current = root, parent = null;
			while(true) {
				parent = current;
				if(data < current.data) {
					current = current.left;
					if(current == null) {
						parent.left = newNode;
						return;
					}
				}else {
					current = current.right;
					if(current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node minNode(Node root) {
		
		if(root.left != null) 
			return minNode(root.left);
		else
			return root;
	}
	
	public Node deleteNode(Node node, int value) {
		if(node == null) {
			return null;
		}else {
			if(value < node.data) 
				node.left = deleteNode(node.left, value);
			else if(value > node.data)
				node.right = deleteNode(node.right, value);
			else {
				if(node.left == null && node.right == null) {
					node = null;
				} else if(node.left == null) {
					node = node.right;
				} else if(node.right == null) {
					node = node.left;
				} else {
					Node temp = minNode(node.right);
					node.data = temp.data;
					node.right = deleteNode(node.right, temp.data);
				}
			}
			return node;
		}
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
				System.out.print(node.data+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree bt = new BinarySearchTree();

		bt.insert(50);
		bt.insert(30);
		bt.insert(70);
		bt.insert(60);
		bt.insert(10);
		bt.insert(90);
		
		System.out.println("Binary search tree after insertion: ");
		bt.inOrderTraversal(bt.root);
		
		Node deletedNode = null;
		
		deletedNode = bt.deleteNode(bt.root, 90);
		System.out.println("\nBinary search tree after deleteing node 90: ");
		bt.inOrderTraversal(bt.root);
		
		deletedNode = bt.deleteNode(bt.root, 30);
		System.out.println("\nBinary search tree after deleteing node 30: ");
		bt.inOrderTraversal(bt.root);
		
		deletedNode = bt.deleteNode(bt.root, 50);
		System.out.println("\nBinary search tree after deleteing node 50: ");
		bt.inOrderTraversal(bt.root);
		
	}

}
