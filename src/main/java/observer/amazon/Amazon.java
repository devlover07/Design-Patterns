package observer.amazon;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
	private List<OrderPlacedSubscriber> orderPlacedSubscribers;
	private List<OrderCancelledSubscriber> orderCancelledSubscribers;
	
	private static Amazon instance;

	public Amazon() {
		orderPlacedSubscribers = new ArrayList<>();
		orderCancelledSubscribers = new ArrayList<>();
	}
	
	public static Amazon getInstance() {
		if(instance == null) {
			synchronized (Amazon.class) {
				if(instance == null) {
					instance = new Amazon();	
				}
			}
		}
		return instance;
	}
	
	public void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
		orderPlacedSubscribers.add(orderPlacedSubscriber);
	}
	
	public void unregisterOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
		orderPlacedSubscribers.remove(orderPlacedSubscriber);
	}
	
	public void registerOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber) {
		orderCancelledSubscribers.add(orderCancelledSubscriber);
	}
	
	public void unregisterOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber) {
		orderCancelledSubscribers.add(orderCancelledSubscriber);
	}
	
	public void orderPlacedEvent() {
		for(OrderPlacedSubscriber o: orderPlacedSubscribers) {
			System.out.println(o.orderPlacedEvent());
		}
	}
	
	public void orderCancelledEvent() {
		for(OrderCancelledSubscriber o: orderCancelledSubscribers) {
			o.orderCancelledEvent();
		}
	}
}
