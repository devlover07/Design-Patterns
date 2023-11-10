package strategy.pathCalculator;

public class PathCalculatorFactory {
	public static PathCalculatorStrategy getPathCalculator(String mode) {
		switch(mode) {
		case "Walk": return new WalkPathCalculatorStrategy();
		case "Bike": return BikePathCalculatorStrategy.getInstance();
		case "Car": return CarPathCalculatorStrategy.getInstance();
		}
		return null;
	}
}
