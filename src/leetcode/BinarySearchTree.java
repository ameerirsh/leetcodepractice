package leetcode;

public class BinarySearchTree {
	static BinarySearchTreeNode root=null;
	public class BinarySearchTreeNode{
		int key;
		BinarySearchTreeNode left;
		BinarySearchTreeNode right;
		
		public BinarySearchTreeNode(int k)
		{
			this.key=k;
			this.left=null;
			this.right=null;
		}
	}
	
	public BinarySearchTree(){
		root=null;
	}
	
	
		public void insert(int key)
		{
			root=insertRec(root, key);
		}
		private BinarySearchTreeNode insertRec(BinarySearchTreeNode root,
				int key) {
			// TODO Auto-generated method stub
			if(root==null)
			{
				root=new BinarySearchTreeNode(key);
				return root;
			}
			else if(key<root.key)
			{
				root.left=insertRec(root.left,key);
			}
			else if(key>root.key)
			{
				root.right=insertRec(root.right,key);
			}
			return root;
		}
		
		public void inorder()
		{
			inorderRec(root);
		}
		
		public void inorderRec(BinarySearchTreeNode root)
		{
			if(root!=null)
			{
				inorderRec(root.left);
				System.out.print(root.key+" ");
				inorderRec(root.right);
			}
			//System.out.println();
		}
		
	public static void main(String args[])
	{
		/* Let us create following BST
        50
     /     \
    30      70
   /  \    /  \
  20   40  60   80 */
		
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);
		bst.insert(90);
		
		bst.inorder();
		bst.maximumDepth();
		bst.minimumDepth();
		bst.printUpSideDown();
		bst.inorder();
	}


	private void printUpSideDown() {
		invertTree(root);
		// TODO Auto-generated method stub
		
		
		
	}


	private BinarySearchTreeNode invertTree(BinarySearchTreeNode root) {
		
		// TODO Auto-generated method stub
		BinarySearchTreeNode temp;
		if(root==null)
			return root;
		temp=root.left;
		root.left=root.right;
		root.right=temp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
		
		
	}


	private void minimumDepth() {
		// TODO Auto-generated method stub
		int minDepth=minDepth(root);
		System.out.println("minimum depth is :"+minDepth);
		
	}


	private int minDepth(BinarySearchTreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		return 1+Math.min(minDepth(root.left), minDepth(root.right));
	}


	private void maximumDepth() {
		// TODO Auto-generated method stub
		int maxDepth=maxDepth(root);
		System.out.println("maximum depth is   :"+maxDepth);
	}


	private int maxDepth(BinarySearchTreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return 0;
		}
		return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
		
	}
}
