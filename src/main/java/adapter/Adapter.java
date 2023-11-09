package adapter;

public class Adapter implements AppleCharger {
	AndroidCharger androidCharger;
	
	public Adapter(AndroidCharger androidCharger) {
		this.androidCharger = androidCharger;
	}
	
	@Override
	public void chargeIPhone() {
		// TODO Auto-generated method stub
		androidCharger.androidCharger();
		System.out.println("Your phone is being charger via an adapter!");
	}
	
}
