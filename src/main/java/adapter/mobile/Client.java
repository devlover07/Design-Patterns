package adapter.mobile;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ACharger aCharger = new ACharger();
		Adapter adapter = new Adapter(aCharger);
		AppleCharger charger = adapter;
		Iphone15 iPhone = new Iphone15(charger);
		
		iPhone.chargeIPhone();
	}

}
