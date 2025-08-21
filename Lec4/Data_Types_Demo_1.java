package Lec4;

import java.util.Scanner;

public class Data_Types_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte b = (byte) (428);// -84
		byte b = (byte) (300);//
		short s = 5;
		int i = 5;
		long l = 5000000000l;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		Scanner sc = new Scanner(System.in);
		b = sc.nextByte();
		s = sc.nextShort();
		i = sc.nextInt();
		l = sc.nextLong();
		byte b1 = -5;

	}

}
