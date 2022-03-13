package casestudy2;

public class MMSavingAcc extends SavingAcc{

	private static final float MINBAL = 100;
	
	public MMSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		super(AccNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withdraw(float MINBAL) 
	{
		super.withdraw(MINBAL);
	}
		
	public String toString() 
	{
		return super.toString();
	}
	
}
