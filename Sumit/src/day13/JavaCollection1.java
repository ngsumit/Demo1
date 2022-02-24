package day13;

import java.util.Stack;

public class JavaCollection1 {

	public static void main(String[] args) {
		Stack<String> oj = new Stack<>();
		
		oj.push("Rakesh");
		oj.push("Savi");
		oj.push("Akshay");
		oj.push("Sunil");
		oj.push("Shruti");
		
		System.out.println(oj);
		oj.pop();
		System.out.println(oj);
		
	}
	}
