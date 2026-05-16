package Lec38;

public class Cycle_removal {

	private class Node {
		int val;
		Node next;

	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public void addLast(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	private Node getNode(int k) {

		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void CreateCycle() {
		tail.next = getNode(2);
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) {
				return slow;
			}

		}
		return null;
	}

// O(N^2)
	public void removeCycle1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}
	}

	public void removeCycle2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		// cycle ki length
		int m = 1;
		Node temp = meet;
		while (temp.next != null) {
			m++;
			temp = temp.next;
		}
		Node fast= head;
		for (int i = 1; i <=m; i++) {
			fast=fast.next;
		}
		Node slow=head;
		while(slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;
	}
	public void floyedCycleremoval() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node slow=head;
		Node fast=meet;
		while(slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;
	}

	public static void main(String[] args) throws Exception {
		Cycle_removal cl = new Cycle_removal();
		cl.addLast(1);
		cl.addLast(2);
		cl.addLast(3);
		cl.addLast(4);
		cl.addLast(5);
		cl.addLast(6);
		cl.addLast(7);
		cl.addLast(8);
		cl.CreateCycle();
		cl.Display();
	}

}