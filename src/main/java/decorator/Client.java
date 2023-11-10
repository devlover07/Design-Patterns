package decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icecream icecream = new ChocoChips(
								new VanillaScoop(
										new ChocolateCone(
												new ChocolateSyrup(
														new OrangeCone()))));
		
		System.out.println(icecream.getCost());
		System.out.println(icecream.getDescription());
	}

}
