package Lec49;

public class HashMap<K, V> {
	class Node<K, V> {
		K Key;
		V value;
		Node next;

		public Node(K key, V value) {
			// TODO Auto-generated constructor stub
			this.Key = key;
			this.value = value;
		}
	}

	private int size;
	private Node[] arr;

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public HashMap(int n) {
		// TODO Auto-generated constructor stub
		arr = new Node[n];
	}

	public void put(K key, V value) {
		int idx = hashfun(key);
		Node temp = arr[idx];
		while (temp != null) {
			if (temp.Key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		temp = arr[idx];
		Node nn = new Node<>(key, value);
		nn.next = temp;
		size++;
		arr[idx] = nn;
		double thf = 2.0;
		double lfa = (1.0 * size) / arr.length;
		if (lfa > thf) {
			rehasing();
		}
	}

	private void rehasing() {
		// TODO Auto-generated method stub
		Node[] new_arr = new Node[2 * size];
		Node[] old_arr = arr;
		arr = new_arr;
		size = 0;
		for (Node n : old_arr) {
			while (n != null) {
				put((K) (n.Key), (V) (n.value));
				n = n.next;

			}
		}

	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("{");
		for (Node n : arr) {
			while (n != null) {
				s = s.append(n.Key + "=" + n.value + ",");
				n = n.next;

			}
		}
		s.append("}");
		return s.toString();
				
	}

	public V get(K key) {
		int idx = hashfun(key);
		Node temp = arr[idx];
		while (temp != null) {
			if (temp.Key.equals(key)) {

				return (V) temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public boolean containsKey(K key) {
		int idx = hashfun(key);
		Node temp = arr[idx];
		while (temp != null) {
			if (temp.Key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V remove(K key) {
		int idx = hashfun(key);
		Node curr = arr[idx];
		Node prev = null;
		while (curr != null) {
			if (curr.Key.equals(key)) {

				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		} else if (prev == null) {
			arr[idx] = curr.next;
		} else {
			prev.next = curr.next;
		}
		curr.next = null;
		size--;
		return (V) curr.value;

	}

	public int hashfun(K key) {
		int idx = key.hashCode() % arr.length;
		if (idx < 0) {
			idx += arr.length;
		}
		return idx;
	}

}
