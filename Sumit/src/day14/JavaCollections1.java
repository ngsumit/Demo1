package day14;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class JavaCollections1 {
	
		void Display(List<String> list) {
		Iterator<String> obj = list.listIterator();
    while(obj.hasNext()) {
		System.out.println("Element is:"+ obj.next());
	}
	}
		
	public static void main(String[]args) {
		List<String> oj = new LinkedList<>();
		oj.add("Sumit");
		oj.add("ABC");
		oj.add("RAKA");
		oj.add("XYZ");
		oj.add("VNKY");
		System.out.println("Element is:"+ oj);
		
		JavaCollections1 jc = new JavaCollections1();
		oj.sort(null);
		jc.Display(oj);
		System.out.println("*******************************");
		Collections.reverse(oj);
		jc.Display(oj);
}
}