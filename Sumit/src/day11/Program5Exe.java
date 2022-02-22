package day11;

public class Program5Exe {
	class Main {
		public static void main (String[] args) {
	         try
	       {
	             System.out.println(4/0);
		 //will not get printed
	             System.out.println("end of try!");
	        }
	catch(ArithmeticException e)
	        {
	            System.out.println("divide by 0");
	        }
	    }
	}
