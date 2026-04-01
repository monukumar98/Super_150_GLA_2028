package Lec32;

import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		System.out.println(st.capacity());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		st.push(90);
		st.push(100);
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());
		for(int x:st) {
			System.out.print(x+" ");
		}

	}

}










