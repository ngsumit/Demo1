package marchCaseStudy;

public class GSNormalAcc extends NormalAcc 
{
	
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}
	public void bookProduct(float bp) {
		super.bookProduct(bp);
	}
		
	public String toString() {
		return super.toString();
	}
}
