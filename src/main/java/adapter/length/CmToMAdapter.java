package adapter.length;

public class CmToMAdapter implements Centimeter {
	Meter meter;

	public CmToMAdapter(Meter meter) {
		super();
		this.meter = meter;
	}


	@Override
	public int getCm() {
		// TODO Auto-generated method stub
		System.out.println("Adapter: converting meter to CM");
		return meter.getLength()*100;
	}

}
