package decorator;

//can be only used as a base not topping
public class OrangeCone implements Icecream {

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Orange Cone";
	}

}
