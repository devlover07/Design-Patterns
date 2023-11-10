package strategy.flyingBehaviour;

public class Bird extends Animal {
	public Bird() {
		super();
		
		setSound("Tweat");
		
		flyingType = new ItFlys();
	}
}
