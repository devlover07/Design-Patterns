package adapter.length;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meter m = new M(10);
		CmToMAdapter adapter = new CmToMAdapter(m);
		Area area = new Area(adapter);
		area.areaIs();
	}

}
