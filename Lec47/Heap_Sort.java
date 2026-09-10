package Lec47;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Heap_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 1, 5, 7 };
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int i = 0;
		while (!pq.isEmpty()) {
			arr[i++] = pq.poll();
		}
		System.out.println(Arrays.toString(arr));

	}

}
