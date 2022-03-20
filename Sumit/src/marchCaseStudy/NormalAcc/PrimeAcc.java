package marchCaseStudy;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
    private final static float deliveryCharges =100;
	PrimeAcc()
	{
		
	}
	public PrimeAcc(boolean isPrime) {
		super();
		this.isPrime = isPrime;
	}
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	public boolean getIsPrime() 
	{
		return isPrime;
	}
	
	public float getDeliveryCharges()
	{
		return deliveryCharges;
	}
	public static float getDeliverycharges() {
		return deliveryCharges;
	}
	
	@Override
	public void bookProduct(float deliverycharges) 
	{
		super.bookProduct(deliverycharges);
	}
	
	@Override
	public String toString()
	{
		return "["+isPrime+","+deliveryCharges+"]";
	}
	}


	
