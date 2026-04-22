package core;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P028_TreeSet {
	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(12);
		set.add(987);
		set.add(798);
		set.add(-74);
		set.add(-345);
		set.add(346543);
		set.add(0);
		set.add(10);
		System.out.println(set);

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
