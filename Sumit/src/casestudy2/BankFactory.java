package casestudy2;

abstract public class BankFactory {

	public SavingAcc getnewSavingAccount(int AccNo, String AccNm, float accBal, boolean isSalaried) {
		return null;
	}
	
	public CurrentAcc getnewCurrentAccount(int AccNo, String AccNm, float accBal, float creditLimit ) {
		return null;
	}
}
