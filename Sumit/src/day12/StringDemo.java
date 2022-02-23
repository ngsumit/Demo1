package day12;

public class StringDemo {
public static void main(String[] args) {
String s = "Hello";
System.out.println("Print 1st String: s");
System.out.println("Length of 1st String: "+ s.length());

String s1 = new String("World");
System.out.println("String 2nd String: "+ s1);
s.concat(s1);
System.out.println("Concat 1st & 2nd String: "+ s);

String s2 = s.concat(s1);
System.out.println("Concat 1st and 2nd String: "+ s2);
}
}


