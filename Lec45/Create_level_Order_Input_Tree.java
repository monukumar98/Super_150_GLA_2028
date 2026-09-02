package Lec45;

import java.util.*;
import java.util.Scanner;

public class Create_level_Order_Input_Tree {
	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node root;

	public Create_level_Order_Input_Tree() {
		// TODO Auto-generated constructor stub
		CreateTree();
	}

	private void CreateTree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		Node nn = new Node(item);
		root = nn;
		Queue<Node> q = new LinkedList<>();
		q.add(nn);
		while(!q.isEmpty()) {
			Node r=q.poll();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node n = new Node(c1);
				r.left=n;
				q.add(n);
			}
			if(c2!=-1) {
				Node n = new Node(c2);
				r.right=n;
				q.add(n);
			}
		}

	}

}















