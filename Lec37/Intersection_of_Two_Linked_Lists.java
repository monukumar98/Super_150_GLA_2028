package Lec37;

public class Intersection_of_Two_Linked_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode AT=headA;
			ListNode ATGF=headB;
			while(AT!=ATGF) {
				if(AT==null) {
					AT=headB;
				}
				else {
					AT=AT.next;
				}
				if(ATGF==null) {
					ATGF=headA;
				}
				else {
					ATGF=ATGF.next;
				}
			}
			return AT;

		}
	}
}

















