package dp.solid.dip.solution;

public class DebitCard implements BankCard {

	@Override
	public void doTransaction(long amount) {
		System.out.println("Shopping on Debit card with amount: "+amount);
	}
}
