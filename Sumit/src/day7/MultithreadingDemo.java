package day7;

class MultithreadingDemo extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
MultithreadingDemo t1=new MultithreadingDemo();  
t1.start();  
 }  
}  