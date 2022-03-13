package marchCaseStudy;

public abstract class ShopFactory {
	
	public PrimeAcc getNewPrimeAcc(int AccNo, String AccNm, float charges, boolean isPrime) {
		return null;
	}
	
	public NormalAcc getNormalAcc(int AccNo, String AccNm, float charges, float deliverCharges) {
		return null;
	}

}
