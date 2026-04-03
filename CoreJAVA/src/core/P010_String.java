package core;

public class P010_String {
	public static void main(String[] args) {
		char c[] = { 'j', 'a', 'v', 'a' };
		System.out.println(c);
		String s = "java technology is best to learn";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.contains("technology "));
		System.out.println("starts with : " + (s.startsWith("jav")));
		String s1 = "java";
		System.out.println(s1.toUpperCase());
		String s2 = "java";
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3 = new String("java");
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		String s4 = "		jav a				";
		System.out.println(s4.trim());
		String s5 = " ";
		System.out.println(s5.isBlank());
		System.out.println(s5.isEmpty());
	}

}
