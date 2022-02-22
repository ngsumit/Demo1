package day11;

public class Program2EXe {
	
		public static void main (String[] args) {
			int a=10;
			for(int i=3;i>=1;i--)
			   try{
			     System.out.println(a/i);  
			   }catch(ArithmeticException e){
			       System.out.println(e);
			   }
		}
	}

	