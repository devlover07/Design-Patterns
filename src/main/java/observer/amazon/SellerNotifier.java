package observer.amazon;

public class SellerNotifier implements OrderPlacedSubscriber {

	@Override
	public ReturnData orderPlacedEvent() {
		ReturnData data = new ReturnData("Notifying all Sellers after order placed!");
		System.out.println("SellerNotifier listener - notify Seller");
		return data;
	}
	
}
