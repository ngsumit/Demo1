package casestudy2;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 BankFactory bf = new MMBankFactory();
 SavingAcc sa = new MMSavingAcc(456235,"Sumit",400,true);
 CurrentAcc ca = new MMCurrentAcc(256458,"Slathia",450,1000);
 sa.withdraw(500);
 System.out.println(sa);
 ca.toString();
 System.out.println();
 
	}

}
