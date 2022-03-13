package casestudy2;

public class MMBankFactory extends BankFactory{

	public MMSavingAcc getNewSavingAccount(int AccNo, String AccNm, float accBal, boolean isSalaried) {
		return null;
	}
	
	public MMCurrentAcc getMMCurrentAccount(int AccNo, String AccNm, float accBal, float creditLimit ) {
		return null;
	}
}
