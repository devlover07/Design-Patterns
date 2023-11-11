package observer.amazon;

public class ReturnData {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ReturnData(String data) {
		super();
		this.data = data;
	}

	public ReturnData() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return data;
	}
}
