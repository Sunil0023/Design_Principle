package dp.solid.dip.solution;

public class CebitCard implements BankCard{
	
	@Override
	public void doTransaction(long amount) {
		System.out.println("Shopping on Credit card with amount: "+amount);
	}
}
