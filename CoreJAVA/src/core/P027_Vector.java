package core;

import java.util.Enumeration;
import java.util.Vector;

public class P027_Vector {
	public static void main(String[] args) {
		Vector vr = new Vector();
		vr.add(123);
		vr.add("java");
		vr.add(456.345);
		vr.add(false);
		vr.add(3476658);
		vr.add('a');
		System.out.println(vr);

		Enumeration em = vr.elements();
		while (em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
