package dp.solid.dip.solution;

public class ShoppingMall {

	//Use BankCard Interface, So no need to change here 
	static BankCard dCard;

	public ShoppingMall(BankCard dCard) {
		super();
		ShoppingMall.dCard = dCard;
	}

	public void doPurchase(long amount) {
		dCard.doTransaction(amount);
	}

	public static void main(String[] args) {
		//Use Debitcard class
		ShoppingMall shoppingDCard = new ShoppingMall(new DebitCard());
		shoppingDCard.doPurchase(4000);

		//Use CreditCard class
		ShoppingMall shoppingCCard = new ShoppingMall(new CebitCard());
		shoppingCCard.doPurchase(2000);
	}
}
