package observer.amazon;

public class SCMNotifier implements OrderPlacedSubscriber {

	@Override
	public ReturnData orderPlacedEvent() {
		ReturnData data = new ReturnData("Notifying all SCMs after order placed");
		System.out.println("SCM Notifier listener - notify SCM");
		return data;
	}
	
}
