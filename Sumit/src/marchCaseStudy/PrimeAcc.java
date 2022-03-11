package marchCaseStudy;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
    private static final float deliveryCharges = 0;
	PrimeAcc()
	{
		
	}
	
	public PrimeAcc(boolean isPrime) 
	{
		super();
		this.isPrime = isPrime;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	
	
	
	
}
