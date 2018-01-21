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
				System.out.println(root.key);
				inorderRec(root.right);
			}
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
		
		bst.inorder();
	}
}
