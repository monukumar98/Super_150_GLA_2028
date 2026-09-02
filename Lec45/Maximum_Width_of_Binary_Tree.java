package Lec45;

import java.util.*;

public class Maximum_Width_of_Binary_Tree {
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
		public int widthOfBinaryTree(TreeNode root) {
			Queue<Pair> q = new LinkedList<>();
			q.add(new Pair(root, 0));
			int width = 0;
			while (!q.isEmpty()) {
				Pair start = q.peek();
				int s = q.size();
				Pair end = start;
				for (int i = 0; i < s; i++) {
					Pair r = q.poll();
					end = r;
					if (r.node.left != null) {
						q.add(new Pair(r.node.left, 2 * r.c + 1));
					}
					if (r.node.right != null) {
						q.add(new Pair(r.node.right, 2 * r.c + 2));
					}
				}
				// width
				width = Math.max(width, end.c - start.c + 1);
			}
			return width;

		}

		class Pair {
			TreeNode node;
			int c;

			public Pair(TreeNode node, int c) {
				// TODO Auto-generated constructor stub
				this.node = node;
				this.c = c;
			}
		}
	}

}
