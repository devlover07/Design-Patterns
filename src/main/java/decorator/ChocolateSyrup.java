package decorator;

//Can only be used as topping
public class ChocolateSyrup implements Icecream {
	Icecream icecream;

	public ChocolateSyrup(Icecream icecream) {
		super();
		this.icecream = icecream;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost()+10;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return icecream.getDescription()+" Chocolate Syrup";
	}
}
