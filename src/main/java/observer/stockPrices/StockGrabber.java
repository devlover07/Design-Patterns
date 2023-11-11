package observer.stockPrices;

import java.util.ArrayList;

public class StockGrabber implements Subject {
	
	public ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber() {
		observers = new ArrayList<>();
	}

	@Override
	public void regiter(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void unregister(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o: observers) {
			o.update();
		}
	}
	
	public double getIBMPrice() {
		return ibmPrice;
	}
	
	public void setIBMPrice(double newIBMPrice) {
		this.ibmPrice = newIBMPrice;
//		notifyObserver();
	}
	
	public void setAAPLPrice(double newAAPLPrice) {
		this.aaplPrice = newAAPLPrice;
//		notifyObserver();
	}
	
	public double getAAPLPrice() {
		return aaplPrice;
	}
	
	public void setGOOGPrice(double newGOOGPrice) {
		this.googPrice = newGOOGPrice;
//		notifyObserver();
	}
	
	public double getGOOGPrice() {
		return googPrice;
	}

}
