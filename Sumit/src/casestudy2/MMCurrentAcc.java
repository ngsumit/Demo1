package casestudy2;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditlimit) {
		super(accNo, accNm, accBal, creditlimit);
		// TODO Auto-generated constructor stub
	}

	
	public void withdraw(float wd) 
	{
		super.withdraw(wd);
	}
		
	public String toString() 
	{
		return super.toString();
	}
}
