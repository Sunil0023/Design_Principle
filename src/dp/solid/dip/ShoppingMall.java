package dp.solid.dip;

public class ShoppingMall {

	static DebitCard dCard;
	//If want to use Credit card then all references need to change 

	public ShoppingMall(DebitCard dCard) {
		super();
		this.dCard = dCard;
	}
	
	public static void doPurchase(long amount) {
		dCard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
		ShoppingMall sMall =new ShoppingMall(new DebitCard());
		doPurchase(2000);
	}
}
