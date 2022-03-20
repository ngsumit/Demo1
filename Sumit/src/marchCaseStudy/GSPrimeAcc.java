package marchCaseStudy;

public class GSPrimeAcc extends PrimeAcc
{
	
private static final float Charges = 100;

public GSPrimeAcc(int AccNo,String accNm,float charges,boolean isPrime)
{
	super(AccNo, accNm, charges, isPrime);
}

public void bookProduct(float bp) {
	super.bookProduct(bp);
}
	
public String toString() {
	return super.toString();
}
	}


