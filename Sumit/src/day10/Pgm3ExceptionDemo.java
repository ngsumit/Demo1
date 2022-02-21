package day10;

public class Pgm3ExceptionDemo {
	static void canVote(int age){
			if(age<18)
	   System.out.println("you are not an adult!");
	            		else
			   System.out.println("you can vote!");
		}
		public static void main (String[] args) {
			canVote(20);
			canVote(10);
		}
	

}

