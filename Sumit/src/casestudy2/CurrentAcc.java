package casestudy2;

abstract public class CurrentAcc extends BankAcc {
	
	private final float creditlimit; 

	public CurrentAcc(int accNo, String accNm, float accBal, float creditlimit) {
		super(accNo, accNm, accBal);
		this.creditlimit = creditlimit;
		// TODO Auto-generated constructor stub
	}

	public float getCreditlimit() {
		return creditlimit;
	}

	@Override
	public void withdraw (float creditlimit ) {
		super.withdraw(creditlimit);
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
}
