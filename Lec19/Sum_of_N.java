package Lec19;

public class Sum_of_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;

	}
	public static int Sum(int n) {
		if(n==0) {
			return 0;
		}
		int s=Sum(n-1);
		return s+n;
	}

}
