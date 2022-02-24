package day14;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class JavaCollections {
	
		void Display(List<String> list) {
		Iterator<String> obj = list.iterator();
    while(obj.hasNext()) {
		System.out.println("Element is:"+ obj.next());
	}
	}
		
	public static void main(String[]args) {
		List<String> oj = new LinkedList<>();
		oj.add("JBJKBJK");
		oj.add("ABC");
		oj.add("RAKA");
		oj.add("XYZ");
		oj.add("VNKY");
		System.out.println("Element is:"+ oj);
		
		JavaCollections jc = new JavaCollections();
		jc.Display(oj);
}
}

