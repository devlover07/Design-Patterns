package decorator;

public class ChocoChips implements Icecream {
	Icecream icecream;

	public ChocoChips(Icecream icecream) {
		super();
		this.icecream = icecream;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost()+30;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return icecream.getDescription()+" Choco Chips";
	}

}
