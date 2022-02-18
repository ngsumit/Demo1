package day6;
public class FinalDemo{  
	 final int speedlimit=90;//final variable  
	 void run(){  
	  speedlimit=90;  
	 }  
	 public static void main(String args[]){  
		 FinalDemo obj=new  FinalDemo();  
	 obj.run();  
	 }  
	}