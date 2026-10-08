package Lec50;

import java.util.*;

import Lec50.Top_view_of_binary_tree.Pair;

public class Top_view_of_binary_tree {
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
		public List<Integer> TopView(TreeNode root) {
			Queue<Pair> q = new LinkedList<>();
			TreeMap<Integer, Integer> map = new TreeMap<>();
			q.add(new Pair(root, 0));
			while(!q.isEmpty()) {
				Pair rp = q.poll();
				if(!map.containsKey(rp.vt)) {
					map.put(rp.vt, rp.node.val);
				}
				if(rp.node.left!=null) {
					q.add(new Pair(rp.node.left, rp.vt-1));
				}
				if(rp.node.right!=null) {
					q.add(new Pair(rp.node.right, rp.vt+1));
				}
			}
			List<Integer> ll = new ArrayList<>();
			for(int k:map.keySet()) {
				ll.add(map.get(k));
			}
			return ll;

		}
	}
	class Pair{
		TreeNode node;
		int vt;
		public Pair(TreeNode node,int vt) {
			// TODO Auto-generated constructor stub
			this.node=node;
			this.vt=vt;
		}
	}
}

















