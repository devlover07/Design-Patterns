package decorator;

//Can only be used as topping
public class VanillaScoop implements Icecream {
	Icecream icecream;

	public VanillaScoop(Icecream icecream) {
		super();
		this.icecream = icecream;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost() + 20;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return icecream.getDescription() + " Vanilla Scoop";
	}

}
