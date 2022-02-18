package day6;

public class Audi {

	     public final String BRAND = "AUDI";
	    public final String EngineNumber;
	     
	    public Audi(String EngineNumber){
	        this.EngineNumber = EngineNumber;
	    }
	  
	    public static void main(String[] args) {
	        Audi audi = new Audi("ABCD1234CDEF4567");
	        System.out.println("Engine Number : "+audi.EngineNumber);
	        System.out.println("Car Brand : "+audi.BRAND);
	    }
	}
