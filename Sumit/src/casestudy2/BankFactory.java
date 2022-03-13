package casestudy2;

abstract public class BankFactory {

	public SavingAcc getSavingAccount(int AccNo, String AccNm, float accBal, boolean isSalaried) {
		return null;
	}
	
	public CurrentAcc getCurrentAccount(int AccNo, String AccNm, float accBal, float creditLimit ) {
		return null;
	}
}
