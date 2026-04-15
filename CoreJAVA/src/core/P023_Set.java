package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P023_Set {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(12);
		set.add("java");
		set.add(true);
		set.add('h');
		set.add(345.345);
		set.add(346543);
		set.add("user");
		set.add(12);
		System.out.println(set);

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
