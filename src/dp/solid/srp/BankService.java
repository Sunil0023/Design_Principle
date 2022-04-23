package dp.solid.srp;

public class BankService {
	
	public long deposite(long amoubnt, String accountNo){
		//create deposte logic
		return 0;
	}
	
	public long withdraw(long amoubnt, String accountNo){
		//create withdraw logic
		return 0;
	}
	
	//Move to PrintService class
	public void printPassBook() {
		//print assbook logic
	}

	//Move to LoanService class
	public void getLoanInfo() {
		//car loan
		//home loan
		//personal loan
	}
	
	//Move to Notification class
	public void sendOtp(String medium) {
		if(medium.equals("email")) {
			//send OTP logic
		}
	}

}
