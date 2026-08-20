package Lec41;

import java.util.*;

public class Path_Sum_II {
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
		public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
			List<Integer> ll = new ArrayList<>();
			List<List<Integer>> ans = new ArrayList<>();
			hasPath(root, targetSum, ll, ans);
			return ans;
		}

		public boolean hasPath(TreeNode root, int targetSum, List<Integer> ll, List<List<Integer>> ans) {
			if (root == null) {
				return false;
			}
			if (root.left == null && root.right == null) {
				if (root.val - targetSum == 0) {
					ll.add(root.val);
					ans.add(new ArrayList<>(ll));
					ll.remove(ll.size() - 1);

				}
			}
			ll.add(root.val);
			boolean left = hasPath(root.left, targetSum - root.val, ll, ans);
			boolean right = hasPath(root.right, targetSum - root.val, ll, ans);
			ll.remove(ll.size() - 1);
			return left || right;

		}
	}
}
