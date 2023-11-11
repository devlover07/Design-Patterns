package observer.stockPrices;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockGrabber stockGrabber = new StockGrabber();
		
		IBMObserver ibmObserver = new IBMObserver(stockGrabber);
		stockGrabber.setIBMPrice(100.0);
		
		AppleObserver aaplObeserver = new AppleObserver(stockGrabber);
		stockGrabber.setAAPLPrice(200.0);
		
		GoogleObserver googObserver = new GoogleObserver(stockGrabber);
		stockGrabber.setGOOGPrice(300.0);
		
		stockGrabber.notifyObserver();
		
	}

}
