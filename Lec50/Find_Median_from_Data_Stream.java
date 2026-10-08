package Lec50;

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_Median_from_Data_Stream {
	class MedianFinder {
		PriorityQueue<Integer> min;
		PriorityQueue<Integer> max;

		public MedianFinder() {
			min = new PriorityQueue<>();
			max = new PriorityQueue<>(Collections.reverseOrder());
		}

		public void addNum(int num) {

			max.add(num);
			min.add(max.poll());
			if (min.size() > max.size()) {
				max.add(min.poll());
			}

		}

		public double findMedian() {
			return max.size() > min.size() ? max.peek() : (max.peek() + min.peek()) / 2.0;
		}
	}

}
