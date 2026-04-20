package core;

public class P003_TypeCasting {
	public static void main(String[] args) {
		// 1.implicit -> by compiler
		int i = 12;// 4
		System.out.println(i);
		double d = i;// 8
		System.out.println(d);

		// 2.explicit -> by user
		double d1 = 345.45;// 8
		int a = (int) d1;// 4
		System.out.println(a);

		int p = 12;
		String ss = String.valueOf(p);

		Integer i1 = new Integer(2342);

		String s = "12";
		int s1 = Integer.parseInt(s);
		double d2 = Double.parseDouble(s);
	}
}
