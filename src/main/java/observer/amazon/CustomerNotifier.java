package observer.amazon;

public class CustomerNotifier implements OrderPlacedSubscriber, OrderCancelledSubscriber{

	@Override
	public ReturnData orderPlacedEvent() {
		ReturnData data = new ReturnData("Notifying all Customers after order placed!");
		System.out.println("CustomerNotifier listener - notify Custormers");
		return data;
	}

	@Override
	public ReturnData orderCancelledEvent() {
		ReturnData data = new ReturnData("Notifying all Customers after order cancelled!");
		System.out.println("Cancelling: CustomerNotifier listener - notify Custormers");
		return data;
	}
	
}
