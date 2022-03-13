package casestudy2;

public abstract class BankAcc {

	private int accNo;
	private String accNm;
	private float accBal;
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	public void withdraw(float accBal)
	{
		this.accBal = accBal;
	}
	
	
	public void items(float accBal)
	{
		this.accBal = accBal;
	}
	
	
	@Override
	public String toString()
	{
		return "["+this.accNm+","+this.accNo+","+this.accBal+"]";
	}
}
