package adapter.mobile;

public class Iphone15 {
	AppleCharger appleCharger;
	
	public Iphone15(AppleCharger appleCharger) {
		this.appleCharger = appleCharger;
	}
	
	public void chargeIPhone() {
		appleCharger.chargeIPhone();
	}
}
