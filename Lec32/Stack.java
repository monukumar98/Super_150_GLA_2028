package Lec32;

public class Stack {
	private int[] arr;
	private int idx = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	// O(1)
	public boolean isEmpty() {
		return idx == -1;
	}
	// O(1)
	public boolean isfull() {
		return size()==arr.length;
	}
	// O(1)
	public void push(int x)throws Exception {
		if(isfull()) {
			throw new Exception("Bklol tera Stack kb ka full hogaya hai ");
		}
		arr[++idx]=x;
	}
	// O(1)
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol tera Stack kb ka Empty hai ");
		}
		return arr[idx--];
	}
	
	// O(1)
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol tera Stack kb ka Empty hai ");
		}
		return arr[idx];
	}
	public void Display() {
		for (int i = 0; i <=idx; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	// O(1)
	public int size() {
		return idx+1;
	}

}




