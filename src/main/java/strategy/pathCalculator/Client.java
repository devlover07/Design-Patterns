package strategy.pathCalculator;

public class Client {

	public static void main(String[] args) {
		String mode = "Bike";
		PathCalculatorStrategy strategy = PathCalculatorFactory.getPathCalculator(mode);
		strategy.findPath("Delhi", "Mumbai");
	}

}
