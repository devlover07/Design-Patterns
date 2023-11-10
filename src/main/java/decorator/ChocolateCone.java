package decorator;

//Can only be used as base and topping both
public class ChocolateCone implements Icecream {
	
	Icecream icecream;
	
	public ChocolateCone() {
		super();
	}
	
	public ChocolateCone(Icecream icecream) {
		super();
		this.icecream = icecream;
	}


	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost() +50;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return icecream.getDescription() + " Chocolate Cone";
	}

}
