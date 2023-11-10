package strategy.pathCalculator;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {

	@Override
	public void findPath(String source, String destination) {
		System.out.println("Walk: "+source+" to "+destination);
	}
	
}
