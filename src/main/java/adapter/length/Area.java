package adapter.length;

public class Area {
	private Centimeter length;

	public Area(Centimeter length) {
		super();
		this.length = length;
	}
	
	public void areaIs() {
		System.out.println("Area is: "+length.getCm()*length.getCm()+" cm square");
	}
	
}
