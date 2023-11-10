package strategy.flyingBehaviour;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal sparkey = new Dog();
		Animal tweaty = new Bird();
		
		System.out.println(sparkey.tryToFly());
		System.out.println(tweaty.tryToFly());
	}

}
