package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//collection - framework that provides architecture to manipulate group of objects
//List,Set,Map
public class P021_List {
	public static void main(String[] args) {
		// <generics>
//		ArrayList list = new ArrayList();
		List list = new ArrayList();
		list.add(1);
		list.add("java");
		list.add(345.345);
		list.add(false);
		list.add('f');
		list.add(24576876987l);
		list.add(1);
		System.out.println(list);
		list.add(2345.345);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(3);
		System.out.println(list);
		System.out.println(list.size());
		list.set(5, "user");
		System.out.println(list);
		list.add(1);
		System.out.println(list);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
