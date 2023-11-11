package observer.stockPrices;

public class GoogleObserver implements Observer {
	private double googPrice;
	
	StockGrabber stockGrabber;
	
	public GoogleObserver(StockGrabber stockGrabber) {
		this.stockGrabber = stockGrabber;
		stockGrabber.regiter(this);
	}

	@Override
	public void update() {
		this.googPrice = stockGrabber.getGOOGPrice();
		printThePrice();
	}
	
	public void printThePrice() {
		System.out.println("Google Price: "+googPrice);
	}

}
