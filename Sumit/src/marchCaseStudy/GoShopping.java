package marchCaseStudy;

public class GoShopping {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ShopFactory sh = new GSShopFactory();
		PrimeAcc pa = new GSPrimeAcc(2143124,"Savinay",400,true);
		NormalAcc na = new GSNormalAcc(421412414, "Sumit", 400, 200);
		pa.bookProduct(500);
		System.out.println(pa);
		na.bookProduct(500);
		System.out.println(na);
	}

}
