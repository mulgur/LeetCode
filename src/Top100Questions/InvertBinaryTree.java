package Top100Questions;
/*
 * Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
	
}

public class InvertBinaryTree {



	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		TreeNode Left = invertTree(root.left);
		TreeNode Right = invertTree(root.right);
		
		root.left = Right;
		root.right = Left;
		
		return root;
		


	}

}
