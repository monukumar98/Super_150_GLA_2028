package Lec47;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<Integer> pq = new PriorityQueue<>();// min heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());// Max heap
		pq.add(5);
		pq.add(7);
		pq.add(9);
		pq.add(3);
		pq.add(4);
		pq.add(2);
		pq.add(6);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

	}

}
