package observer.amazon;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon a = new Amazon();
		
		CustomerNotifier customerNotifier = new CustomerNotifier();
		SCMNotifier scmNotifier = new SCMNotifier();
		SellerNotifier sellerNotifier = new SellerNotifier();
		
		a.registerOrderPlacedSubscriber(customerNotifier);
		a.registerOrderPlacedSubscriber(scmNotifier);
		a.registerOrderPlacedSubscriber(sellerNotifier);
		
		a.registerOrderCancelledSubscriber(customerNotifier);
		
		a.orderPlacedEvent();
		a.orderCancelledEvent();
	}

}
