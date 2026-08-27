package Lec44;

public class Binary_Tree_Cameras {

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
		int camera = 0;

		public int minCameraCover(TreeNode root) {

			int x = minCamera(root);
			return x == -1 ? camera + 1 : camera;
		}

		public int minCamera(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int left = minCamera(root.left);
			int right = minCamera(root.right);
			if (left == -1 || right == -1) {
				camera++;
				return 1;// has a camera
			} else if (left == 1 || right == 1) {

				return 0;// Already covered hu me
			} else {
				return -1;// need a camera
			}

		}
	}

}
