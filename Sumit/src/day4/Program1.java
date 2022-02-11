package day4;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		 double num1, num2, num3;
		  
	        Scanner in = new Scanner(System.in);
	  
	        System.out.println("Enter the numbers");
	  
	        num1 = in.nextDouble();
	  
	        num2 = in.nextDouble();
	        
	        num3 = in.nextDouble();
	  
	        System.out.println("Enter the operator (+,-,*,/)");
	  
	        char op = in.next().charAt(0);
	  
	        double o = 0;
	  
	        switch (op) {
	  
	        case '+':
	  
	            o = num1 + num2 + num3;
	  
	            break;
	  
	        case '-':
	  
	            o = num1 - num2;
	  
	            break;
	  
	        case '*':
	  
	            o = num1 * num2;
	  
	            break;
	  
	        case '/':
	  
	            o = num1 / num2;
	  
	            break;
	  
	        default:
	  
	            System.out.println("You enter wrong input");
	  
	            break;
	        }
	  
	        System.out.println("The final result:");
	  
	        System.out.println();
	  
	        System.out.println(num1 + " " + op + " " + num2
	                           + " = " + o);

	}

}
