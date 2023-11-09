package adapter.length;

public class M implements Meter {
	private int m;
	
	public M(int m) {
		super();
		this.m = m;
	}
	
	public int getLength() {
		return m;
	}

}
