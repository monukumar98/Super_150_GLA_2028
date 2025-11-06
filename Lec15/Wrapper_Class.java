package Lec15;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1 = 10;
		int a = 10;
		System.out.println(a1);
		System.out.println(a);
		Integer b = a;// Auto-Boxing
		int x = a1;// Un-Boxing
		Integer c1 = 19;
		Integer c2 = 19;
		Integer c3 = 191;
		Integer c4 = 191;
		System.out.println(c1 == c2);
		System.out.println(c4 == c3);
		Boolean b1=false;
		Boolean b2=false;
		System.out.println(b1==b2);
		Character ch1='z';
		Character ch2='z';
		System.out.println(ch1==ch2);
	}

}
