package day10;

import java.io.*;

	class Pgm6 {
	  public static void findFile() throws FileNotFoundException {

	       File newFile = new File("test.txt");
	    FileInputStream stream = new FileInputStream(newFile);
	  }

	  public static void main(String[] args) 
	 {
	    System.out.println("Print the exception");
	  }
	}

