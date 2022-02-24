package day13;

import java.util.LinkedList;

public class JavaCollection7 {
	public static void main(String[]args) {
		LinkedList<Integer> oj = new LinkedList<>();
		oj.add(10);
		oj.add(40);
		oj.add(20);
		oj.add(30);
		oj.add(60);
		
		System.out.println(oj);
		oj.addFirst(100);
		System.out.println(oj);
		oj.addLast(200);
		System.out.println(oj);
		oj.set(3,90);
		System.out.println(oj);
	
	}
}
