package casestudy2;

abstract public class SavingAcc extends BankAcc{
	private boolean isSalaried;
	private static final float MINBAL = 100;

	public SavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) 
	{
		super(AccNo, accNm, accBal);
		this.isSalaried = isSalaried;
		// TODO Auto-generated constructor stub
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public static float getMinbal() {
		return MINBAL;
	}
	
	@Override
	public void withdraw (float MINBAL ) {
		super.withdraw(MINBAL);
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
}
