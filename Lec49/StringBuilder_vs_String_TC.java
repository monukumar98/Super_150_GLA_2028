package Lec49;

public class StringBuilder_vs_String_TC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilderTC();
	//	StringTC();

	}

	public static void StringBuilderTC() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 1000_0000; i++) {
			sb.append(i);

		}
	}

	public static void StringTC() {
		String s = "";
		for (int i = 0; i < 1000_0000; i++) {
			s = s + i;
		}
	}

}



