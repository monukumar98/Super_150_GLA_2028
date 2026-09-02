package Lec45;

import java.util.*;



public class Recover_Binary_Search_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public void recoverTree(TreeNode root) {
			List<TreeNode> ll = new ArrayList<>();
			Inorder(root, ll);
			TreeNode first = null;
			TreeNode second = null;
			for (int i = 0; i < ll.size()-1; i++) {
				if(ll.get(i).val>ll.get(i+1).val) {
					first=ll.get(i);
					break;
				}	
			}
			for (int i = ll.size()-1; i>0; i--) {
				if(ll.get(i).val<ll.get(i-1).val) {
					second=ll.get(i);
					break;
				}	
			}
			int temp=first.val;
			first.val=second.val;
			second.val=temp;
			
			
		}

		public void Inorder(TreeNode root, List<TreeNode> ll) {
			if (root == null) {
				return;
			}

			Inorder(root.left, ll);
			ll.add(root);
			Inorder(root.right, ll);
		}
	}
}
