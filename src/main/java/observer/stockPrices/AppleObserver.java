package observer.stockPrices;

public class AppleObserver implements Observer {
	private double aaplPrice;
	
	StockGrabber stockGrabber;

	public AppleObserver(StockGrabber stockGrabber) {
		this.stockGrabber = stockGrabber;
		stockGrabber.regiter(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		aaplPrice = stockGrabber.getAAPLPrice();
		printThePrice();
	}
	
	public void printThePrice() {
		System.out.println("Apple Price: "+aaplPrice);
	}

}
