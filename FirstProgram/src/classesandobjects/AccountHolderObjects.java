package classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
		AccountHolder Tom = new AccountHolder();
		AccountHolder Sara = new AccountHolder();
		AccountHolder Kim = new AccountHolder();
		
		Tom.firstName ="Tom";
		Tom.lastName = "Richard";
		Tom.age = 25;
		Tom.accountBalance = 10000;
		Tom.testeligibleForCreditCard();
		System.out.println("Is Tom eligible for CC:"+Tom.eligibleForCreditCard);
		
		Sara.firstName ="Sara";
		Sara.lastName = "Ric";
		Sara.age = 30;
		Sara.accountBalance = 30000;
		Sara.testeligibleForCreditCard();
		System.out.println("Is Sara eligible for CC:"+Sara.eligibleForCreditCard);
		
		Kim.firstName ="Sara";
		Kim.lastName = "Ric";
		Kim.age = 30;
		Kim.accountBalance = 10000;
		Kim.testeligibleForCreditCard();
		System.out.println("Is Kim eligible for CC:"+Kim.eligibleForCreditCard);
		
	}

}
