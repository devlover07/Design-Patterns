package observer.stockPrices;

public class IBMObserver implements Observer {
	private double ibmPrice;
	
	StockGrabber stockGrabber;
	
	public IBMObserver(StockGrabber stockGrabber) {
		this.stockGrabber = stockGrabber;
		stockGrabber.regiter(this);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.ibmPrice = stockGrabber.getIBMPrice();
		printThePrice();
	}
	
	public void printThePrice() {
		System.out.println("IBM Price: "+ibmPrice);
	}

}
