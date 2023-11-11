package observer.stockPrices;

public interface Subject {
	public void regiter(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}
