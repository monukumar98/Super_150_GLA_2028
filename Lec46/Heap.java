package Lec46;

import java.util.*;

public class Heap {
	private ArrayList<Integer> ll = new ArrayList<>();

	public void add(int x) {
		ll.add(x);
		upheafify(ll.size() - 1);
	}

	private void upheafify(int ci) {
		// TODO Auto-generated method stub

		int pi = (ci - 1) / 2;
		if (ll.get(pi) > ll.get(ci)) {
			swap(pi, ci);
			upheafify(pi);
		}

	}

	public int remove() {

		int x = ll.get(0);
		swap(0, ll.size() - 1);
		ll.remove(ll.size() - 1);
		downheapify(0);
		return x;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < ll.size() && ll.get(lci) < ll.get(mini)) {
			mini = lci;
		}
		if (rci < ll.size() && ll.get(rci) < ll.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);
		}

	}
	public void Display() {
		System.out.println(ll);
	}
	public int size() {
		return ll.size();
	}

	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		int ith = ll.get(i);
		int jth = ll.get(j);
		ll.set(i, jth);
		ll.set(j, ith);

	}

}
