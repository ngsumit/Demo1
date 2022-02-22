package day11;

public class Program13Exe {
	public static void main (String[] args) {
        try{
            System.out.println(4/0);
            
        }
        catch(Exception e){
        	System.out.println();
        }
        	finally
        {
            System.out.println("cleaning.......");
        }
	}

}
