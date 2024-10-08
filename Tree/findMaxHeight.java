package Tree;

public class findMaxHeight {

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
	
	public findMaxHeight() {
		root = null;
	}
	
	public int findHeight(Node temp) {
		
		if(root == null) {
			System.out.println("Tree is empty");
			return 0;
		}else {
			int leftHeight=0, rightHeigth=0;
			
			if(temp.left != null) {
				leftHeight = findHeight(temp.left);
			}
			
			if(temp.right != null) {
				rightHeigth = findHeight(temp.right);
			}
			
			int max = (leftHeight > rightHeigth) ? leftHeight : rightHeigth;
			
			return (max + 1); 	//Calculate the total height of tree by adding height of root  
		}	
	}
	
	public static void main(String[] args) {
		
		findMaxHeight bt = new findMaxHeight();

		bt.root = new Node(1);
		
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		
		bt.root.left.left = new Node(4);
		
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		
		bt.root.right.right.right= new Node(9);  
	    bt.root.right.right.right.right = new Node(8);  
		
		
		System.out.println("Maximum height of given binary tree: "+bt.findHeight(bt.root));

	}

}
